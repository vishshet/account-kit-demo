package com.adevole.accountkitdemo;

import android.app.Application;

import com.facebook.accountkit.AccountKit;

/**
 * Created by Vishwesh Shetty on 11-10-2016.
 */
public class AccountKitDemoApplication extends Application{
    @Override
    public void onCreate() {
        super.onCreate();

        //Initialize Facebook Account Kit
        AccountKit.initialize(getApplicationContext());

    }
}
