package com.jk.ws.book;

import javax.jws.WebMethod;
import javax.jws.WebService;

/**
 * Created by Lynn-F_X on 2017/5/25.
 */
@WebService
public interface WSBookService {

    @WebMethod(operationName = "TheFirstMethod")
    public void test1();

    @WebMethod
    public int test2();

    @WebMethod
    public String test3(String name);

}
