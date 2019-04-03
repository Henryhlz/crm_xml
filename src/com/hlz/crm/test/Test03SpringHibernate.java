package com.hlz.crm.test;

import com.hlz.crm.domain.CstCustomer;
import com.hlz.crm.service.ICustomerService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * 测试Spring和hibernate整合之后是否能用
 *
 * @author Henryhlz
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:WEB-INF/applicationContext.xml"})
public class Test03SpringHibernate {

    @Autowired
    private ICustomerService customerService;

    @Test
    public void testSave() {
        CstCustomer customer = new CstCustomer();
        customer.setCustName("spring整合hibernate");
        customerService.saveCustomer(customer);
    }

    @Test
    public void testfindAll() {
        List list = customerService.findAllCustomer();
        for (Object o : list) {
            System.out.println(o);
        }
    }
}
