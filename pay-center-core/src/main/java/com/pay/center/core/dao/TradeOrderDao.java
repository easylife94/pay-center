package com.pay.center.core.dao;

import com.pay.center.client.model.TradeOrderDO;
import org.apache.ibatis.annotations.Param;

/**
 * 订单表dao
 * @author chenwei
 * @date 2018-12-05
 */
public interface TradeOrderDao {

    /**
     * 插入数据
     * @param pojo 实体类
     * @return 返回影响记录数
     */
    int insert(@Param("pojo") TradeOrderDO pojo);

    /**
     * 更新数据
     * @param pojo 实体类
     * @return 返回影响记录数
     */
    int update(@Param("pojo") TradeOrderDO pojo);
}
