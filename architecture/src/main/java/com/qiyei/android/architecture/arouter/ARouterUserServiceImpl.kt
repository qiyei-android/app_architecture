package com.qiyei.android.architecture.arouter

import com.alibaba.android.arouter.facade.annotation.Route

@Route(path = Constant.SERVICE_USER, name = "userService")
class ARouterUserServiceImpl :IUserService {
    override fun name(): String {
        return "ARouterUserServiceImpl"
    }
}