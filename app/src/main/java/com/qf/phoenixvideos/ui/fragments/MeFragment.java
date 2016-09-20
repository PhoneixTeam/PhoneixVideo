package com.qf.phoenixvideos.ui.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.qf.phoenixvideos.R;
import com.qf.phoenixvideos.base.BaseFragment;

/**
 * Created by 刘学斌 on 2016/9/19 0019.
 */
public class MeFragment extends BaseFragment{
    public static final String TAG = MeFragment.class.getSimpleName();
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        layout=inflater.inflate(R.layout.me_fragment,container,false);
        return layout;
    }
}
