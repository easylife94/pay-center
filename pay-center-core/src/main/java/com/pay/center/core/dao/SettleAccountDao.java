package com.pay.center.core.dao;

import com.pay.center.client.model.SettleAccountDO;

public interface SettleAccountDao {
    int deleteByPrimaryKey(Long id);

    int insert(SettleAccountDO record);

    int insertSelective(SettleAccountDO record);

    SettleAccountDO selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(SettleAccountDO record);

    int updateByPrimaryKeyWithBLOBs(SettleAccountDO record);

    int updateByPrimaryKey(SettleAccountDO record);
}