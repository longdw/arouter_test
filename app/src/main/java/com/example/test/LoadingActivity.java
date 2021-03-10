package com.example.test;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;

import com.example.lib_base.ft_login.service.impl.LoginImpl;

public class LoadingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loading_layout);

        handler.sendEmptyMessageDelayed(1, 2000);
    }

    Handler handler = new Handler(Looper.myLooper()) {
        @Override
        public void handleMessage(@NonNull Message msg) {
            super.handleMessage(msg);

            //判断是否登录了
            LoginImpl.getInstance().loginActivity(LoadingActivity.this);
            finish();
        }
    };

    @Override
    public void onBackPressed() {

    }
}