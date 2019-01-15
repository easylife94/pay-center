package com.pay.center.core.service;

import com.pay.center.client.dto.service.MemberDTO;

/**
 * 会员服务接口
 *
 * @author chenwei
 * @date 2019/1/15 17:31
 */
public interface IMemberService {

    /**
     * 获取会员
     *
     * @param memberNumber
     * @return
     */
    MemberDTO getMember(String memberNumber);
}
