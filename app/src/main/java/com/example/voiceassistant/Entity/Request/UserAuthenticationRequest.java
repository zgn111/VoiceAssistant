package com.example.voiceassistant.Entity.Request;

/**
 * 用户认证请求
 */

public class UserAuthenticationRequest {

    private String username;
    private String password;

    public UserAuthenticationRequest(String username, String password) {
        this.username = username;
        this.password = password;
    }
    public String getUsername() {
        return username;
    }
    public String getPassword() {
        return password;
    }

}
