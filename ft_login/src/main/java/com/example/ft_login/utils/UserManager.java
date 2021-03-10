package com.example.ft_login.utils;

import com.example.ft_login.model.User;

public class UserManager {
    private static UserManager mUserManager;
    private User mUser;

    public static UserManager getInstance() {
        if (mUserManager == null) {
            synchronized (UserManager.class) {
                if (mUserManager == null) {
                    mUserManager = new UserManager();
                }
                return mUserManager;
            }
        }
        return mUserManager;
    }

    private UserManager() {
    }

    public void setUser(User user) {
        mUser = user;
    }

    public boolean hasLogin() {
        return mUser != null;
    }

    private User getUser() {
        return mUser;
    }

}
