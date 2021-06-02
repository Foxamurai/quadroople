package com.example.quadroople;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.gms.maps.GoogleMap;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends FragmentActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BottomNavigationView bottomNav = findViewById(R.id.bottom_navigation);
        bottomNav.setOnNavigationItemSelectedListener(navListener);

        getSupportFragmentManager().beginTransaction().replace(R.id.main_container, new MapsFragment()).commit();
    }

    private BottomNavigationView.OnNavigationItemSelectedListener navListener =
            new BottomNavigationView.OnNavigationItemSelectedListener() {
                @Override
                public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                    Fragment selectedFragment = null;

                    switch (item.getItemId()){
                        case R.id.mapsFragment:
                            selectedFragment = new MapsFragment();
                            break;
                        case R.id.createRouteFragment:
                            selectedFragment = new CreateRouteFragment();
                            break;
                        case R.id.chooseRouteFragment:
                            selectedFragment = new ChooseRouteFragment();
                            break;
                    }
                    getSupportFragmentManager().beginTransaction().replace(R.id.main_container,
                            selectedFragment).commit();

                    return true;
                }
            };
}