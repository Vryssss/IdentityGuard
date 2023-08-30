package com.yrb.identityguard;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class SignupScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup_screen);
    }

    public void imgBacktoLogin(View view) {
        startActivity(new Intent(SignupScreen.this, SigninScreen.class));
        overridePendingTransition(R.anim.zoom_out, R.anim.zoom_in);
    }
}