package com.pay.center.core.service.impl;

import com.pay.center.client.dto.query.ChannelQueryDTO;
import com.pay.center.client.dto.query.QueryDTO;
import com.pay.center.client.vo.ChannelVO;
import com.pay.center.client.vo.PaginationVO;
import com.pay.center.core.dao.ChannelDao;
import com.pay.center.core.service.ChannelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author chenwei
 * @date 2019-01-12
 */
@Service
public class ChannelImplService implements ChannelService {

    @Autowired
    private ChannelDao channelDao;

    @Override
    public PaginationVO<ChannelVO> query(QueryDTO<ChannelQueryDTO> query) {
        return null;
    }
}
