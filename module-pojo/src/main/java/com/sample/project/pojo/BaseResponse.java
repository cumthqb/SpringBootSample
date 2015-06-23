package com.sample.project.pojo;

/**
 * Description:响应类，带数据结构
 */
public class BaseResponse<T> extends BaseReturnCodeResponse {
    private T data;

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
