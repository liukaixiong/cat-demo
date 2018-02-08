package com.elab.cat.catdemo.dao;

import com.elab.cat.catdemo.model.TTest;
import com.elab.cat.catdemo.model.TTestExample;
import com.x.jdbc.template.IBaseDaoSupport;

/**
 * @author Liukx
 * @create 2018-02-06 14:44
 * @email liukx@elab-plus.com
 **/
public interface TestMapping extends IBaseDaoSupport<TTest, TTestExample> {


    public TTest selectById(TTest t);
}
