package com.elab.cat.catdemo.controller;

import com.elab.cat.catdemo.service.ITestService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * 测试
 *
 * @author Liukx
 * @create 2018-02-06 14:41
 * @email liukx@elab-plus.com
 **/
@RestController
public class TestController {

    private Logger logger = Logger.getLogger(getClass());

    @Autowired
    private ITestService testService;

    @RequestMapping(value = "/logEvent", method = RequestMethod.GET)
    public String getTest() throws Exception {
        String data = testService.getEvent();
        return data;
    }

    @RequestMapping(value = "/logError", method = RequestMethod.GET)
    public String error(@RequestParam("index") int index) throws Exception {
        String data = "OK";
        try {
            data = testService.getError(index);
        } catch (Exception e) {
            logger.error(e.getMessage(), e);
        }
        return data;
    }

    @RequestMapping(value = "/logTransaction", method = RequestMethod.GET)
    public String transaction(@RequestParam("index") String index, @RequestParam("errorNo") int errorNo) throws Exception {
        String data = testService.getTransaction(index, errorNo);
        return data;
    }

}
