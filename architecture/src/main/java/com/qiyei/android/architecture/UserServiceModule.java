package com.qiyei.android.architecture;

import com.qiyei.android.architecture.annotations.FAWVWUserService;
import com.qiyei.android.architecture.annotations.MAUserService;

import dagger.Binds;
import dagger.Module;
import dagger.hilt.InstallIn;
import dagger.hilt.android.components.ActivityComponent;

@Module
@InstallIn(ActivityComponent.class)
public abstract class UserServiceModule {

    @Binds
    @FAWVWUserService
    public abstract IUserService providerFAWVWUserService(FAWVWUserServiceImpl service);

    @Binds
    @MAUserService
    public abstract IUserService providerMAUserService(MAUserServiceImpl service);
}
