package com.provider;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * @author ：dhl
 * @date ： 2019/7/18 20:02
 * @description：项目入口
 * @version:
 */
public class Main {
    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        ctx.start();
        System.in.read();
    }
}
