package com.qiyei.android.architecture.hilt;

import javax.inject.Inject;

public class User {

    private String name;

    @Inject
    public User() {
        this("android-123456");
    }

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
