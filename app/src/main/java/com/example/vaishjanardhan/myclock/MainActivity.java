package com.example.vaishjanardhan.myclock;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;


import android.view.MenuInflater;

import android.view.View;
import android.widget.PopupMenu;


public class MainActivity extends AppCompatActivity implements TabLayout.OnTabSelectedListener {
    //Declaring TabLayout
    TabLayout tabLayout;

    //Initializing viewPager
    private ViewPager viewPager;

    public MainActivity() {
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Initializing the TabLayout
        tabLayout = findViewById(R.id.tabLayout);


        //Adding the tabs using addTab() method
        tabLayout.addTab(tabLayout.newTab().setText(R.string.alarm_disp).setIcon(R.drawable.ic_alarm_white_24dp));
        tabLayout.addTab(tabLayout.newTab().setText(R.string.clock_disp).setIcon(R.drawable.ic_clock_white));
        tabLayout.addTab(tabLayout.newTab().setText(R.string.timer_disp).setIcon(R.drawable.ic_timer_white_24dp));
        tabLayout.addTab(tabLayout.newTab().setText(R.string.stopwatch_disp).setIcon(R.drawable.ic_stopwatch_white_24dp));
        tabLayout.setTabGravity(TabLayout.GRAVITY_FILL);

        //Initializing viewPager
        viewPager = findViewById(R.id.pager);

        //Creating our pager adapter
        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager(), tabLayout.getTabCount());

        //Adding adapter to pager
        viewPager.setAdapter(adapter);

        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));
        tabLayout.setOnTabSelectedListener(this);
    }

    @Override
    public void onTabSelected(TabLayout.Tab tab) {
        viewPager.setCurrentItem(tab.getPosition());

    }

    @Override
    public void onTabUnselected(TabLayout.Tab tab) {

    }

    @Override
    public void onTabReselected(TabLayout.Tab tab) {

    }

    public void showPopup(View v) {
        PopupMenu popup = new PopupMenu(this, v);
        MenuInflater inflater = popup.getMenuInflater();
        inflater.inflate(R.menu.menu_popup, popup.getMenu());
        popup.show();
    }


}