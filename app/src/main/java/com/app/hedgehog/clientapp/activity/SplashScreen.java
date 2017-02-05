package com.app.hedgehog.clientapp.activity;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.app.hedgehog.clientapp.R;

public class SplashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.screen_splash);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                if (true) {
                    startActivity(new Intent(SplashScreen.this, LoginActivity.class));
                } else {
                    startActivity(new Intent(SplashScreen.this, MainScreen.class));
                }
                finish();
            }
        }, 1500);
    }
}
