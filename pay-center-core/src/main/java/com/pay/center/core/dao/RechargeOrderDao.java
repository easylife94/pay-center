package com.pay.center.core.dao;

import com.pay.center.client.model.RechargeOrderDO;

public interface RechargeOrderDao {
    int deleteByPrimaryKey(Long id);

    int insert(RechargeOrderDO record);

    int insertSelective(RechargeOrderDO record);

    RechargeOrderDO selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(RechargeOrderDO record);

    int updateByPrimaryKey(RechargeOrderDO record);
}