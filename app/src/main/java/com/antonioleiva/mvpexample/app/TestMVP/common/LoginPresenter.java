package com.antonioleiva.mvpexample.app.TestMVP.common;

/**
 * Created by Administrator on 2017/7/18 0018.
 */

public interface LoginPresenter {
    void validateCredentials(String username,String password);
    void Ondestory();
}
