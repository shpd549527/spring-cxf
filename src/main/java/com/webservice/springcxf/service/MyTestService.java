package com.webservice.springcxf.service;

import javax.jws.WebService;

/**
 * @Author: gtd
 * @Description:
 * @Date: Create in 22:03 2018/12/29
 */
@WebService
public interface MyTestService {

    String print(String name);
}