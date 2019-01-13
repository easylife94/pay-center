package com.pay.center.core.dao;

import com.pay.center.client.model.PlatformDO;

public interface PlatformDao {
    int deleteByPrimaryKey(Long id);

    int insert(PlatformDO record);

    int insertSelective(PlatformDO record);

    PlatformDO selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(PlatformDO record);

    int updateByPrimaryKey(PlatformDO record);
}