package com.example.voiceassistant.View.User;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.voiceassistant.API.APIManager;
import com.example.voiceassistant.R;
import com.example.voiceassistant.View.Home.HomeView;

public class LoginView extends AppCompatActivity implements APIManager.onLoginListener {

    private EditText etLoginAccount;//用户账号
    private EditText etLoginPassword;//密码
    private Button btnLoginSubmit;//登录按钮
    private Button btnRegister;//注册按钮,切换至注册页面
    private ImageButton btnBack;//返回按钮


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);//使用login.xml
        //获取登录账号密码
        etLoginAccount = findViewById(R.id.etLoginAccount);
        etLoginPassword = findViewById(R.id.etLoginPassword);
        btnLoginSubmit = findViewById(R.id.btnLoginSubmit);
        btnRegister = findViewById(R.id.btnRegister);
        btnBack = findViewById(R.id.btnBack);


        //设置点击事件
        setupClickListeners();
    }


    //TODO 设置点击事件
    private void setupClickListeners() {
        //todo 登录按钮的点击事件
        btnLoginSubmit.setOnClickListener(view -> {
            String username = etLoginAccount.getText().toString();
            String password = etLoginPassword.getText().toString();
            if (username.isEmpty() || password.isEmpty()) {
                Toast.makeText(LoginView.this, "请输入用户名和密码", Toast.LENGTH_SHORT).show();
            } else {
                APIManager apiManager = new APIManager();
                apiManager.login(username, password, this);
            }
        });

        //todo 注册按钮的点击事件
        btnRegister.setOnClickListener(view -> {
            //跳转至注册页面
            Intent intent = new Intent(LoginView.this, RegisterView.class);
            startActivity(intent);
        });

        //todo 返回按钮的点击事件
        btnBack.setOnClickListener(view -> {
            //跳转至主页面
            Intent intent = new Intent(LoginView.this, HomeView.class);
            startActivity(intent);
        });
    }

    public void onLoginSuccess() {
        //登录成功
        Intent intent = new Intent(LoginView.this, UserFragment.class);
        startActivity(intent);
    }

    public void onLoginFailure() {
        //登录失败
        Toast.makeText(LoginView.this, "用户名和密码错误！", Toast.LENGTH_SHORT).show();
    }
}


