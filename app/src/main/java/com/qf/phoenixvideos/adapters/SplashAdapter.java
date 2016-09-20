package com.qf.phoenixvideos.adapters;

import android.support.v4.view.PagerAdapter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import java.util.List;

/**
 * Created by 刘学斌 on 2016/9/19 0019.
 */
public class SplashAdapter extends PagerAdapter {
    private List<ImageView> data;

    public SplashAdapter(List<ImageView> data) {
        this.data = data;
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        // 添加到显示的容器中
        int tranPosition = position % data.size();

        container.addView(data.get(tranPosition));
        // 返回 item
        return data.get(tranPosition);
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        int tranPosition = position % data.size();
        container.removeView(data.get(tranPosition));
    }

    @Override
    public int getCount() {
        return data.size();
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view == object;
    }
}
