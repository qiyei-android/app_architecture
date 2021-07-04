package com.qiyei.android.hilt.user;

import com.qiyei.android.architecture.hilt.IUserService;

import javax.inject.Inject;

public class FAWVWUserServiceImpl implements IUserService {

    @Inject
    public FAWVWUserServiceImpl() {
    }

    @Override
    public String name() {
        return "FAWVW";
    }
}
