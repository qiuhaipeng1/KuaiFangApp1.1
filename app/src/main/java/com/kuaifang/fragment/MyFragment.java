package com.kuaifang.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.kuaifang.kuaifangapp.R;


/**
 * 欢迎界面fragment
 * Created by 邱海鹏 on 2016/10/27.
 */

public class MyFragment extends Fragment {
    private int picResId;
    private ImageView view;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        // 从宿主中获得传过来的值（图片的资源的id）
        Bundle arguments = getArguments();

        picResId = arguments.getInt("picResId");

        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = (ImageView) inflater.inflate(R.layout.my_fragment, null);
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        view.setImageResource(picResId);
        super.onActivityCreated(savedInstanceState);
    }
}
