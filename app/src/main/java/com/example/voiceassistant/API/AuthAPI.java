package com.example.voiceassistant.API;

import com.example.voiceassistant.Entity.Request.UserAuthenticationRequest;
import com.example.voiceassistant.Entity.Response.UserAuthenticationResponse;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface AuthAPI {

    //TODO 登录
    @POST("login")
    Call<UserAuthenticationResponse> sendLoginRequest(@Body UserAuthenticationRequest userAuthenticationRequest);

    //TODO 注册
    @POST("register")
    Call<UserAuthenticationResponse> sendRegisterRequest(@Body UserAuthenticationRequest userAuthenticationRequest);
}
