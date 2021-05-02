package com.qiyei.android.architecture.ui.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.qiyei.android.architecture.IUserService;
import com.qiyei.android.architecture.R;
import com.qiyei.android.architecture.User;
import com.qiyei.android.architecture.UserManager;
import com.qiyei.android.architecture.annotations.FAWVWUserService;
import com.qiyei.android.architecture.annotations.MAUserService;

import javax.inject.Inject;

import dagger.hilt.android.AndroidEntryPoint;

@AndroidEntryPoint
public class HiltDemoActivity extends AppCompatActivity {

    private static final String TAG = "HiltDemoActivity";

    @Inject
    protected UserManager mUserManager;

    @Inject
    protected User mUser;

    @Inject
    @FAWVWUserService
    protected IUserService mFAWVWUserService;

    @Inject
    @MAUserService
    protected IUserService mMAUserService;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hilt_demo);

        Log.i(TAG,"user=" + mUser.getName());

        Log.i(TAG,"name=" + mUserManager.getName());

        Log.i(TAG,"mFAWVWUserService name=" + mFAWVWUserService.name());
        Log.i(TAG,"mMAUserService name=" + mMAUserService.name());
    }
}