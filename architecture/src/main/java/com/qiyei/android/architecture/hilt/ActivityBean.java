package com.qiyei.android.architecture.hilt;

import android.content.Context;

import javax.inject.Inject;

import dagger.hilt.android.qualifiers.ActivityContext;

public class ActivityBean {

    Context context;


    @Inject
    public ActivityBean(@ActivityContext Context context) {
        this.context = context;
    }
}
