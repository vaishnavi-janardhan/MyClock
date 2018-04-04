package com.example.vaishjanardhan.myclock.Fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.SwitchCompat;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.Switch;

import com.example.vaishjanardhan.myclock.R;

//Class extending fragment
public class AlarmFragment extends Fragment {
    //Overridden method onCreateView
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        //Returning the layout file after inflating 
        return inflater.inflate(R.layout.fragment_alarm, container, false);
    }
}