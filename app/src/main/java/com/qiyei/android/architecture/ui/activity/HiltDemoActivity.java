package com.qiyei.android.architecture.ui.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.qiyei.android.architecture.hilt.IUserService;
import com.qiyei.android.architecture.R;
import com.qiyei.android.architecture.hilt.User;
import com.qiyei.android.architecture.hilt.UserManager;
import com.qiyei.android.architecture.hilt.annotations.FAWVWUserService;
import com.qiyei.android.architecture.hilt.annotations.MAUserService;

import javax.inject.Inject;

import dagger.hilt.android.AndroidEntryPoint;
import okhttp3.OkHttpClient;

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

    @Inject
    protected OkHttpClient mOkHttpClient;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hilt_demo);

        Log.i(TAG,"user=" + mUser.getName());

        Log.i(TAG,"name=" + mUserManager.getName());

        Log.i(TAG,"mFAWVWUserService name=" + mFAWVWUserService.name());
        Log.i(TAG,"mMAUserService name=" + mMAUserService.name());

        Log.i(TAG,"mOkHttpClient =" + mOkHttpClient.toString());
    }
}