package com.qiyei.android.architecture.hilt;

import android.content.Context;

import javax.inject.Inject;

import dagger.hilt.android.qualifiers.ApplicationContext;


public class ApplicationBean {

    private Context application;


    @Inject
    public ApplicationBean(@ApplicationContext Context context) {
        this.application = application;
    }
}
