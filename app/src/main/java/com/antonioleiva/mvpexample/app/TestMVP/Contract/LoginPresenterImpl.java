package com.antonioleiva.mvpexample.app.TestMVP.Contract;


/**
 * Created by Administrator on 2017/7/18 0018.
 */

public class LoginPresenterImpl implements TestContract.LoginPresenter,OnLoginCallBack {

    private TestContract.LoginView mLoginView;
    private login mLogin;

    public LoginPresenterImpl(TestContract.LoginView mLoginView){
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
