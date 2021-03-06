package com.pay.center.client.service;

import com.pay.center.client.dto.service.MemberDTO;
import com.pay.center.client.dto.service.TradeMerchantDTO;
import com.pay.center.client.dto.service.query.TradeMerchantQueryDTO;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

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
     * @return 返回服务状态
     */
    @RequestMapping(value = "/service/test", method = RequestMethod.POST)
    String test();

    /**
     * 获取会员
     *
     * @param memberNumber 会员编号
     * @return 返回会员
     */
    @RequestMapping(value = "/service/member/{memberNumber}", method = RequestMethod.POST)
    MemberDTO getMember(@PathVariable("memberNumber") String memberNumber);

    /**
     * 获取可交易商户列表
     *
     * @param query 查询参数
     * @return 可交易商户列表
     */
    @RequestMapping(value = "/service/listTradeMerchant", method = RequestMethod.POST)
    List<TradeMerchantDTO> listTradeMerchant(@RequestBody TradeMerchantQueryDTO query);
}
