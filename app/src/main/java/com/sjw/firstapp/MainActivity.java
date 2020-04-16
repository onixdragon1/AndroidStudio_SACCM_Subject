package com.sjw.firstapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button signin_btn, signup_btn;
    ImageView main_iv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signin);

        //선언한 뷰 초기화
        signin_btn = findViewById(R.id.signin_btn);
        signup_btn = findViewById(R.id.signup_btn);
        main_iv = findViewById(R.id.main_iv);

        //초기화한 위젯에 이벤트 지정
        signin_btn.setOnClickListener(this);
        signup_btn.setOnClickListener(this);
        main_iv.setOnClickListener(this);
    }

    //실질적인 이벤트 구현부
    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case R.id.signup_btn:
                //Toast.makeText(getApplicationContext(), "Sign up Button Clicked!", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(getApplicationContext(), SignupActivity.class);
                startActivityForResult(intent, 100);
                break;
            case R.id.signin_btn:
                Toast.makeText(getApplicationContext(), "Sign in Button Clicked!", Toast.LENGTH_SHORT).show();
                break;
            case R.id.main_iv:
                Toast.makeText(getApplicationContext(), "ImageView Clicked!", Toast.LENGTH_SHORT).show();
                break;
        }
    }
}
