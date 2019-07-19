package com.provider;

import com.common.SayHello;

/**
 * @author ：dhl
 * @date ： 2019/7/18 19:37
 * @description：服务提供者
 * @version: v1.0
 */
public class SayHelloImpl implements SayHello {

    public String sayHello(String name) {
        return "Hello "+name;
    }
}
