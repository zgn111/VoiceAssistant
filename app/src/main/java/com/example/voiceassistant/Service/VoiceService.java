package com.example.voiceassistant.Service;

import android.app.Service;
import android.content.Intent;
import android.media.MediaRecorder;
import android.os.IBinder;

import androidx.annotation.Nullable;


public class VoiceService extends Service {

    private MediaRecorder mediaRecorder;//录音机

    @Override
    public void onCreate() {
        super.onCreate();
        //TODO 初始化录音机
        mediaRecorder = new MediaRecorder();
        //TODO 设置录音机参数
        //设置音频源为麦克风
        mediaRecorder.setAudioSource(MediaRecorder.AudioSource.MIC);
        //设置输出格式 TODO
        mediaRecorder.setOutputFormat(MediaRecorder.OutputFormat.DEFAULT);
        //设置音频编码 TODO
        mediaRecorder.setAudioEncoder(MediaRecorder.AudioEncoder.DEFAULT);
        mediaRecorder.setOutputFile(getOutputFilePath());//设置输出文件
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        //TODO 开始录音
        mediaRecorder.start();
        return super.onStartCommand(intent, flags, startId);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        //TODO 停止录音
        mediaRecorder.stop();
        //TODO 释放录音机
        mediaRecorder.release();
    }


    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    //获取输出文件路径 todo
    public String getOutputFilePath() {
        return "";
    }
}

