package com.example.vaishjanardhan.myclock;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.example.vaishjanardhan.myclock.Fragment.AlarmFragment;
import com.example.vaishjanardhan.myclock.Fragment.ClockFragment;
import com.example.vaishjanardhan.myclock.Fragment.StopwatchFragment;
import com.example.vaishjanardhan.myclock.Fragment.TimerFragment;


//Extending FragmentStatePagerAdapter
public class ViewPagerAdapter extends FragmentStatePagerAdapter {

    //integer to count number of tabs
    int tabCount;

    //Constructor to the class
    public ViewPagerAdapter(FragmentManager fm, int tabCount) {
        super(fm);
        //Initializing tab count
        this.tabCount = tabCount;
    }

    //Overriding method getItem
    @Override
    public Fragment getItem(int position) {
        //Returning the current tabs
        switch (position) {
            case 0:
                AlarmFragment fragment2 = new AlarmFragment();
                return fragment2;
            case 1:
                ClockFragment fragment1 = new ClockFragment();
                return fragment1;
            case 2:
                TimerFragment fragment3 = new TimerFragment();
                return fragment3;
            case 3:
                StopwatchFragment fragment4 = new StopwatchFragment();
                return fragment4;
            default:
                return null;
        }
    }

    //Overridden method getCount to get the number of tabs
    @Override
    public int getCount() {
        return tabCount;
    }

}