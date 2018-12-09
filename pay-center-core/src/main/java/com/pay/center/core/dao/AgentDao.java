package com.pay.center.core.dao;

import com.pay.center.client.model.AgentDO;

public interface AgentDao {
    int deleteByPrimaryKey(Long id);

    int insert(AgentDO record);

    int insertSelective(AgentDO record);

    AgentDO selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(AgentDO record);

    int updateByPrimaryKey(AgentDO record);
}