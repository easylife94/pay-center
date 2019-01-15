package com.pay.center.client.service;

import com.pay.center.client.dto.service.ChannelDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * feign服务接口
 * <code>@RequestMapping</code> 以 <code> /service </code> 开始
 *
 * @author chenwei
 * @date 2019/1/14 13:48
 */
public interface IPayCenterFeignService {

    /**
     * 测试服务是否可用
     *
     * @return
     */
    @RequestMapping(value = "/service/test", method = RequestMethod.POST)
    String test();

    /**
     * 获取会员
     *
     * @param memberNumber 会员编号
     * @return
     */
    @RequestMapping(value = "/service/member/{memberNumber}", method = RequestMethod.POST)
    ChannelDTO getMember(@PathVariable("memberNumber") String memberNumber);
}
