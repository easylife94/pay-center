package com.pay.center.client.constants;

/**
 * @author chenwei
 * @date 2019/2/11 16:57
 */
public enum PlatformEnum {

    TEST("TEST","测试"),
    ;

    private String type;
    private String name;

    PlatformEnum(String type, String name) {
        this.type = type;
        this.name = name;
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
    }}
