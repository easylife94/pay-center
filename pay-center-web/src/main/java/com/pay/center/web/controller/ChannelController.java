package com.pay.center.web.controller;

import com.pay.center.client.dto.query.ChannelQueryDTO;
import com.pay.center.client.dto.query.QueryDTO;
import com.pay.center.client.vo.ApiResultVO;
import com.pay.center.client.vo.ChannelVO;
import com.pay.center.client.vo.PaginationVO;
import com.pay.center.core.service.ChannelService;
import com.pay.center.core.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.shiro.authz.annotation.RequiresUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * 通道管理器
 *
 * @author chenwei
 * @date 2019/1/11 10:51
 */
//@Api(description = "通道接口")
@RestController
@RequestMapping("/channel")
public class ChannelController extends BaseController {

    @Autowired
    private ChannelService channelService;

//    @ApiOperation(value = "查询交易通道", notes = "查询交易通道")
    @RequiresUser
    @RequestMapping(value = "/query/trade", method = RequestMethod.POST)
    private ApiResultVO queryTrade(QueryDTO<ChannelQueryDTO> query) {
        ApiResultVO resultVO = new ApiResultVO();
        PaginationVO<ChannelVO> data = channelService.query(query);
        resultVO.setData(data);
        return resultVO;
    }
}
