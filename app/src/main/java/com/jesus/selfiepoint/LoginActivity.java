package com.jesus.selfiepoint;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

public class LoginActivity  extends AppCompatActivity implements View.OnClickListener {
    Button sign_up;
    Button sign_in;


        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_login);
            sign_up=findViewById(R.id.sign_up);
            sign_up.setOnClickListener(this);
            sign_in=findViewById(R.id.sign_in);
            sign_in.setOnClickListener(this);



            if (checkSelfPermission(Manifest.permission.CAMERA) != PackageManager.PERMISSION_GRANTED
                    ||
                    (ContextCompat.checkSelfPermission(LoginActivity.this, Manifest.permission.WRITE_EXTERNAL_STORAGE) != PackageManager.PERMISSION_GRANTED)
            )
            {
                requestPermissions(new String[]{Manifest.permission.CAMERA,Manifest.permission.WRITE_EXTERNAL_STORAGE}, 1);
            }
        }


    @Override
    public void onClick(View v) {switch (v.getId()) {
        case R.id.sign_up:
            Intent intent = new Intent(getApplicationContext(), SignUpActivity.class);
            startActivity(intent);
            break;
        case R.id.sign_in:
            Intent intent1 = new Intent(getApplicationContext(), MainActivity.class);
            startActivity(intent1);
            break;
        default:
            break;


    }
        }
}

