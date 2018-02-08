package com.elab.cat.catdemo.service.impl;

import com.alibaba.fastjson.JSON;
import com.dianping.cat.Cat;
import com.dianping.cat.message.Transaction;
import com.dianping.cat.message.spi.MessageTree;
import com.elab.cat.catdemo.aop.CatAnnotation;
import com.elab.cat.catdemo.dao.TestMapping;
import com.elab.cat.catdemo.dao.ZhQuestionMapping;
import com.elab.cat.catdemo.model.ParamsModel;
import com.elab.cat.catdemo.model.ZhQuestion;
import com.elab.cat.catdemo.service.ITestService;
import com.elab.cat.catdemo.service.ITransactionService;
import com.elab.cat.catdemo.utils.AuthorConstans;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Random;

/**
 * @author Liukx
 * @create 2018-02-06 14:43
 * @email liukx@elab-plus.com
 **/
@Service
@CatAnnotation(AuthorConstans.liukx)
public class TestServiceImpl implements ITestService {

    protected final Log logger = LogFactory.getLog(this.getClass());

    @Autowired
    private TestMapping testMapping;

    @Autowired
    private ZhQuestionMapping zhQuestionMapping;

    @Autowired
    private ITransactionService transactionService;


    @Override
    public String getError(int i) throws Exception {
        ZhQuestion question = new ZhQuestion();
        question.setId(31);
        List<ZhQuestion> zhQuestions = zhQuestionMapping.selectByList(question);
        Random random = new Random();
//        int i = random.nextInt(20);
        Exception exception = null;
        if (i == 1) {
            int count = 1 / 0;
        } else if (i == 2) {
            String xml[] = new String[2];
            System.out.println(xml[3]);
        } else if (i == 3) {
            String a = null;
            a.toCharArray();
        } else if (i == 4) {
            throw new ClassCastException("类转换异常");
        } else if (i == 5) {
            throw new NumberFormatException("数字转换异常");
        } else if (i == 6) {
            throw new NoSuchMethodException("方法没有找到");
        } else if (i == 7) {
            throw new ArrayStoreException("ArrayStoreException");
        } else if (i == 8) {
            throw new ClassNotFoundException("类没有找到");
        } else if (i == 9) {
            throw new IllegalAccessException("IllegalAccessException");
        } else if (i == 10) {
            throw new UnsupportedOperationException("UnsupportedOperationException");
        } else {
            logger.info(" 执行完毕咯 .. " + i);
        }
        return JSON.toJSONString(zhQuestions);
    }


    @Override
    public String getEvent() throws Exception {
        Random random = new Random();
        int count = random.nextInt(10);
        logger.info(" 这个event方法执行了 , 随机数 : " + count);
        return "OK";
    }

    @Override
    public String getTransaction(String index, int errorNo) throws Exception {
        Random random = new Random();
        int count = random.nextInt(10);
        if (index.equals("0")) {
            getError(errorNo);
        } else {
            logger.info(" 这个getTransaction方法执行了 , 随机数 : " + count);
            ParamsModel model = new ParamsModel();
            model.setErrorNo(errorNo);
            model.setIndex(index);
            transactionService.getTransactionList(model);
        }
        return "OK";
    }

    private void sendCatMsg(String method, String data) {
        Transaction t = Cat.newTransaction("SQL", method);
        Cat.logEvent("SQL.Method", method);
        Cat.logEvent("SQL.Database", data);
        MessageTree tree = Cat.getManager().getThreadLocalMessageTree();
        tree.setDomain("cat-demo");
//        tree.setMessage("===========message==========");
        int nextInt = new Random().nextInt(3);
        if (nextInt % 2 == 0) {
            t.setStatus(Transaction.SUCCESS);
        } else {
            t.setStatus(String.valueOf(nextInt));
        }
        t.complete();
    }
}
