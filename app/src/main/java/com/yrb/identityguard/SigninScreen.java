package com.yrb.identityguard;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.blogspot.atifsoftwares.animatoolib.Animatoo;

public class SigninScreen extends AppCompatActivity {
    Button signupbtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signin_screen);

//        signupbtn = findViewById(R.id.btnSignupFormOpen);
//
//        signupbtn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                startActivity(new Intent(SigninScreen.this, SignupScreen.class));
//                overridePendingTransition(R.anim.zoom_in, R.anim.zoom_out);
//
//            }
//        });
    }

    public void tvOpenSignup(View view) {
        startActivity(new Intent(SigninScreen.this, SignupScreen.class));
        overridePendingTransition(R.anim.zoom_in, R.anim.zoom_out);
    }
}