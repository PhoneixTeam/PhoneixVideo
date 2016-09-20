package com.qf.phoenixvideos.ui;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.app.ListFragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.SurfaceView;
import android.widget.RadioGroup;

import com.qf.phoenixvideos.R;
import com.qf.phoenixvideos.ui.fragments.LiveFragment;
import com.qf.phoenixvideos.ui.fragments.MainFragment;
import com.qf.phoenixvideos.ui.fragments.MeFragment;
import com.qf.phoenixvideos.ui.fragments.SubscrubeFragment;

import java.lang.reflect.InvocationTargetException;

public class MainActivity extends AppCompatActivity implements RadioGroup.OnCheckedChangeListener {
    private RadioGroup mController;
    private Fragment mShowFragment;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
        mController = (RadioGroup) findViewById(R.id.controller);
        mController.setOnCheckedChangeListener(this);

        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction transaction = fm.beginTransaction();
        mShowFragment = new MainFragment();
        transaction.add(R.id.container, mShowFragment, MeFragment.TAG);
        transaction.commit();
    }

    @Override
    public void onCheckedChanged(RadioGroup group, int checkedId) {
       switch (checkedId){
           case R.id.controller_main:
               switchPages(MainFragment.TAG, MainFragment.class);
               break;
           case R.id.controller_live:
               switchPages(LiveFragment.TAG, LiveFragment.class);
               break;
           case R.id.controller_subscrube:
               switchPages(SubscrubeFragment.TAG, SubscrubeFragment.class);
               break;
           case R.id.controller_me:
               switchPages(MeFragment.TAG, MeFragment.class);
               break;
       }
    }
    private void switchPages(String tag, Class<? extends Fragment> cls) {
        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction transaction = fm.beginTransaction();
        transaction.hide(mShowFragment);

        mShowFragment = fm.findFragmentByTag(tag);
        if (mShowFragment != null) {
            transaction.show(mShowFragment);
        } else {
            try {
                mShowFragment = cls.getConstructor().newInstance();
            } catch (InstantiationException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (InvocationTargetException e) {
                e.printStackTrace();
            } catch (NoSuchMethodException e) {
                e.printStackTrace();
            }
            transaction.add(R.id.container, mShowFragment, tag);
        }
        transaction.commit();
    }
}
