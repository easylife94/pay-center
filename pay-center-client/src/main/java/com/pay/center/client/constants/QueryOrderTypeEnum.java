package com.pay.center.client.constants;

/**
 * 查询排序类型枚举
 *
 * @author chenwei
 * @date 2019-01-13
 */
public enum QueryOrderTypeEnum {

    ASC("ASC", "升序"),
    DESC("DESC", "降序");

    /**
     * 类型
     */
    private String type;
    /**
     * 名称
     */
    private String name;

    QueryOrderTypeEnum(String type, String name) {
        this.type = type;
        this.name = name;
    }
}
