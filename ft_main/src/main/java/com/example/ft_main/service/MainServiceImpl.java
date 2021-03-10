package com.example.ft_main.service;

import android.content.Context;
import android.util.Log;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.example.ft_main.MainActivity;
import com.example.lib_base.ft_main.service.MainService;

@Route(path = "/main/main_service")
public class MainServiceImpl implements MainService {
    @Override
    public void startMainActivity(Context context) {
        MainActivity.start(context);
    }

    @Override
    public void init(Context context) {
        Log.i(MainServiceImpl.class.getSimpleName(), "init()");
    }
}
