package com.qiyei.android.architecture.hilt;

import javax.inject.Inject;

public class Repository {

    @Inject
    public Repository() {
    }

    public User getUser(){
        return new User("hello world");
    }
}
