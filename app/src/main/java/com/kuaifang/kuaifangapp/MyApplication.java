package com.kuaifang.kuaifangapp;

import android.app.Application;
import android.content.Context;

/**
 * Created by 邱海鹏 on 2016/11/16.
 */

public class MyApplication extends Application {
    private static Context context;
    @Override
    public void onCreate() {
        super.onCreate();
        context = getApplicationContext();
    }

    /**
     * 获取全局上下文
     * MyApplication.getContext();
     * @return
     */
    public static Context getContext(){
        return context;
    }
}
