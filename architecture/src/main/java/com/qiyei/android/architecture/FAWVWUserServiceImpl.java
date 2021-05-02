package com.qiyei.android.architecture;

import javax.inject.Inject;

public class FAWVWUserServiceImpl implements IUserService{

    @Inject
    public FAWVWUserServiceImpl() {
    }

    @Override
    public String name() {
        return "FAWVW";
    }
}
