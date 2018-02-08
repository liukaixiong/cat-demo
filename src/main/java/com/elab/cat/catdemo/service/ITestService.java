package com.elab.cat.catdemo.service;

/**
 * ITestService
 *
 * @author Liukx
 * @create 2018-02-06 14:42
 * @email liukx@elab-plus.com
 **/
public interface ITestService {


    /**
     * 基于Event埋点
     *
     * @return
     * @throws Exception
     */
    public String getEvent() throws Exception;

    /**
     * 基于错误信息埋点
     *
     * @return
     * @throws Exception
     */
    public String getError(int i) throws Exception;

    /**
     * 基于事务消息埋点
     *
     * @return
     * @throws Exception
     */
    public String getTransaction(String index, int errorNo) throws Exception;

}
