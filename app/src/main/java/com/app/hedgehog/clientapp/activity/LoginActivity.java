package com.app.hedgehog.clientapp.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.app.hedgehog.clientapp.R;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener {

    EditText etLogin;
    EditText etPass;
    Button bEnter;
    Button bRegistration;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        etLogin = (EditText) findViewById(R.id.etLogin);
        etPass = (EditText) findViewById(R.id.etPass);

        bEnter = (Button) findViewById(R.id.bEnter);
        bRegistration = (Button) findViewById(R.id.bRegistration);
        bEnter.setOnClickListener(this);
        bRegistration.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.bEnter:
                break;
            case R.id.bRegistration:
                startActivity(new Intent(LoginActivity.this, RegistrationActivity.class));
                break;
        }

    }
}
