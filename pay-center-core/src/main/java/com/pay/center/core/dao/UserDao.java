package com.pay.center.core.dao;

import com.pay.center.client.model.UserDO;

public interface UserDao {

    int insert(UserDO pojo);

    int update(UserDO pojo);

    UserDO selectByLoginName(String loginName);
}
