package com.pay.center.core.service;

import com.pay.center.client.dto.service.UserDTO;
import com.pay.center.client.model.UserDO;
import com.pay.center.core.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author chenwei
 * @date 2018-12-04
 */
@Service
public class UserService {

    private UserDao userDao;

    @Autowired
    public UserService(UserDao userDao) {
        this.userDao = userDao;
    }


    /**
     * 根据loginName获取user
     * @param loginName 登陆名
     * @return may be null
     */
    public UserDTO getUser(String id,String loginName){
        UserDTO userDTO = null;
        UserDO userDO = userDao.selectByLoginName(loginName);
        if(userDO != null){
            userDTO = new UserDTO();
            userDTO.setLoginName(userDO.getLoginName());
        }
        return userDTO;
    }

}
