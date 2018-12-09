package com.pay.center.core.dao;

import com.pay.center.client.model.MemberDO;

public interface MemberDao {
    int deleteByPrimaryKey(Long id);

    int insert(MemberDO record);

    int insertSelective(MemberDO record);

    MemberDO selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(MemberDO record);

    int updateByPrimaryKey(MemberDO record);
}