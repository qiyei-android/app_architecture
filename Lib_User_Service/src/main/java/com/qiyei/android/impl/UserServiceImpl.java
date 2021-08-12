package com.qiyei.android.impl;

import com.qiyei.android.architecture.service.IUserService;

public class UserServiceImpl implements IUserService {


    @Override
    public String getUserName() {
        return "hello this is load by ServiceLoader";
    }
}
