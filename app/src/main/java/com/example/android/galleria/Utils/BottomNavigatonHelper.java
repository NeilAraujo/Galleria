package com.example.android.galleria.Utils;

import android.util.Log;

import com.ittianyu.bottomnavigationviewex.BottomNavigationViewEx;

public class BottomNavigatonHelper {
    private static final String TAG = "BottomNavigatonHelper";

    public void setupBottomNavigation(BottomNavigationViewEx bottomNavigationViewEx){
        Log.d(TAG, "setupBottomNavigation: "+"setting up bottom nav");
        bottomNavigationViewEx.enableAnimation(false);
        bottomNavigationViewEx.enableShiftingMode(false);
        bottomNavigationViewEx.enableItemShiftingMode(false);
        bottomNavigationViewEx.setIconsMarginTop(10);
        bottomNavigationViewEx.setTextSize(13);
    }
}
