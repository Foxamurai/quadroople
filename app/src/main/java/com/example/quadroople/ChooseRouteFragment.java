package com.example.quadroople;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import androidx.viewpager.widget.ViewPager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.example.quadroople.adapters.RouteAdapter;
import com.google.android.gms.maps.SupportMapFragment;

import java.util.ArrayList;

import dto.Point_to_route;
import dto.Route;

public class ChooseRouteFragment extends Fragment {

    private ListView routesList;
    private RouteAdapter routeAdapter;
    private ArrayList<Route> routes;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    private void initFields() {
        routesList = getActivity().findViewById(R.id.routes_list);
        routes = Route.getRoutes();
        routeAdapter = new RouteAdapter(getContext(), R.layout.item_route, routes);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        return inflater.inflate(R.layout.fragment_choose_route, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initFields();
        routesList.setAdapter(routeAdapter);
        executeRouteItemOnClickListener(routesList);

        SupportMapFragment mapFragment =
                (SupportMapFragment) getChildFragmentManager().findFragmentById(R.id.map);
    }

    private void executeRouteItemOnClickListener(ListView routesList) {
        routesList.setOnItemClickListener( (parent, view, position, id) -> {
            Route route = routes.get(position);
            Bundle bundle = new Bundle();
            bundle.putInt("routeId",route.getId());

            MapsFragment  mapsFragment= new MapsFragment();
            FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();

            mapsFragment.setArguments(bundle);
            fragmentTransaction.replace(R.id.map,mapsFragment);
            fragmentTransaction.isAddToBackStackAllowed();
            fragmentTransaction.addToBackStack(null);
            fragmentTransaction.commit();
            ViewPager viewPager = getActivity().findViewById(R.id.main_tabs_pager);
            viewPager.setCurrentItem(1);

        });


    }
}