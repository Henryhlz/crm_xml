package com.hlz.crm.service;

import com.hlz.crm.domain.CstCustomer;

import java.util.List;

/**
 * 客户业务层接口
 *
 * @author Henryhlz
 */
public interface ICustomerService {
    /**
     * 保存客户
     */
    void saveCustomer(CstCustomer customer);

    /**
     * 查询所有客户
     */
    List<CstCustomer> findAllCustomer();
}
