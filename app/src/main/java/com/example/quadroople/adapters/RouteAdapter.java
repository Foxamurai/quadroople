package com.example.quadroople.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.quadroople.R;

import java.util.ArrayList;

import dto.Route;

public class RouteAdapter extends ArrayAdapter<Route> {

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        Route route = getItem(position);
        if (convertView == null){
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.item_route,null);
        }

        ((TextView) convertView.findViewById(R.id.route_name)).setText(route.getName());
        ((TextView) convertView.findViewById(R.id.route_description)).setText(route.getDescription());


        return convertView;

    }

    public RouteAdapter(@NonNull Context context, int resource, ArrayList<Route> routes) {
        super(context, resource, routes);


    }
}
