package com.qiyei.android.architecture.ui.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.qiyei.android.architecture.R
import com.qiyei.android.architecture.koin.IUserService
import org.koin.android.ext.android.inject

class KoinDemoActivity : AppCompatActivity() {

    companion object {
        const val TAG = "KoinDemoActivity"
    }

    val userService: IUserService by inject()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_koin_demo)

        Log.i(TAG,"name=${userService.name()}")
    }
}