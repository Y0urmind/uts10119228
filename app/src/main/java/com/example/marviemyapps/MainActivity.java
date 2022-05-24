package com.example.marviemyapps;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;

import com.etebarian.meowbottomnavigation.MeowBottomNavigation;

import com.example.marviemyapps.R;

/*
 *     Tanggal Pengerjaan : 19/5/2022
 *     Nim : 10119228
 *     Nama : Marvie Bastian Sampul
 */

public class MainActivity extends AppCompatActivity {

    MeowBottomNavigation bottomNavigation;
    private final static int HOME_ID = 1;
    private final static int DAILY_ID = 2;
    private final static int PROFILE_ID = 5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bottomNavigation = findViewById(R.id.bottom_navigation);
        bottomNavigation.add(new MeowBottomNavigation.Model(1,R.drawable.ic_bottom_navigation_baseline_home_24));
        bottomNavigation.add(new MeowBottomNavigation.Model(2,R.drawable.ic_bottom_navigation_baseline_daily_24));
        bottomNavigation.add(new MeowBottomNavigation.Model(3,R.drawable.ic_bottom_navigation_baseline_gallery_24));
        bottomNavigation.add(new MeowBottomNavigation.Model(4,R.drawable.ic_bottom_navigaiton_baseline_musicvideo_24));
        bottomNavigation.add(new MeowBottomNavigation.Model(5,R.drawable.ic_bottom_navigation_baseline_profile_24));

        // inisiasi awal framelayout sebagai root container akan direplace dengan fragment home
        getSupportFragmentManager().beginTransaction().replace(R.id.root_container, new HomeFragment()).commit();

        bottomNavigation.setOnClickMenuListener(item -> {

        });
        bottomNavigation.setOnReselectListener(item -> {

        });
        bottomNavigation.setOnShowListener(item -> {
            Fragment fragmentSelected = null;
            switch (item.getId())
            {
                case HOME_ID:
                    fragmentSelected = new HomeFragment();
                    break;
                case DAILY_ID:
                    fragmentSelected = new DailyFragment();
                    break;
                case PROFILE_ID:
                    fragmentSelected = new ProfileFragment();
                    break;
            }

            assert fragmentSelected != null;
            getSupportFragmentManager().beginTransaction().replace(R.id.root_container,fragmentSelected).commit();
        });

    }
}
