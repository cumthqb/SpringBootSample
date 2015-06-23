package com.sample.project.pojo;

/**
 * Description:分页列表返回
 */
public class BasePageResponse<T> extends BaseListResponse<T> {

    private int totalPage;
    private int page;
    private int size;

    public int getTotalPage() {
        return totalPage;
    }

    public void setTotalPage(int totalPage) {
        this.totalPage = totalPage;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
