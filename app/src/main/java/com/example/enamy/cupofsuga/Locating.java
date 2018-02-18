package com.example.enamy.cupofsuga;

import android.content.Intent;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Locating extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_locating);


        CountDownTimer countDownTimer = new CountDownTimer(3000, 1000) {
            @Override
            public void onTick(long timeLeft) {
                System.out.println("refefer");
           }

            @Override
            public void onFinish() {
                System.out.println("started!");
                locate();

            }
        }.start();

    }

    public void locate() {
        Intent intent = new Intent(this, Result.class);
        startActivity(intent);
    }


}






