package com.example.lib_base.ft_main.service.impl;

import android.content.Context;

import com.alibaba.android.arouter.facade.annotation.Autowired;
import com.alibaba.android.arouter.launcher.ARouter;
import com.example.lib_base.ft_main.service.MainService;

public class MainImpl {
    @Autowired(name = "/main/main_service")
    protected MainService mMainService;

    private static MainImpl mMainImpl;

    private MainImpl() {
        ARouter.getInstance().inject(this);
    }

    public static MainImpl getInstance() {
        if (mMainImpl == null) {
            synchronized (MainImpl.class) {
                if (mMainImpl == null) {
                    mMainImpl = new MainImpl();
                }
                return mMainImpl;
            }
        }
        return mMainImpl;
    }

    public void startMainActivity(Context context) {
        mMainService.startMainActivity(context);
    }
}
