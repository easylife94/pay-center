package com.pay.center.core.service;

import com.pay.center.core.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author chenwei
 * @date 2018-12-09
 */
@Service
public class UserService {

    @Autowired
    private UserDao userDao;


}
