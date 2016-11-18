package com.kuaifang.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

//import com.kuaifang.kuaifangapp.MineLoginActivity;
//import com.kuaifang.kuaifangapp.MineShezhiActivity;
import com.kuaifang.kuaifangapp.R;

/**
 * Created by wangxiaoxiao on 2016/11/17.
 */

public class MineFragment extends Fragment implements View.OnClickListener{

    /*
    private boolean flg=false;//false是还未登录，true是登陆成功
    private ImageView ivshezhi;
    private Button btnlogin;
    private RelativeLayout rl2;
    private LinearLayout order_now;
    private LinearLayout order_pay;
    private LinearLayout order_done;
    private RelativeLayout rl4;
    private RelativeLayout rl6;
    private LinearLayout address_manager;
    private LinearLayout youhuiquan;
    private LinearLayout mymessage;
    private LinearLayout see_pingjia;
    private LinearLayout kaitong_fanwei;
    private LinearLayout tuijian_youli;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_mine,null);
        ivshezhi = (ImageView) view.findViewById(R.id.mine_iv_shezhi);
        btnlogin = (Button) view.findViewById(R.id.btn_registerLogin);

        rl2 = (RelativeLayout) view.findViewById(R.id.rl2);
        order_now = (LinearLayout) view.findViewById(R.id.order_now);
        order_pay = (LinearLayout) view.findViewById(R.id.order_pay);
        order_done = (LinearLayout) view.findViewById(R.id.order_done);

        rl4 = (RelativeLayout) view.findViewById(R.id.rl4);
        address_manager = (LinearLayout) view.findViewById(R.id.address_manager);
        youhuiquan = (LinearLayout) view.findViewById(R.id.youhuiquan);
        mymessage = (LinearLayout) view.findViewById(R.id.mymessage);

        rl6 = (RelativeLayout) view.findViewById(R.id.rl6);
        see_pingjia = (LinearLayout) view.findViewById(R.id.see_pingjia);
        kaitong_fanwei = (LinearLayout) view.findViewById(R.id.kaitong_fanwei);
        tuijian_youli = (LinearLayout) view.findViewById(R.id.tuijian_youli);

        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        aboutivshezhi();
        aboutlogin();
        aboutrl2();
        aboutorder_now();
        aboutorder_pay();
        aboutorder_done();
        aboutrl4();
        aboutaddress_manager();
        aboutyouhuiquan();
        aboutmymessage();
        aboutrl6();
        aboutsee_pingjia();
        aboutkaitong_fanwei();
        abouttuijian_youli();
        super.onActivityCreated(savedInstanceState);
    }

    //点击推荐有礼
    private void abouttuijian_youli() {
        if(flg==false){
            tuijian_youli.setOnClickListener(this);
        }else{}
    }

    //点击开通范围
    private void aboutkaitong_fanwei() {
        if(flg==false){
            kaitong_fanwei.setOnClickListener(this);
        }else{}
    }

    //点击查看评价
    private void aboutsee_pingjia() {
        if(flg==false){
            see_pingjia.setOnClickListener(this);
        }else{}
    }

    //点击系统服务
    private void aboutrl6() {
        if(flg==false){
            rl6.setOnClickListener(this);
        }else{}
    }


    //点击我的消息
    private void aboutmymessage() {
        if(flg==false){
            mymessage.setOnClickListener(this);
        }else{}
    }

    //点击优惠券
    private void aboutyouhuiquan() {
        if(flg==false){
            youhuiquan.setOnClickListener(this);
        }else{}
    }

    //点击地址管理
    private void aboutaddress_manager() {
        if(flg==false){
            address_manager.setOnClickListener(this);
        }else{}
    }

    //点击我的服务
    private void aboutrl4() {
        if(flg==false){
            rl4.setOnClickListener(this);
        }else{}
    }

    //点击已完成订单
    private void aboutorder_done() {
        if(flg==false){
            order_done.setOnClickListener(this);
        }else{}
    }

    //点击代付款订单
    private void aboutorder_pay() {
        if(flg==false){
            order_pay.setOnClickListener(this);
        }else{}
    }

    //点击当前订单
    private void aboutorder_now() {
        if(flg==false){
            order_now.setOnClickListener(this);
        }else{}
    }

    //点击我的订单
    private void aboutrl2() {
        if(flg==false){
            rl2.setOnClickListener(this);
        }else{}
    }

    //点击登录按钮
    private void aboutlogin() {
        btnlogin.setOnClickListener(this);
    }

    //点击设置图标
    private void aboutivshezhi() {
        ivshezhi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Intent intent=new Intent(getActivity(), MineShezhiActivity.class);
                //startActivity(intent);
            }
        });
    }*/


    @Override
    public void onClick(View v) {
        //Intent intent=new Intent(getActivity(), MineLoginActivity.class);
        //startActivity(intent);
    }
}
