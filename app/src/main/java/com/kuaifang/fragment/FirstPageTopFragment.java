package com.kuaifang.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.kuaifang.kuaifangapp.R;

/**
 * Description： 首页Fragment<br/>
 * Copyright (c)  2016 <br/>
 * This program is protected by copyright laws <br/>
 * Date: 2016年11月17  10:16
 *
 * @author 张晶波
 * @version : 1.0
 */
public class FirstPageTopFragment extends Fragment {
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {


        return inflater.inflate(R.layout.firstpage_top_fragment, null);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
    }
}
