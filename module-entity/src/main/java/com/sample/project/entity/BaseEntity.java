package com.sample.project.entity;

import com.google.gson.Gson;

import java.io.Serializable;

/**
 * Description:
 */
public class BaseEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }
}
