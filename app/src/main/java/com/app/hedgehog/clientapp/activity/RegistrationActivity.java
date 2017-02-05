package com.app.hedgehog.clientapp.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.app.hedgehog.clientapp.R;

public class RegistrationActivity extends AppCompatActivity {

    EditText etLogin;
    EditText etPass;
    EditText etName;
    EditText etSecondName;
    EditText etPhone;
    Button bOk;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);

        etLogin = (EditText) findViewById(R.id.etLogin);
        etPass = (EditText) findViewById(R.id.etPass);
        etName = (EditText) findViewById(R.id.etName);
        etSecondName = (EditText) findViewById(R.id.etSecondName);
        etPhone = (EditText) findViewById(R.id.etPhone);

        bOk = (Button) findViewById(R.id.bOk);
        bOk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!validate()){
                    return;
                }
            }
        });
    }

    private boolean validate(){
        boolean result = true;
        if (etLogin.getText().toString().length() == 0){
            etLogin.setError(getResources().getString(R.string.field_required));
            result = false;
        }
        if (etPass.getText().toString().length() == 0){
            etPass.setError(getResources().getString(R.string.field_required));
            result = false;
        }
        if (etPhone.getText().toString().length() == 0) {
            etPhone.setError(getResources().getString(R.string.field_required));
            result = false;
        }
        return result;
    }
}
