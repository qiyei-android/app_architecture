package com.qiyei.android.architecture.koin

import org.koin.dsl.module

class KoinModule {
    companion object {
        val appModule = module {
            single<IUserService> { KoinUserServiceImpl() }
        }
    }
}