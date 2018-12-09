package com.pay.center.core.dao;

import com.pay.center.client.model.WithdrawOrderDO;

public interface WithdrawOrderDao {
    int deleteByPrimaryKey(Long id);

    int insert(WithdrawOrderDO record);

    int insertSelective(WithdrawOrderDO record);

    WithdrawOrderDO selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(WithdrawOrderDO record);

    int updateByPrimaryKey(WithdrawOrderDO record);
}