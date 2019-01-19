package com.pay.center.core.dao;

import com.pay.center.client.dto.query.ChannelQueryDTO;
import com.pay.center.client.dto.query.QueryDTO;
import com.pay.center.client.model.ChannelDO;

import java.util.List;

public interface ChannelDao {
    int deleteByPrimaryKey(Long id);

    int insert(ChannelDO record);

    int insertSelective(ChannelDO record);

    ChannelDO selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(ChannelDO record);

    int updateByPrimaryKey(ChannelDO record);

    /**
     * 分页查询
     * @param query
     * @return
     */
    List<ChannelDO> query(QueryDTO<ChannelQueryDTO> query);
}