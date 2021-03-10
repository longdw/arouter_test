package com.example.lib_base.ft_login.service;

import android.content.Context;

import com.alibaba.android.arouter.facade.template.IProvider;

public interface LoginService extends IProvider {

    void loginActivity(Context context);

    boolean hasLogin();
}
