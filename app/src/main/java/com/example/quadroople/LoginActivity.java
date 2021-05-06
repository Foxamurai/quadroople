package com.example.quadroople;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class LoginActivity extends AppCompatActivity {

    private int onLogoCounter = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

    }

    public void onRegistration(View view){
        Intent intent = new Intent(this, RegistrationActivity.class);
        startActivity(intent);
    }

    public void onLogin(View view){
        Intent intent = new Intent(this, MapsActivity.class);
        startActivity(intent);
    }

    public void onLogo(View view){
        if(onLogoCounter == 2){
            onLogoCounter = 0;
            Intent intent = new Intent(this,AnekActivity.class);
            startActivity(intent);
        }else {
            onLogoCounter++;
        }

    }
}