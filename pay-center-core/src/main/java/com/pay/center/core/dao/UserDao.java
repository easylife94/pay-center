package com.pay.center.core.dao;

import com.pay.center.client.model.UserDO;
import org.apache.ibatis.annotations.Param;

/**
 *
 * @author chenwei
 * @date 2018-12-04
 */
public interface UserDao {

    /**
     * 插入数据
     * @param pojo 实体类
     * @return 返回影响记录数
     */
    int insert(@Param("pojo") UserDO pojo);

    /**
     * 更新数据
     * @param pojo 实体类
     * @return 返回影响记录数
     */
    int update(@Param("pojo") UserDO pojo);

    /**
     * 根据登陆名模糊查询
     * @param loginName 登陆名
     * @return 实体类
     */
    UserDO selectByLoginName(@Param("loginName") String loginName);
}
