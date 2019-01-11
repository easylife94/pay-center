package com.pay.center.web.controller;

import com.pay.center.client.vo.ApiResultVO;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.apache.shiro.authz.annotation.RequiresUser;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * 通道管理器
 *
 * @author chenwei
 * @date 2019/1/11 10:51
 */
@RestController
@RequestMapping("/channel")
public class ChannelController {

    @RequiresUser
    @RequiresPermissions("get")
    @RequestMapping(value = "/list",method = RequestMethod.POST)
    private ApiResultVO list(){
        ApiResultVO resultVO = new ApiResultVO();
        return resultVO;
    }
}
