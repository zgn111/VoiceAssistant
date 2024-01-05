package com.example.voiceassistant.View.Home;


import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.voiceassistant.R;
import com.example.voiceassistant.Service.VoiceService;


public class HomeFragment extends Fragment {

    private Button btnStart;//开始按钮

    public HomeFragment() {
        super(R.layout.fragment_home);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_home, null);
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        btnStart = view.findViewById(R.id.btnStart);
        setupClickListeners();
    }

    //TODO 设置点击事件
    public void setupClickListeners() {
        //TODO 开始按钮的点击事件
        btnStart.setOnClickListener(view -> {
            //todo 语音收集
            Intent intent = new Intent(getActivity(), VoiceService.class);
            getActivity().startService(intent); // 启动服务


        });
    }


}