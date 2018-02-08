package com.elab.cat.catdemo;

import org.junit.Test;

/**
 * @author Liukx
 * @create 2018-02-07 17:37
 * @email liukx@elab-plus.com
 **/
//@RunWith(SpringRunner.class)
//@SpringBootTest
public class ThreadLocalTest {


    @Test
    public void testThreadLocal() {
        Thread t = new Thread(new Runnable() {
            ThreadLocal<Integer> threadLocal = new ThreadLocal<>();

            @Override
            public void run() {
                threadLocal.set(1);
                Integer integer = threadLocal.get();
            }
        });

    }

    @Test
    public static void test2() {
        Thread t = new Thread(new Runnable() {
            public void run() {
                ThreadLocal<Integer> threadLocal1 = new ThreadLocal<>();
                int hash = threadLocal1.hashCode();
                System.out.println(hash);
                threadLocal1.set(1);
                System.out.println(threadLocal1.get());
                ThreadLocal<Integer> threadLocal2 = new ThreadLocal<>();
                int hash2 = threadLocal2.hashCode();
                System.out.println(hash2);
                threadLocal2.set(1);
                System.out.println(threadLocal2.get());
            }
        });
        t.start();
    }

    public static void main(String[] args) {
        test2();
    }

}
