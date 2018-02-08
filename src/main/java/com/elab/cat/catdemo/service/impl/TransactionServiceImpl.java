package com.elab.cat.catdemo.service.impl;

import com.elab.cat.catdemo.aop.CatAnnotation;
import com.elab.cat.catdemo.model.ParamsModel;
import com.elab.cat.catdemo.service.ITransactionService;
import com.elab.cat.catdemo.utils.AuthorConstans;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Service;

import java.util.Random;

/**
 * 事务
 *
 * @author Liukx
 * @create 2018-02-07 16:48
 * @email liukx@elab-plus.com
 **/
@Service
@CatAnnotation(AuthorConstans.kuangx)
public class TransactionServiceImpl implements ITransactionService {

    protected final Log logger = LogFactory.getLog(this.getClass());

    public String getTransactionList(ParamsModel model) throws Exception {
        String index = model.getIndex();
        int errorNo = model.getErrorNo();
        Random random = new Random();
        if (index.equals("1")) {
            throwExeception(errorNo);
        } else {
            logger.info("getTransactionList 这个getTransaction方法执行了 , 随机数 : " + errorNo);
        }
        return "OK";
    }

    public void throwExeception(int i) throws Exception {
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
        }
    }
}
