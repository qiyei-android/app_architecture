package com.qiyei.android.architecture;

import dagger.Binds;
import dagger.Module;
import dagger.hilt.InstallIn;
import dagger.hilt.android.components.ActivityComponent;

@Module
@InstallIn(ActivityComponent.class)
public abstract class UserServiceModule {

    @Binds
    public abstract IUserService providerIUserService(FAWVWUserServiceImpl service);
}
