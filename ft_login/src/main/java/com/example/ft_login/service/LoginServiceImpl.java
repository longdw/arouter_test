package com.example.ft_login.service;

import android.content.Context;
import android.util.Log;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.example.ft_login.LoginActivity;
import com.example.lib_base.ft_login.service.LoginService;

@Route(path = "/login/login_service")
public class LoginServiceImpl implements LoginService {
    @Override
    public void loginActivity(Context context) {
        LoginActivity.start(context);
    }

    @Override
    public boolean hasLogin() {
        return false;
    }

    @Override
    public void init(Context context) {
        Log.i(LoginServiceImpl.class.getSimpleName(), "init()");
    }
}
