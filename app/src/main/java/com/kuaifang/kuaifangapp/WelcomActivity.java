package com.kuaifang.kuaifangapp;

import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.kuaifang.fragment.MyFragment;

import java.util.LinkedList;

/**
 * Created by 邱海鹏 on 2016/11/16.
 */

public class WelcomActivity extends AppCompatActivity {


    private ViewPager mVp;
    private ImageView mIvBar;
    private ImageView mIvDot1;
    private ImageView mIvDot2;
    private ImageView mIvDot3;
    private ImageView mIvGoto;
    private Button mBtnFinish;
    private LinkedList<MyFragment> ds;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
        initViews();

        aboutViewPager();
    }

    private void aboutViewPager() {
        // ①数据源
        ds = new LinkedList<>();
        fillDataSource();

        // ②适配器
        PagerAdapter adapter = new MyPageAdapter(getSupportFragmentManager());

        // ③绑定适配器
        mVp.setAdapter(adapter);

        // ④添加监听器（当前ViewPager所对应的页面决定小圆点的状态）
        mVp.setOnPageChangeListener(new ViewPager.SimpleOnPageChangeListener() {

            @Override
            public void onPageSelected(int position) {
                if (position == ds.size() - 1) {
                    mIvGoto.setVisibility(View.VISIBLE);
                    mIvGoto.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            //跳转到主界面
                            startActivity(new Intent(WelcomActivity.this, MainActivity.class));
                            WelcomActivity.this.finish();
                        }
                    });
                } else {
                    mIvGoto.setVisibility(View.GONE);
                }
                switch (position) {
                    case 0:
                        mIvBar.setVisibility(View.VISIBLE);
                        mIvDot1.setVisibility(View.VISIBLE);
                        mIvDot2.setVisibility(View.GONE);
                        mIvDot3.setVisibility(View.GONE);
                        break;
                    case 1:
                        mIvBar.setVisibility(View.VISIBLE);
                        mIvDot1.setVisibility(View.GONE);
                        mIvDot2.setVisibility(View.VISIBLE);
                        mIvDot3.setVisibility(View.GONE);
                        break;
                    case 2:
                        mIvBar.setVisibility(View.VISIBLE);
                        mIvDot1.setVisibility(View.GONE);
                        mIvDot2.setVisibility(View.GONE);
                        mIvDot3.setVisibility(View.VISIBLE);
                        break;
                    case 3:
                        mIvBar.setVisibility(View.GONE);
                        mIvDot1.setVisibility(View.GONE);
                        mIvDot2.setVisibility(View.GONE);
                        mIvDot3.setVisibility(View.GONE);
                        break;
                    default:
                        break;
                }
            }


        });

    }

    // PagerAdapter自定义子类
    private final class MyPageAdapter extends FragmentStatePagerAdapter {

        /**
         * @param fm
         */
        public MyPageAdapter(FragmentManager fm) {
            super(fm);

        }

        @Override
        public Fragment getItem(int position) {

            return ds.get(position);
        }

        @Override
        public int getCount() {

            return ds.size();
        }

    }

    /**
     * 填充数据源
     */
    private void fillDataSource() {
        // 1、将两张图片作为Fragment对应的View
        // 将资源目录drawable下的图片，转换成ImageView的实例，添加到数据源中

        Resources resources = getResources();

        String[] picNames = resources.getStringArray(R.array.picNames);

        for (String picName : picNames) {
            // 获得图片的资源id
            int picResId = resources.getIdentifier(picName, "mipmap",
                    getPackageName());
            addFragmentToDS(picResId);
        }

    }

    private void addFragmentToDS(int picResId) {
        // 构建Fragment的实例
        MyFragment fragment = new MyFragment();

        // 将图片的id设置到MyFragment
        Bundle args = new Bundle();
        args.putInt("picResId", picResId);

        fragment.setArguments(args);

        // 将当前的Fragment实例添加到数据源中
        ds.add(fragment);
    }


    private void initViews() {
        mVp = (ViewPager) findViewById(R.id.welcome_vp_id);
        mIvBar = (ImageView) findViewById(R.id.welcome_iv_bar);
        mIvDot1 = (ImageView) findViewById(R.id.welcome_iv_dot1);
        mIvDot2 = (ImageView) findViewById(R.id.welcome_iv_dot2);
        mIvDot3 = (ImageView) findViewById(R.id.welcome_iv_dot3);
        mIvGoto = (ImageView) findViewById(R.id.welcome_iv_goto);
        mBtnFinish = (Button) findViewById(R.id.welcome_btn_finish);
        mBtnFinish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(WelcomActivity.this, MainActivity.class));
                WelcomActivity.this.finish();
            }
        });
    }
}
