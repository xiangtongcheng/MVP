package com.antonioleiva.mvpexample.app.TestMVP.common;


import android.os.Handler;
import android.text.TextUtils;

/**
 * Created by Administrator on 2017/7/18 0018.
 */

public class LoginImpl implements login {
    @Override
    public void Login(final String username, final String password, final OnLoginCallBack onLoginCallBack) {
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                {
                    boolean error = false;
                    if (TextUtils.isEmpty(username)){
                        onLoginCallBack.VerifyUsername();
                        error = true;
                    }
                    if (TextUtils.isEmpty(password)){
                        onLoginCallBack.VerifyPassword();
                        error = true;
                    }
                    if (!error){
                        onLoginCallBack.onSuccess();
                    }
                }
            }
        },2000);
    }
}
