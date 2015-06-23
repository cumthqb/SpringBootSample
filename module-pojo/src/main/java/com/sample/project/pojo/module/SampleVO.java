package com.sample.project.pojo.module;

import com.sample.project.pojo.BaseBean;

/**
 * Description:VO返回层，展示给前端页面
 */
public class SampleVO extends BaseBean {
    private String userId;
    private String userName;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}