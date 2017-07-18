package com.antonioleiva.mvpexample.app.TestMVP.common;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.antonioleiva.mvpexample.app.R;


public class Main2Activity extends AppCompatActivity implements LoginView,View.OnClickListener{
    private EditText user;
    private EditText password;
    private LoginPresenterImpl mLoginPresenterImpl;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        mLoginPresenterImpl = new LoginPresenterImpl(this);

        initView();
    }

    private void initView() {
            user =(EditText)findViewById(R.id.username);
            password =(EditText)findViewById(R.id.password);
            findViewById(R.id.btnLogin).setOnClickListener(this);

    }

    @Override
    public void setUsernameError() {
            user.setError("setUsernameError");
    }

    @Override
    public void setPasswordError() {
        password.setError("setPasswordError");
    }

    @Override
    public void toOtherView() {
        Toast.makeText(this,"Success",Toast.LENGTH_LONG).show();
    }

    @Override
    public void onClick(View view) {
        mLoginPresenterImpl.validateCredentials(user.getText().toString(),password.getText().toString());
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        mLoginPresenterImpl.Ondestory();
    }
}
