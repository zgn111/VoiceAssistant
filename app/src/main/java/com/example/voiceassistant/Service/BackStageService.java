package com.example.voiceassistant.Service;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.Service;
import android.content.Intent;
import android.os.Build;
import android.os.IBinder;

import androidx.annotation.Nullable;

import com.example.voiceassistant.R;
import com.example.voiceassistant.View.User.UserFragment;


public class BackStageService extends Service {

    private static final int NOTIFICATION_ID = 1;
    private static final String CHANNEL_ID = "BackgroundService";

    public BackStageService() {
        super();
    }

    @Override
    public void onCreate() {
        super.onCreate();
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        //执行后台操作


        //创建通知渠道
        createNotificationChannel();
        //创建一个点击通知启动的Intent
        Intent notificationIntent = new Intent(this, UserFragment.class);
        PendingIntent pendingIntent = PendingIntent.getActivity(this, 0, notificationIntent, PendingIntent.FLAG_IMMUTABLE);
        // 创建通知
        Notification notification = null;
        if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.O) {
            notification = new Notification.Builder(this, CHANNEL_ID)
                    .setContentTitle("后台通知")
                    .setContentText("后台运行")
                    .setSmallIcon(R.drawable.ic_launcher_background)
                    .setContentIntent(pendingIntent)
                    .build();
        }

        //启动BackgroundService
        startForeground(NOTIFICATION_ID, notification);

        //TODO 后台操作


        return START_STICKY;
    }


    @Override
    public void onDestroy() {
        super.onDestroy();
        // 在 Service 销毁时执行资源释放等操作
    }

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    private void createNotificationChannel() {
        NotificationChannel channel = null;
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            channel = new NotificationChannel(CHANNEL_ID, "后台服务通道", NotificationManager.IMPORTANCE_DEFAULT);
        }
        NotificationManager manager = null;
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            manager = getSystemService(NotificationManager.class);
        }
        if (manager != null) {
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
                manager.createNotificationChannel(channel);
            }
        }
    }
}
