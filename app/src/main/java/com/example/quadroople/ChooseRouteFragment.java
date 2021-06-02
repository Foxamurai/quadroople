package com.example.quadroople;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.example.quadroople.adapters.RouteAdapter;

import dto.Route;

public class ChooseRouteFragment extends Fragment {

    private ListView routesList;
    private RouteAdapter routeAdapter;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    private void initFields() {
        routesList = getActivity().findViewById(R.id.routes_list);
        routeAdapter = new RouteAdapter(getContext(), R.layout.item_route, Route.getRoutes());
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
    }
}