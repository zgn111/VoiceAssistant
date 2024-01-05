package com.example.voiceassistant.View.Home;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import com.example.voiceassistant.R;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class HomeView extends AppCompatActivity {

    private BottomNavigationView bottomNavigationView;//底部导航栏
    private ViewPager2 vp2Home;//主页的ViewPager2


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home);
        bottomNavigationView = findViewById(R.id.bnvTab);
//        vp2Home = findViewById(R.id.vp2Home);
        setupClickListeners();
//        vp2Home.setCurrentItem(1, false);//设置默认显示的页面
//        vp2Home.setUserInputEnabled(false);//禁止滑动


    }

    //TODO 设置点击事件
    public void setupClickListeners() {
        //TODO 设置ViewPager2的适配器
//        vp2Home.setAdapter(new FragmentStateAdapter(this) {
//            @NonNull
//            @Override
//            public Fragment createFragment(int position) {
//                switch (position) {
//                    case 1:
//                        return new HomeFragment();
//                    default:
//                        return new UserFragment();
//                }
//            }
//
//            @Override
//            public int getItemCount() {
//                return 3;
//            }
//        });

        //TODO 设置ViewPager2的滑动事件
//        vp2Home.registerOnPageChangeCallback(new ViewPager2.OnPageChangeCallback() {
//            @Override
//            public void onPageSelected(int position) {
//                super.onPageSelected(position);
//                bottomNavigationView.getMenu().getItem(position).setChecked(true);
//            }
//
//
//        });


        bottomNavigationView.setOnItemSelectedListener(item -> {

            //todo switch case err http://tools.android.com/tips/non-constant-fields
            if (item.getItemId() == R.id.itemHome) {
                vp2Home.setCurrentItem(1, true);
                return true;
            } else if (item.getItemId() == R.id.d) {
                vp2Home.setCurrentItem(2, true);
                return true;
            } else if (item.getItemId() == R.id.itemUser) {
                vp2Home.setCurrentItem(3, true);
                return true;
            }
            return true;
        });
    }


}