package com.example.voiceassistant.API;

import com.example.voiceassistant.Entity.Request.UserAuthenticationRequest;
import com.example.voiceassistant.Entity.Response.UserAuthenticationResponse;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class APIManager {

    private static final String BASE_URL = "";
    //创建Retrofit实例
    private final Retrofit retrofit = new Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build();


    /**
     * 登录
     *
     * @param username        用户名
     * @param password        密码
     * @param onLoginListener 登录监听器
     */
    public void login(String username, String password, onLoginListener onLoginListener) {
        //创建AuthAPI实例
        AuthAPI authAPI = retrofit.create(AuthAPI.class);
        //创建UserAuthenticationRequest实例
        UserAuthenticationRequest userAuthenticationRequest = new UserAuthenticationRequest(username, password);
        //发送登录请求
        Call<UserAuthenticationResponse> call = authAPI.sendLoginRequest(userAuthenticationRequest);
        //异步处理响应
        call.enqueue(new Callback<UserAuthenticationResponse>() {
                         @Override
                         public void onResponse(Call<UserAuthenticationResponse> call, Response<UserAuthenticationResponse> response) {
                             if (response.isSuccessful() && response.body().getToken() != null && response.body().isSuccess()) {
                                 //登录成功
                                 onLoginListener.onLoginSuccess();
                             } else {
                                 //登录失败
                                 onLoginListener.onLoginFailure();
                             }
                         }

                         @Override
                         public void onFailure(Call<UserAuthenticationResponse> call, Throwable t) {
                             onLoginListener.onLoginFailure();

                         }
                     }
        );

    }

    /**
     * 注册
     *
     * @param username           用户名
     * @param password           密码
     * @param onRegisterListener 注册监听器
     */
    public void register(String username, String password, onRegisterListener onRegisterListener) {
        //创建AuthAPI实例
        AuthAPI authAPI = retrofit.create(AuthAPI.class);
        //创建UserAuthenticationRequest实例
        UserAuthenticationRequest userAuthenticationRequest = new UserAuthenticationRequest(username, password);
        //发送注册请求
        Call<UserAuthenticationResponse> call = authAPI.sendRegisterRequest(userAuthenticationRequest);
        //异步处理响应
        call.enqueue(new Callback<UserAuthenticationResponse>() {
                         @Override
                         public void onResponse(Call<UserAuthenticationResponse> call, Response<UserAuthenticationResponse> response) {
                             if (response.isSuccessful() && response.body().getToken() != null && response.body().isSuccess()) {
                                 //注册成功
                                 onRegisterListener.onRegisterSuccess();
                             } else {
                                 //注册失败
                                 onRegisterListener.onRegisterFailure();
                             }
                         }

                         @Override
                         public void onFailure(Call<UserAuthenticationResponse> call, Throwable t) {
                             onRegisterListener.onRegisterFailure();

                         }
                     }
        );

    }


    public interface onLoginListener {
        void onLoginSuccess();

        void onLoginFailure();
    }

    public interface onRegisterListener {
        void onRegisterSuccess();

        void onRegisterFailure();
    }

}
