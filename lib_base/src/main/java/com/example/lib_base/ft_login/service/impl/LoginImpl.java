package com.example.lib_base.ft_login.service.impl;

import android.content.Context;

import com.alibaba.android.arouter.facade.annotation.Autowired;
import com.alibaba.android.arouter.launcher.ARouter;
import com.example.lib_base.ft_login.service.LoginService;

public class LoginImpl {

    @Autowired(name = "/login/login_service")
    protected LoginService mLoginService;

    private static LoginImpl mLoginImpl;

    public static LoginImpl getInstance() {
        if (mLoginImpl == null) {
            synchronized (LoginImpl.class) {
                if (mLoginImpl == null) {
                    mLoginImpl = new LoginImpl();
                }
                return mLoginImpl;
            }
        }
        return mLoginImpl;
    }

    private LoginImpl() {
        ARouter.getInstance().inject(this);
    }

    public void loginActivity(Context context) {
        mLoginService.loginActivity(context);
    }

    public boolean hasLogin() {
        return mLoginService.hasLogin();
    }

}
