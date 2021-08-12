package com.qiyei.android.service.impl;

import com.qiyei.android.architecture.service.IModuleService;

public class ModuleServiceImpl implements IModuleService {
    @Override
    public String getName() {
        return "hello load by ServiceLoader in runtime";
    }
}
