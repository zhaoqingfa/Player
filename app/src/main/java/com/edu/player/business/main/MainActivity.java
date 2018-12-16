package com.edu.player.business.main;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ViewParent;

import com.edu.player.R;
import com.edu.player.base.BaseActivity;
import com.edu.player.base.interfac.IPresenter;
import com.edu.player.common.log.LogUtil;
import com.edu.player.common.widgets.ViewPagerAdapter;

public class MainActivity extends BaseActivity<IPresenter> {
    private ViewPager mViewPager;
    private TabLayout mTabLayout;

    private ViewPagerAdapter adapter;

    @Override
    protected int getLayoutId() {
        return R.layout.activity_main;
    }

    @Override
    protected void initView() {
        super.initView();
        mViewPager = findViewById(R.id.vp);
        mTabLayout = findViewById(R.id.tl);
    }

    @Override
    protected void initData() {
        super.initData();
        adapter = new ViewPagerAdapter(getSupportFragmentManager(), this, null, null);
        mViewPager.setAdapter(adapter);
        mTabLayout.setupWithViewPager(mViewPager);
    }

    @Override
    protected void initListener() {
        super.initListener();
        mTabLayout.addOnTabSelectedListener(new TabLayout.BaseOnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                switch (tab.getPosition()) {
                    case 0:
                        break;
                }
                tab.getCustomView().findViewById()
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {
                switch (tab.getPosition()) {

                }
            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
    }


    @Override
    public IPresenter initPresenter() {
        return null;
    }
}
