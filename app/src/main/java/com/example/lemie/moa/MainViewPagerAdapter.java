package com.example.lemie.moa;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.example.lemie.moa.Fragments.AdTestFragment;
import com.example.lemie.moa.Fragments.MemeAdFragment;
import com.example.lemie.moa.Fragments.MemeSwipeFragment;
import com.example.lemie.moa.Fragments.SecondaryFragment;

/**
 * Created by lemie on 12/28/2016.
 */

public class MainViewPagerAdapter extends FragmentPagerAdapter {


    public MainViewPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new MemeSwipeFragment();
            case 1:
                return new MemeAdFragment();
            case 2:
                return new AdTestFragment();
            default:
                return new SecondaryFragment();
        }
    }

    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {
            case 0:
                return "Memes";
            case 1:
                return "Ad Memes";
            case 2:
                return "Settings";
            default:
                return "[NO TITLE]";
        }
    }

    @Override
    public int getCount() {
        return 3;
    }
}
