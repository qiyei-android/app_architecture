package com.qiyei.android.architecture.hilt;

import javax.inject.Inject;

public class UserManager {

    private User mUser;

    @Inject
    public UserManager(User user) {
        mUser = user;
    }

    public String getName(){
        return mUser.getName();
    }
}
