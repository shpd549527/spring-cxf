package com.webservice.springcxf.config;

import com.webservice.springcxf.service.MyTestService;
import org.apache.cxf.Bus;
import org.apache.cxf.jaxws.EndpointImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.xml.ws.Endpoint;

/**
 * @Author: 高铁墩
 * @Description:
 * @Date: Create in 20:20 2018/12/30
 */
@Configuration
public class WebServiceConfig {
   /* @Autowired
    private Bus bus;

    @Autowired
    @Qualifier("myTestServiceImpl")
    private MyTestService myTestService;

    @Bean
    public Endpoint endpoint(){
        Endpoint endpoint = new EndpointImpl(bus,myTestService);    //创建Endpoint实例
        endpoint.publish("/myService");                     //设置发布地址并发布
        return endpoint;
    }*/

}
