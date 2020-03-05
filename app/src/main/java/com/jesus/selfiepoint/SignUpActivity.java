package com.jesus.selfiepoint;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class SignUpActivity extends AppCompatActivity implements View.OnClickListener {
    Button sign_up;
    EditText password;
    EditText repassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
        sign_up = findViewById(R.id.sign_up);
        repassword =findViewById(R.id.repassword);
        password =findViewById(R.id.password);

        sign_up.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.sign_up:
                if (password.getText().toString().equals(repassword.getText().toString())==true) {
                Intent intent = new Intent(this, MainActivity.class);
                startActivity(intent);
                break; }
                if (password.getText().toString().equals(repassword.getText().toString())==false){
                    Toast toast = Toast.makeText(getApplicationContext(), "Passwords do not match!", Toast.LENGTH_SHORT);
                    toast.show();
                }
            default:
                break;

        }
    }
}
