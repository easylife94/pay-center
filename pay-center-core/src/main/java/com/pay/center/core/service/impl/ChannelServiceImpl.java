package com.pay.center.core.service.impl;

import com.pay.center.client.dto.query.ChannelQueryDTO;
import com.pay.center.client.dto.query.QueryDTO;
import com.pay.center.client.model.ChannelDO;
import com.pay.center.client.vo.ChannelVO;
import com.pay.center.client.vo.PaginationVO;
import com.pay.center.core.dao.ChannelDao;
import com.pay.center.core.service.ChannelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author chenwei
 * @date 2019-01-12
 */
@Service("channelService")
public class ChannelServiceImpl implements ChannelService {

    @Autowired
    private ChannelDao channelDao;

    @Override
    public PaginationVO<ChannelVO> query(QueryDTO<ChannelQueryDTO> query) {
        PaginationVO<ChannelVO> paginationVO = new PaginationVO<>();
        List<ChannelDO> channelDOList = channelDao.query(query);
        if (channelDOList != null) {

        }
        return paginationVO;
    }
}
