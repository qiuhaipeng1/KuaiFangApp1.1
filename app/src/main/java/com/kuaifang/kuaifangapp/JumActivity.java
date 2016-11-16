package com.kuaifang.kuaifangapp;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

/**
 * 开始的跳转界面
 * Created by 邱海鹏 on 2016/11/16.
 */

public class JumActivity extends AppCompatActivity {

    private SharedPreferences sharedPreferences;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jump);
        sharedPreferences = getSharedPreferences("config", MODE_PRIVATE);
        final boolean isUsed = sharedPreferences.getBoolean("isUsed", false);

        new Handler().postDelayed(new Runnable() {

            public void run() {
                if (isUsed) {
                    startActivity(new Intent(JumActivity.this, MainActivity.class));

                } else {
                    startActivity(new Intent(JumActivity.this, WelcomActivity.class));
                    SharedPreferences.Editor edit = sharedPreferences.edit();
                    edit.putBoolean("isUsed", true);
                    edit.commit();
                }
                JumActivity.this.finish();
            }
        }, 4000);

    }
}
