package com.example.lemie.moa;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;

import com.google.android.gms.ads.MobileAds;

/**
 * Created by lemie on 12/28/2016.
 */
public class MainViewPagerActivity extends FragmentActivity {

    ViewPager mViewPager;
    MainViewPagerAdapter mPagerAdapter;
    TabLayout mTabLayout;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_view_pager);

        mViewPager = (ViewPager) findViewById(R.id.pager);
        mTabLayout = (TabLayout) findViewById(R.id.tabs);
        mPagerAdapter = new MainViewPagerAdapter(getSupportFragmentManager());

        MobileAds.initialize(getApplicationContext());

        mViewPager.setAdapter(mPagerAdapter);
        mTabLayout.setupWithViewPager(mViewPager);
    }



}
