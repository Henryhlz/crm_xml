package com.hlz.crm.test;


import com.hlz.crm.domain.CstCustomer;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


/**
 * 测试hibernate是否通用
 *
 * @author Henryhlz
 */
public class Test02Hibernate {
    public static void main(String[] args) {

        //1. 创建一个 SessionFactory 对象
        Configuration configuration = new Configuration();
        configuration.configure();
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        //2. 创建一个 Session 对象
        Session session = sessionFactory.getCurrentSession();
        //3. 开启事务
        Transaction transaction = session.beginTransaction();
        CstCustomer s = new CstCustomer();
        s.setCustName("测试名字2999");
        //4. 执行保存操作
        session.save(s);
        //5. 提交事务
        transaction.commit();
        //6. 关闭 Session
//        session.close();
        //7. 关闭 SessionFactory 对象
        sessionFactory.close();
    }
}
