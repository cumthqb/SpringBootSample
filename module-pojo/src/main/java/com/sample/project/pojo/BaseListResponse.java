package com.sample.project.pojo;

import java.util.List;

/**
 * Description:返回数据列表，带code,message
 */
public class BaseListResponse<T> extends BaseReturnCodeResponse {
    private List<T> data;

    public List<T> getData() {
        return data;
    }

    public void setData(List<T> data) {
        this.data = data;
    }
}
