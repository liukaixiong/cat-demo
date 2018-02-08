package com.elab.cat.catdemo.aop;

import com.alibaba.fastjson.JSON;
import com.dianping.cat.Cat;
import com.dianping.cat.message.Transaction;
import org.apache.log4j.Logger;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;
import java.util.Random;

@Aspect
@Component
public class CatAopService {

    private final Logger logger = Logger.getLogger(CatAopService.class);

    // and @annotation(com.elab.cat.catdemo.aop.CatAnnotation)
    @Around(value = "execution(* com.elab.cat.catdemo.service..*(..))")
    public void aroundMethod(ProceedingJoinPoint pjp) {
        MethodSignature joinPointObject = (MethodSignature) pjp.getSignature();
        Method method = joinPointObject.getMethod();
        Class<?> targetClass = pjp.getTarget().getClass();
        boolean flag = targetClass.isAnnotationPresent(CatAnnotation.class);
        String value = targetClass.getAnnotation(CatAnnotation.class).value();
        logger.info(" 开始执行方法 " + method.getName());
        if (flag) {
            Random random = new Random();
            int i = random.nextInt(10);

            Transaction t = Cat.newTransaction(value, method.toString());
            logger.info("参数:" + JSON.toJSONString(pjp.getArgs()));
            System.out.println("======================method==================" + method.toString());
            Object proceed = null;
            try {
                proceed = pjp.proceed();
                t.setStatus(Transaction.SUCCESS);
                t.complete();
//                t.complete();
            } catch (Throwable e) {
                t.setStatus(e);
                logger.error("["+value+"]", e);
                t.complete();
            } finally {
//                t.complete();
                logger.info(" 结束执行方法 " + method.getName() + " \t 出参:" + proceed);
            }
        } else {
            try {
                pjp.proceed();
            } catch (Throwable e) {
            }
        }
    }

}
