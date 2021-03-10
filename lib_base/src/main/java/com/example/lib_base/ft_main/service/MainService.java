package com.example.lib_base.ft_main.service;

import android.content.Context;

import com.alibaba.android.arouter.facade.template.IProvider;

public interface MainService extends IProvider {
    void startMainActivity(Context context);
}
