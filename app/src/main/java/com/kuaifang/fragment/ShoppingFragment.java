package com.kuaifang.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;


import com.kuaifang.kuaifangapp.R;
import com.kuaifang.kuaifangapp.SDetailsActivity;


/**
 * Created by Administrator on 2016/11/16.
 */

public class ShoppingFragment extends Fragment {

    private ListView shoppingLv;
    private TextView startBrowse;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.shoppingcart, null);
        shoppingLv = (ListView) view.findViewById(R.id.shopping_lv);
        LinearLayout llEmpty = (LinearLayout) view.findViewById(R.id.ll_empty);
        startBrowse = (TextView) view.findViewById(R.id.tv_start_browse);
        shoppingLv.setEmptyView(llEmpty);
        aboutBrowse();
        return view;
    }

    private void aboutBrowse() {
        startBrowse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getActivity(), SDetailsActivity.class);
                startActivity(intent);
            }
        });
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        aboutListView();
        super.onActivityCreated(savedInstanceState);
    }

    private void aboutListView() {

    }
}
