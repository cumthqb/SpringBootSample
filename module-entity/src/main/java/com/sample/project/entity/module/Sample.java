package com.sample.project.entity.module;

import com.sample.project.entity.BaseEntity;

/**
 * Description:
 */
public class Sample extends BaseEntity {
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
