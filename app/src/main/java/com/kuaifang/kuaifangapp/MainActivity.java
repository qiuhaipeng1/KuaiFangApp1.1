package com.kuaifang.kuaifangapp;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    private RadioGroup rgMain;
    private FragmentManager fragmentManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rgMain = (RadioGroup) findViewById(R.id.rg_main);
        fragmentManager = getSupportFragmentManager();
        initFragment();
    }
    /**
     * 初始化fragment
     */
    public void initFragment() {
        //先给一个默认的首页Fragment
        rgMain.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId) {
                    case R.id.rb_home://首页
                        //使用上面的fragmentManager替换占位控件main_fragment
                        Toast.makeText(MainActivity.this, "首页", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.rb_active://活动
                        //使用上面的fragmentManager替换占位控件main_fragment
                        Toast.makeText(MainActivity.this, "活动", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.rb_buycar://购物车
                        //使用上面的fragmentManager替换占位控件main_fragment
                        Toast.makeText(MainActivity.this, "购物车", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.rb_me://我
                        //使用上面的fragmentManager替换占位控件main_fragment
                        Toast.makeText(MainActivity.this, "我", Toast.LENGTH_SHORT).show();
                        break;
                }
            }
        });

    }
}
