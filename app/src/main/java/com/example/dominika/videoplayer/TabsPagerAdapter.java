package com.example.dominika.videoplayer;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;


public class TabsPagerAdapter extends FragmentPagerAdapter {



    public TabsPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {

        switch (position) {
            case 0:
                return new FragmentOne();
            case 1:
                return new FragmentTwo();
            case 2:
                return new FragmentThree();
            case 3:
                return new FragmentFour();
            case 4:
                return new FragmentFive();
            case 5:
                return new FragmentSix();
            case 6:
                return new FragmentSeven();
            case 7:
                return new FragmentEight();
            case 8:
                return new FragmentNine();
            case 9:
                return new FragmentTen();
            case 10:
                return new FragmentEleven();
            case 11:
                return new FragmentTwelve();
            default:
                break;
        }

        return null;
    }

    @Override
    public int getCount() {
        return 12;
    }

}