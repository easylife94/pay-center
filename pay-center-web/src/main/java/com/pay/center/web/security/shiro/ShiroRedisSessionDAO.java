package com.pay.center.web.security.shiro;

import org.apache.shiro.session.Session;
import org.apache.shiro.session.UnknownSessionException;
import org.apache.shiro.session.mgt.SimpleSession;
import org.apache.shiro.session.mgt.eis.AbstractSessionDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.io.Serializable;
import java.util.Collection;
import java.util.concurrent.TimeUnit;

/**
 * shiro redis管理Session dao
 *
 * @author chenwei
 * @date 2018-12-24
 */
@Component
public class ShiroRedisSessionDAO extends AbstractSessionDAO {

    private static Logger logger = LoggerFactory.getLogger(ShiroRedisSessionDAO.class);

    /**
     * 会话过期时间，单位：ms
     */
    @Value("${session.expireTime}")
    private Long expireTime;

    /**
     * redis key前缀
     */
    private String keyPrefix = "session:id:";

    @Resource
    private RedisTemplate redisTemplate;

    public ShiroRedisSessionDAO() {
        super();
    }

    @Override
    protected Serializable doCreate(Session session) {
        logger.debug("[Shiro session dao]创建会话");
        Serializable sessionId = this.generateSessionId(session);
        logger.debug("[Shiro session dao]sessionId:{}", sessionId);
        this.assignSessionId(session, sessionId);
        redisTemplate.opsForValue().set(getSessionKey(session.getId()), session, expireTime, TimeUnit.MILLISECONDS);
        return sessionId;
    }

    @Override
    protected Session doReadSession(Serializable sessionId) {
        logger.debug("[Shiro session dao]读取会话，sessionId:{}", sessionId);
        if (sessionId == null) {
            return null;
        }
        return (Session) redisTemplate.opsForValue().get(getSessionKey(sessionId));
    }

    @Override
    public void update(Session session) throws UnknownSessionException {
        logger.debug("[Shiro session dao]更新会话，session:{}", session);
        if (session == null || session.getId() == null) {
            return;
        }
        session.setTimeout(expireTime);
        redisTemplate.opsForValue().set(getSessionKey(session.getId()), session, expireTime, TimeUnit.MILLISECONDS);
    }

    @Override
    public void delete(Session session) {
        logger.debug("[Shiro session dao]删除会话，session:{}", session);
        if (null == session) {
            return;
        }
        redisTemplate.opsForValue().getOperations().delete(getSessionKey(session.getId()));
    }

    @Override
    public Collection<Session> getActiveSessions() {
        return redisTemplate.keys(getSessionKey("*"));
    }

    /**
     * 根据key前缀和sessionId生成redis key
     *
     * @param sessionId
     * @return
     */
    private String getSessionKey(Serializable sessionId) {
        return keyPrefix + sessionId;
    }

    public Long getExpireTime() {
        return expireTime;
    }

    public void setExpireTime(Long expireTime) {
        this.expireTime = expireTime;
    }
}
