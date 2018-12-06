package com.pay.center.web.controller;

import com.pay.center.client.model.TradeOrderDO;
import com.pay.center.core.dao.TradeOrderDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.math.BigDecimal;
import java.util.Date;
import java.util.Random;
import java.util.UUID;

/**
 * @author chenwei
 * @date 2018-12-05
 */
@Controller
@RequestMapping("tradeOrder")
public class TradeOrderController {

    public static final Logger logger = LoggerFactory.getLogger(TradeOrderController.class);

    @Autowired
    private TradeOrderDao tradeOrderDao;

    @RequestMapping("/generate")
    @ResponseBody
    public String generateOrder(Long num){
        Random ra =new Random();
        for(int i = 0; i < num;i++){
            TradeOrderDO tradeOrderDO = new TradeOrderDO();
            tradeOrderDO.setGmtCreate(new Date());
            tradeOrderDO.setSysOrderNumber(UUID.randomUUID().toString());
            tradeOrderDO.setTradeAmount(new BigDecimal(ra.nextInt(10)+1));
            tradeOrderDao.insert(tradeOrderDO);
        }
        return "创建完毕";
    }
}
