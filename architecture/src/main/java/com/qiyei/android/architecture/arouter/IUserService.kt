package com.qiyei.android.architecture.arouter

import android.content.Context
import com.alibaba.android.arouter.facade.template.IProvider

interface IUserService : IProvider {

    override fun init(context: Context?) {

    }

    fun name():String
}