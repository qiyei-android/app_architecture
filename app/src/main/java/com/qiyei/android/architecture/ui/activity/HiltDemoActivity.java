package com.qiyei.android.architecture.ui.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.qiyei.android.architecture.IUserService;
import com.qiyei.android.architecture.R;
import com.qiyei.android.architecture.User;
import com.qiyei.android.architecture.UserManager;

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
    protected IUserService mUserService;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hilt_demo);

        Log.i(TAG,"user=" + mUser.getName());

        Log.i(TAG,"name=" + mUserManager.getName());

        Log.i(TAG,"userService name=" + mUserService.name());
    }
}