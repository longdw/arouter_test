package com.example.test;

import android.app.Application;

import com.alibaba.android.arouter.launcher.ARouter;

public class MyApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        ARouter.init(this);
    }
}
