package com.qf.phoenixvideos.ui;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.widget.ImageView;


import com.qf.phoenixvideos.R;
import com.qf.phoenixvideos.adapters.SplashAdapter;
import com.qf.phoenixvideos.base.BaseActivity;

import java.util.ArrayList;
import java.util.List;

public class SplashActivity extends BaseActivity implements View.OnClickListener {

    private ViewPager mViewPager;
    private SplashAdapter mAdapter;
    private ImageView splash5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        initView();
    }

    @Override
    protected void initView() {
        super.initView();
        mViewPager = (ViewPager) findViewById(R.id.Splash_Viewpager);
        List<ImageView> data=new ArrayList<>();
        ImageView splash1 = new ImageView(this);
        splash1.setImageResource(R.mipmap.splash_guide1);
        splash1.setScaleType(ImageView.ScaleType.FIT_XY);
        ImageView splash2 = new ImageView(this);
        splash2.setImageResource(R.mipmap.splash_guide2);
        splash2.setScaleType(ImageView.ScaleType.FIT_XY);
        ImageView splash3 = new ImageView(this);
        splash3.setImageResource(R.mipmap.splash_guide3);
        splash3.setScaleType(ImageView.ScaleType.FIT_XY);
        ImageView splash4 = new ImageView(this);
        splash4.setImageResource(R.mipmap.splash_guide4);
        splash4.setScaleType(ImageView.ScaleType.FIT_XY);
        ImageView splash5 = new ImageView(this);
        splash5.setImageResource(R.mipmap.splash_guide5);
        splash5.setScaleType(ImageView.ScaleType.FIT_XY);
        data.add(splash1);
        data.add(splash2);
        data.add(splash3);
        data.add(splash4);
        data.add(splash5);
        mAdapter = new SplashAdapter(data);
        mViewPager.setAdapter(mAdapter);
        splash5.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        startActivity(new Intent(SplashActivity.this,MainActivity.class));
        //结束本页面
        finish();

    }
}
