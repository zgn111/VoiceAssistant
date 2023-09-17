package com.example.voiceassistant.Entity.Response;


/**
 * 用户认证响应
 */

public class UserAuthenticationResponse {


    private boolean success;//是否成功

    private String message;//返回登录/注册信息
    private String token;//返回token

    public UserAuthenticationResponse(boolean success, String message, String token) {
        this.success = success;
        this.message = message;
        this.token = token;
    }

    public boolean isSuccess() {
        return success;
    }

    public String getMessage() {
        return message;
    }

    public String getToken() {
        return token;
    }


}
