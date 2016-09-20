package com.qf.phoenixvideos.base;

import android.support.annotation.LayoutRes;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by Johnjohn on 2016/8/1.
 */
public class BaseActivity extends AppCompatActivity {
    @Override
    public void setContentView(@LayoutRes int layoutResID) {
        super.setContentView(layoutResID);

    }

    protected void initView(){};
    protected void initData(){};
    protected void setData(){};
    protected void setListener(){};
}
