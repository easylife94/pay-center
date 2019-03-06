package com.pay.center.core.service.impl;


import com.pay.center.client.utils.SnowflakeIdWorker;
import com.pay.center.core.service.IIdService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 *
 * @author chenwei
 * @date 2019/2/19 16:18
 */
@Service
public class IdServiceImpl implements IIdService {

    private SnowflakeIdWorker snowflakeIdWorker;

    @Autowired
    public IdServiceImpl(@Value("${snowflake.data-center-id}") Long dataCenterId) {
        snowflakeIdWorker = new SnowflakeIdWorker(1L,dataCenterId);
    }

    @Override
    public Long generateId() {
        return snowflakeIdWorker.nextId();
    }

}
