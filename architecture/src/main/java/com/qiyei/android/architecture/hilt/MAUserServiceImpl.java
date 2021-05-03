package com.qiyei.android.architecture.hilt;

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
