package com.qiyei.android.provider;



import com.qiyei.android.architecture.hilt.IUserService;
import com.qiyei.android.hilt.user.FAWVWUserServiceImpl;
import com.qiyei.android.hilt.user.MAUserServiceImpl;
import com.qiyei.android.provider.annotations.FAWVWUserService;
import com.qiyei.android.provider.annotations.MAUserService;

import dagger.Module;
import dagger.Provides;
import dagger.hilt.InstallIn;
import dagger.hilt.android.components.ActivityComponent;

@Module
@InstallIn(ActivityComponent.class)
public class UserServiceModule {

    @Provides
    @FAWVWUserService
    public IUserService providerFAWVWUserService(){
        return new FAWVWUserServiceImpl();
    }

    @Provides
    @MAUserService
    public IUserService providerMAUserService(){
        return new MAUserServiceImpl();
    }
}
