package com.hlz.crm.test;

import com.hlz.crm.service.impl.CustomerServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 测试Spring是否通用
 *
 * @author Henryhlz
 */
public class Test01Spring {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("WEB-INF/applicationContext.xml");
        CustomerServiceImpl customerService = (CustomerServiceImpl) applicationContext.getBean("customerService");
        customerService.saveCustomer(null);

        //        List list =customerService.findAllCustomer();
//        for (Object o:list){
//            System.out.println(o);
//        }
    }
}
