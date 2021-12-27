package com.qiyei.android.architecture.ui.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.alibaba.android.arouter.facade.annotation.Autowired
import com.alibaba.android.arouter.launcher.ARouter
import com.qiyei.android.architecture.R
import com.qiyei.android.architecture.arouter.IUserService


class ARouterDemoActivity : AppCompatActivity() {
    companion object {
        const val TAG = "ARouterDemoActivity"
    }

    @Autowired
    lateinit var userService: IUserService

    override fun onCreate(savedInstanceState: Bundle?) {
        ARouter.getInstance().inject(this)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_arouter_demo)

        Log.i(TAG,"name=${userService.name()}")
    }
}