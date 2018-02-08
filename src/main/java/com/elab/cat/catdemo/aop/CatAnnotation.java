package com.elab.cat.catdemo.aop;

import java.lang.annotation.*;

/**
 * @author Liukx
 * @create 2018-02-07 13:51
 * @email liukx@elab-plus.com
 **/
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface CatAnnotation {

    String value();

}

