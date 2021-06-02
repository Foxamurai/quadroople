package com.example.quadroople;


import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class TabsAccessorAdapter extends FragmentPagerAdapter {

    public TabsAccessorAdapter(@NonNull FragmentManager fm) {
        super(fm);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                CreateRouteFragment createRouteFragment = new CreateRouteFragment();
                return createRouteFragment;
            case 1:
                MapsFragment mapsFragment = new MapsFragment();
                return mapsFragment;
            case 2:
                ChooseRouteFragment chooseRouteFragment = new ChooseRouteFragment();
                return chooseRouteFragment;
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return 3;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {
            case 0:
                return "Create";
            case 1:
                return "Map";
            case 2:
                return "Routes";
            default:
                return null;
        }
    }
}
