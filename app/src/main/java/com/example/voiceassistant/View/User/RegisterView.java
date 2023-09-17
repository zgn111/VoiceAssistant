package com.example.voiceassistant.View.User;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.voiceassistant.API.APIManager;
import com.example.voiceassistant.R;

public class RegisterView extends AppCompatActivity implements APIManager.onRegisterListener {

    private EditText etRegisterAccount;//用户账号
    private EditText etRegisterPassword;//密码
    private EditText etRegisterPasswordConfirm;//确认密码
    private Button btnRegisterSubmit;//注册按钮

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.register);//使用register.xml
        //获取注册账号密码
        etRegisterAccount = findViewById(R.id.etRegisterAccount);
        etRegisterPassword = findViewById(R.id.etRegisterPassword);
        etRegisterPasswordConfirm = findViewById(R.id.etRegisterPasswordConfirm);
        btnRegisterSubmit = findViewById(R.id.btnRegisterSubmit);
        //设置点击事件
        setupClickListeners();


    }

    public void setupClickListeners() {
        btnRegisterSubmit.setOnClickListener(View -> {
                    String username = etRegisterAccount.getText().toString();
                    String password = etRegisterPassword.getText().toString();
                    String passwordConfirm = etRegisterPasswordConfirm.getText().toString();
                    if (username.isEmpty() || password.isEmpty() || passwordConfirm.isEmpty()) {
                        Toast.makeText(RegisterView.this, "请输入用户名和密码", Toast.LENGTH_SHORT).show();
                    } else if (!password.equals(passwordConfirm)) {
                        Toast.makeText(RegisterView.this, "两次输入的密码不一致", Toast.LENGTH_SHORT).show();
                    } else {
                        //TODO 注册
                        APIManager apiManager = new APIManager();
                        apiManager.register(username, password, this);
                    }
                }

        );
    }

    @Override
    public void onRegisterSuccess() {
        //注册成功
        Intent intent = new Intent(RegisterView.this, LoginView.class);
        startActivity(intent);
    }

    @Override
    public void onRegisterFailure() {
        //注册失败
        Toast.makeText(RegisterView.this, "注册失败", Toast.LENGTH_SHORT).show();
    }
}
