package com.sample.project.pojo;

/**
 * Description:分页请求
 */
//TODO add sort 排序功能
public class BasePageRequest extends BaseRequest {
    private int page;
    private int size;

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
