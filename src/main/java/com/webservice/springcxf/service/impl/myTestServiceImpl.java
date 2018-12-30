package com.webservice.springcxf.service.impl;

import com.webservice.springcxf.service.MyTestService;
import org.springframework.stereotype.Component;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.ws.WebEndpoint;

/**
 * @Author: 高铁墩
 * @Description:
 * @Date: Create in 22:18 2018/12/29
 */
@WebService(serviceName = "myTestService", // 与接口中指定的name一致
        endpointInterface = "com.webservice.springcxf.service.MyTestService")// 接口地址
@Component
public class MyTestServiceImpl implements MyTestService {

    @WebMethod
    public String print(@WebParam (name = "username") String name) {
        return "hello," + name;
    }

}
