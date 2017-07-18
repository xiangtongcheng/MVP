package com.antonioleiva.mvpexample.app.TestMVP.common;


/**
 * Created by Administrator on 2017/7/18 0018.
 */

public class LoginPresenterImpl implements LoginPresenter,OnLoginCallBack {

    private LoginView mLoginView;
    private login mLogin;

    public LoginPresenterImpl(LoginView mLoginView){
        this.mLoginView = mLoginView;
        mLogin= new LoginImpl();
    }


    @Override
    public void validateCredentials(String username, String password) {
            if(mLoginView !=null){

            }
            mLogin.Login(username,password,this);
    }

    @Override
    public void Ondestory() {
        mLoginView=null;
    }

    @Override
    public void VerifyUsername() {
            mLoginView.setUsernameError();
    }

    @Override
    public void VerifyPassword() {
    mLoginView.setPasswordError();
    }

    @Override
    public void onSuccess() {
        mLoginView.toOtherView();
    }
}
