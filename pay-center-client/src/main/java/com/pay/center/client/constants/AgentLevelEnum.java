package com.pay.center.client.constants;

import org.apache.commons.lang3.StringUtils;

/**
 * 代理商级别枚举类
 *
 * @author chenwei
 * @date 2019-03-02
 */
public enum AgentLevelEnum {
    /**
     * 一级代理
     */
    LEVEL_1("LEVEL_1","一级代理"),

    /**
     * 二级代理
     */
    LEVEL_2("LEVEL_2","二级代理"),

    ;

    private String type;
    private String name;

    AgentLevelEnum(String type, String name) {
        this.type = type;
        this.name = name;
    }

    AgentLevelEnum getByType(String type) {
        for (AgentLevelEnum e : AgentLevelEnum.values()) {
            if (StringUtils.equals(type, e.getType())) {
                return e;
            }
        }
        return null;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
