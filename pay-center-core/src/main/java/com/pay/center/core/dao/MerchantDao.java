package com.pay.center.core.dao;

import com.pay.center.client.model.MerchantDO;

public interface MerchantDao {
    int deleteByPrimaryKey(Long id);

    int insert(MerchantDO record);

    int insertSelective(MerchantDO record);

    MerchantDO selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(MerchantDO record);

    int updateByPrimaryKey(MerchantDO record);
}