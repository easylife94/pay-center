package com.pay.center.client.dto.query;

import java.io.Serializable;
import java.util.List;

/**
 * 查询dto.提供pageSize和currentPage参数支持分页查询。orders数组支持对多个参数进行排序。
 * query存放实际查询对象。
 *
 * @author chenwei
 * @date 2019-01-13
 */
public class QueryDTO<T> implements Serializable {

    /**
     * 页大小
     */
    private Integer pageSize;
    /**
     * 当前页
     */
    private Integer currentPage;
    /**
     * 排序
     */
    private List<QueryOderDTO> orders;

    /**
     * 查询字段
     */
    private T query;

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        if (pageSize < 0) {
            throw new IllegalArgumentException("pageSize < 0");
        }
        this.pageSize = pageSize;
    }

    public Integer getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(Integer currentPage) {
        if (currentPage < 1) {
            throw new IllegalArgumentException("currentPage < 1");
        }
        this.currentPage = currentPage;
    }

    public List<QueryOderDTO> getOrders() {
        return orders;
    }

    public void setOrders(List<QueryOderDTO> orders) {
        this.orders = orders;
    }

    public T getQuery() {
        return query;
    }

    public void setQuery(T query) {
        this.query = query;
    }

    /**
     * 获取开始下标
     *
     * @return pageSize or currentPage is null return null
     */
    public Integer getStart() {
        Integer start = null;
        if (pageSize != null && currentPage != null) {
            start = pageSize * (currentPage - 1);
        }
        return start;
    }

    /**
     * 获取结束下标
     *
     * @return pageSize or currentPage is null return null
     */
    public Integer getEnd() {
        Integer end = null;
        if (pageSize != null && currentPage != null) {
            end = pageSize * currentPage;
        }
        return end;
    }
}
