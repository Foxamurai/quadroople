package com.example.quadroople;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.view.MenuItem;

import com.example.quadroople.adapters.TabsAccessorAdapter;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener {
    private BottomNavigationView bottomNav;
    private TabsAccessorAdapter tabsAccessorAdapter;
    private ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initFields();
        viewPager.setAdapter(tabsAccessorAdapter);
        bottomNav.setOnNavigationItemSelectedListener(this);
        executeViewPagerListener(viewPager);
    }

    private void executeViewPagerListener(ViewPager viewPager) {
        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener(){

            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                switch (position){
                    case 0:
                        bottomNav.getMenu().findItem(R.id.createRouteFragment).setChecked(true);
                        break;
                    case 1:
                        bottomNav.getMenu().findItem(R.id.mapsFragment).setChecked(true);
                        break;
                    case 2:
                        bottomNav.getMenu().findItem(R.id.chooseRouteFragment).setChecked(true);
                        break;
                }
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });
    }

    private void initFields() {
        bottomNav = findViewById(R.id.bottom_navigation);
        tabsAccessorAdapter = new TabsAccessorAdapter(getSupportFragmentManager());
        viewPager = findViewById(R.id.main_tabs_pager);
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
        switch (menuItem.getItemId()){
            case R.id.createRouteFragment:
                viewPager.setCurrentItem(0);
                break;
            case R.id.mapsFragment:
                viewPager.setCurrentItem(1);
                break;
            case R.id.chooseRouteFragment:
                viewPager.setCurrentItem(2);
                break;
        }
        return true;
    }
}