package com.qiyei.android.hilt.user;

import com.qiyei.android.architecture.hilt.IUserService;

import javax.inject.Inject;

public class MAUserServiceImpl implements IUserService {

    @Inject
    public MAUserServiceImpl() {
    }

    @Override
    public String name() {
        return "MA";
    }
}
