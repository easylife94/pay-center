package com.pay.center.web.rest;

import com.pay.center.client.dto.service.MemberDTO;
import com.pay.center.client.dto.service.TradeMerchantDTO;
import com.pay.center.client.dto.service.query.TradeMerchantQueryDTO;
import com.pay.center.client.model.AgentDO;
import com.pay.center.client.model.MemberDO;
import com.pay.center.client.service.IPayCenterFeignService;
import com.pay.center.core.dao.AgentDao;
import com.pay.center.core.dao.MemberDao;
import com.pay.center.core.dao.MerchantDao;
import com.pay.center.core.service.IMemberService;
import com.pay.center.core.service.IMerchantService;
import com.pay.center.core.service.impl.MemberServiceImpl;
import com.pay.center.core.service.impl.MerchantServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * RESTfull服务实现
 *
 * @author chenwei
 * @date 2019/1/14 14:15
 */
@RestController
public class PayCenterFeignService implements IPayCenterFeignService {

    private static Logger logger = LoggerFactory.getLogger(PayCenterFeignService.class);

    private final MemberDao memberDao;
    private final AgentDao agentDao;
    private final MerchantDao merchantDao;

    @Autowired
    public PayCenterFeignService(MemberDao memberDao, AgentDao agentDao, MerchantDao merchantDao) {
        this.memberDao = memberDao;
        this.agentDao = agentDao;
        this.merchantDao = merchantDao;
    }

    @Override
    public String test() {
        return "service is available";
    }

    @Override
    public MemberDTO getMember(String memberNumber) {
        MemberDO memberDO = memberDao.selectByMemberNumber(memberNumber);
        if (memberDO != null) {
            MemberDTO memberDTO = new MemberDTO();
            BeanUtils.copyProperties(memberDTO, memberDO);

            AgentDO agentDO = agentDao.selectByPrimaryKey(memberDO.getAgentId());
            if(agentDO != null){
                BeanUtils.copyProperties(memberDTO, agentDO);
            }
            return memberDTO;
        }
        return null;
    }

    @Override
    public List<TradeMerchantDTO> listTradeMerchant(TradeMerchantQueryDTO query) {



        return null;
    }
}
