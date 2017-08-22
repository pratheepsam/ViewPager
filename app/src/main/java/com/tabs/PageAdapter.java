package com.tabs;


import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by sysadmin on 22/8/17.
 */

public class PageAdapter extends FragmentPagerAdapter {

    private static int NUM_ITEMS = 3;
    public  PageAdapter(FragmentManager fragmentManager){
        super(fragmentManager);
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return "Page " + position;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return FirstFragment.newInstance(0,"Page # 1");
            case 1:
                return FirstFragment.newInstance(1,"Page # 2");
            case 2:
                return FirstFragment.newInstance(2,"Page # 3");
            default:
                return null;
        }


    }

    @Override
    public int getCount() {
        return NUM_ITEMS;
    }
}
