package com.pay.center.client.dto.query;

import com.pay.center.client.constants.QueryOrderTypeEnum;

/**
 * @author chenwei
 * @date 2019-01-13
 */
public class QueryOderDTO {

    private String filed;
    private QueryOrderTypeEnum type;

    public String getFiled() {
        return filed;
    }

    public void setFiled(String filed) {
        this.filed = filed;
    }

    public QueryOrderTypeEnum getType() {
        return type;
    }

    public void setType(QueryOrderTypeEnum type) {
        this.type = type;
    }
}
