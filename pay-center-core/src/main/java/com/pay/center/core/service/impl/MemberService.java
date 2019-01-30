package com.pay.center.core.service.impl;

import com.pay.center.client.dto.service.MemberDTO;
import com.pay.center.client.model.AgentDO;
import com.pay.center.client.model.MemberDO;
import com.pay.center.core.dao.AgentDao;
import com.pay.center.core.dao.MemberDao;
import com.pay.center.core.service.IMemberService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author chenwei
 * @date 2019/1/15 17:34
 */
@Service
public class MemberService implements IMemberService {

    private final MemberDao memberDao;
    private final AgentDao agentDao;

    @Autowired
    public MemberService(MemberDao memberDao, AgentDao agentDao) {
        this.memberDao = memberDao;
        this.agentDao = agentDao;
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
}
