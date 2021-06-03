package com.example.quadroople;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import dto.Route;

public class CreateRouteFragment extends Fragment {

    private Button createRouteButton;
    private EditText routeNameField;
    private EditText routeDescriptionField;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


    }

    private void initFields() {
        createRouteButton = getActivity().findViewById(R.id.create_route_button);
        routeNameField = getActivity().findViewById(R.id.route_name_field);
        routeDescriptionField = getActivity().findViewById(R.id.route_description_field);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_create_route, container, false);


    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initFields();

        createRouteButton.setOnClickListener(v -> {
            if (TextUtils.isEmpty(routeNameField.getText())) {
                Toast.makeText(getContext(), "Fill route name", Toast.LENGTH_LONG).show();
            } else if (TextUtils.isEmpty(routeDescriptionField.getText())) {
                Toast.makeText(getContext(), "Fill route description", Toast.LENGTH_LONG).show();
            } else {
                Route.createdRoutes.add(new Route(++Route.IdCounter,
                        routeNameField.getText().toString(),
                        routeDescriptionField.getText().toString(),
                        1, 1));

                routeDescriptionField.setText("");
                routeNameField.setText("");

                Intent addPointsMapActivity = new Intent(getContext(), AddPointsMapActivity.class);
                startActivity(addPointsMapActivity);


            }
        });
    }
}