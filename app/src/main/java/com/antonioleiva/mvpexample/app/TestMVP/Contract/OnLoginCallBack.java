package com.antonioleiva.mvpexample.app.TestMVP.Contract;

/**
 * Created by Administrator on 2017/7/18 0018.
 */

public interface OnLoginCallBack {
    void VerifyUsername();
    void VerifyPassword();
    void onSuccess();
}
