package com.jk.ws.book.impl;

import com.jk.ws.book.WSBookService;

import javax.jws.WebMethod;
import javax.jws.WebService;

/**
 * Created by Lynn-F_X on 2017/5/25.
 */
@WebService
public class WSBookServiceImpl implements WSBookService {
    @Override
    public void test1() {
        System.out.println("无参无返回值");
    }

    @Override
    //@WebMethod(exclude = true)
    public int test2() {
        System.out.println("返回数字");
        return 9999;

    }

    @Override
    public String test3(String name) {
        return name;
    }

}
