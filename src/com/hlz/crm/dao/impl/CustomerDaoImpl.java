package com.hlz.crm.dao.impl;

import com.hlz.crm.domain.CstCustomer;
import com.hlz.crm.dao.ICustomerDao;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

import java.util.List;

/**
 * @author Henryhlz
 */
public class CustomerDaoImpl extends HibernateDaoSupport implements ICustomerDao {

    @Override
    public void saveCustomer(CstCustomer customer) {
        getHibernateTemplate().save(customer);
    }

    @Override
    public List<CstCustomer> findAllCustomer() {
        return (List<CstCustomer>) getHibernateTemplate().find("from CstCustomer ");
    }
}
