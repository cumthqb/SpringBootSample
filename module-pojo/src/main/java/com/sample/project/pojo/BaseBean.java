package com.sample.project.pojo;

import com.google.gson.Gson;

import java.io.Serializable;

/**
 * Description:pojo的顶层类
 */
public class BaseBean implements Serializable {
    private static final long serialVersionUID = 1L;

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }
}
