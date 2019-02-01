package com.pay.center.core.dao;

import com.pay.center.client.model.MerchantDO;

import java.util.List;

public interface MerchantDao {
    int deleteByPrimaryKey(Long id);

    int insert(MerchantDO record);

    int insertSelective(MerchantDO record);

    MerchantDO selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(MerchantDO record);

    int updateByPrimaryKey(MerchantDO record);

    List<MerchantDO> selectBySelective(MerchantDO record);
}