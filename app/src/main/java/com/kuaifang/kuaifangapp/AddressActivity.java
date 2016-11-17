package com.kuaifang.kuaifangapp;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by asus on 2016/11/16.
 */

public class AddressActivity extends AppCompatActivity {

    private EditText mEtAddress;
    private TextView mTvDingWei;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_address);
        mEtAddress = (EditText) findViewById(R.id.et_address);
        mTvDingWei = (TextView) findViewById(R.id.tv_dingwei);

        TextWatcher watcher = new MyTextWatcher();
        mEtAddress.addTextChangedListener(watcher);
    }

    private class MyTextWatcher implements TextWatcher {

        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {

        }

        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {
            Toast.makeText(AddressActivity.this, s+"", Toast.LENGTH_SHORT).show();
        }

        @Override
        public void afterTextChanged(Editable s) {

        }
    }

    public void AddressAction(View v) {
        switch (v.getId()) {
            case R.id.iv_back:
                finish();
                break;
            case R.id.tv_add_address:
                Toast.makeText(this, "跳转", Toast.LENGTH_SHORT).show();
                break;
            case R.id.tv_city:
                Toast.makeText(this, "弹出popwindow", Toast.LENGTH_SHORT).show();
                break;
            case R.id.iv_ref:
                Toast.makeText(this, "重新定位", Toast.LENGTH_SHORT).show();
                break;
        }
    }
}
