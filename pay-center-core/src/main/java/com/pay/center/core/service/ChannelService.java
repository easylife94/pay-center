package com.pay.center.core.service;

import com.pay.center.client.dto.query.ChannelQueryDTO;
import com.pay.center.client.dto.query.QueryDTO;
import com.pay.center.client.vo.ChannelVO;
import com.pay.center.client.vo.PaginationVO;

/**
 * 通道sevice
 *
 * @author chenwei
 * @date 2019-01-12
 */
public interface ChannelService {

    /**
     * 查询通道
     *
     * @param query
     * @return
     */
    PaginationVO<ChannelVO> query(QueryDTO<ChannelQueryDTO> query);
}
