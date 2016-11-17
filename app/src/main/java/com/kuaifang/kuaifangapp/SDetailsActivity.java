package com.kuaifang.kuaifangapp;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.Toast;

/**
 * Created by Administrator on 2016/11/16.
 */

public class SDetailsActivity extends AppCompatActivity{

    private Toolbar tbDetails;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.specificdetails);
        initView();

    }


    private void initView() {

    }
    public void click(View view){
        switch (view.getId()){
            case R.id.iv_back:
                onBackPressed();
            break;
            case R.id.iv_share:
                Toast.makeText(this,"分享",Toast.LENGTH_LONG).show();
            break;
            case R.id.cb_collect:
                Toast.makeText(this,"收藏",Toast.LENGTH_LONG).show();
            break;
            default:
                break;
        }
    }
}
