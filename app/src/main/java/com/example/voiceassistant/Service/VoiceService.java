package com.example.voiceassistant.Service;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;


public interface VoiceService {
    @POST("process-voice")
    Call<String> processVoiceCommand(@Body String voiceCommand);
}

