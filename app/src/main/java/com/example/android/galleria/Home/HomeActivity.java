package com.example.android.galleria.Home;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.example.android.galleria.R;
import com.example.android.galleria.Utils.BottomNavigatonHelper;
import com.example.android.galleria.Utils.SectionsPagerAdapter;
import com.ittianyu.bottomnavigationviewex.BottomNavigationViewEx;

import java.io.File;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.List;

public class HomeActivity extends AppCompatActivity {

    private static final String TAG = "HomeActivity";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        Log.d(TAG, "onCreate: ");
        setupviewpager();
        setupbottomnav();

    }

    private void setupviewpager(){
        Log.d(TAG, "setupviewpager: setting up viewpager");
        FragmentManager fm= getSupportFragmentManager();
        SectionsPagerAdapter sectionsPagerAdapter=new SectionsPagerAdapter(fm);
        sectionsPagerAdapter.addFragment(new GalleryFragment());
        sectionsPagerAdapter.addFragment(new LockerFragment());
        ViewPager viewPager=(findViewById(R.id.container));

        viewPager.setAdapter(sectionsPagerAdapter);

        TabLayout tabLayout=findViewById(R.id.tablayout);
        tabLayout.setupWithViewPager(viewPager);


        tabLayout.getTabAt(0).setText("Gallery").setIcon(R.drawable.gallery);
        tabLayout.getTabAt(1).setText("Locker").setIcon(R.drawable.privacy);

    }

    private void setupbottomnav(){
        Log.d(TAG, "setupbottomnav: ");
        BottomNavigationViewEx bottomNavigationViewEx=findViewById(R.id.bottom_navigation_view);
        BottomNavigatonHelper bottomNavigatonHelper=new BottomNavigatonHelper();
        bottomNavigatonHelper.setupBottomNavigation(bottomNavigationViewEx);
    }
}
