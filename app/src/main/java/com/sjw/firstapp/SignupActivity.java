package com.sjw.firstapp;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class SignupActivity extends AppCompatActivity {

    EditText email_et, password_et;
    Button signup_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        email_et = findViewById(R.id.email_et);
        password_et = findViewById(R.id.password_et);
        signup_btn = findViewById(R.id.signup_btn);

        signup_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(CheckValid()){
                    Log.d("SignupActivity", "Success!");
                    Intent intent = new Intent();
                } else {
                    Log.d("SignupActivity", "OnClick CheckValid is false");
                }
            }
        });
    }

    private boolean CheckValid(){
        if(email_et.getText().toString().length() < 5 || password_et.getText().toString().length() < 2){
            Toast.makeText(getApplicationContext(), "이메일과 비밀번호를 확인하세요!", Toast.LENGTH_SHORT).show();
            return false;
        } else {
            return true;
        }
    }
}
