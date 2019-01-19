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

    private static final Integer DEFAULT_PAGE_SIZE = 20;

    /**
     * 页大小,缺省值：20
     */
    private Integer pageSize;
    /**
     * 当前页,缺省值：1
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

    public QueryDTO() {
        this.pageSize = DEFAULT_PAGE_SIZE;
        this.currentPage = 1;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        if (pageSize == null) {
            throw new NullPointerException("pageSize is null");
        }
        if (pageSize < 0) {
            throw new IllegalArgumentException("pageSize < 0");
        }
        this.pageSize = pageSize;
    }

    public Integer getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(Integer currentPage) {

        if (currentPage == null) {
            throw new NullPointerException("currentPage is null");
        }
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
}
