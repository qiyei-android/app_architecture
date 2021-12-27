package com.qiyei.android.architecture

import android.app.Application
import com.alibaba.android.arouter.launcher.ARouter
import com.qiyei.android.architecture.koin.KoinModule
import org.koin.core.context.startKoin

open class KoinApplication:Application() {

    override fun onCreate() {
        super.onCreate()
        startKoin {
            modules(KoinModule.appModule)
        }
        ARouter.init(this)
    }
}