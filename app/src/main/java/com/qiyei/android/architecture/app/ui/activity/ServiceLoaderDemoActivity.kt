package com.qiyei.android.architecture.app.ui.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.qiyei.android.architecture.app.R
import com.qiyei.android.architecture.service.IModuleService
import com.qiyei.android.architecture.service.IUserService
import java.util.*

class ServiceLoaderDemoActivity : AppCompatActivity() {

    companion object {
        const val TAG = "ServiceLoaderDemoActivity"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_service_loader_demo)

        val loader = ServiceLoader.load(IUserService::class.java)
        loader.forEach {
            Log.i(TAG,"service1 name= " + it.userName)
        }

        val loader2 = ServiceLoader.load(IModuleService::class.java)
        loader2.forEach {
            Log.i(TAG,"service2 name= " + it.name)
        }
    }
}