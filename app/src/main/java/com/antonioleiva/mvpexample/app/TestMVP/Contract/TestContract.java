package com.antonioleiva.mvpexample.app.TestMVP.Contract;


/**
 * Created by Administrator on 2017/7/18 0018.
 */

public interface TestContract {

    interface LoginView {
        void setUsernameError();

        void setPasswordError();

        void toOtherView();
    }


    interface  LoginPresenter {
        void validateCredentials(String username,String password);
        void Ondestory();
    }
}
