package com.example.cricketapp;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

//    Handler handler;

    private static int SPLASH_SCREEN_TIME_OUT=1000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

//            getWindow().setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_IN_SCREEN,
//                    WindowManager.LayoutParams.FLAG_LAYOUT_IN_SCREEN);
//            //This method is used so that your splash activity
//            //can cover the entire screen.
//
//            setContentView(R.layout.activity_main);
//            //this will bind your MainActivity.class file with activity_main.
//
//            new Handler().postDelayed(new Runnable() {
//                @Override
//                public void run() {
//                    Intent i=new Intent(MainActivity.this,
//                            HomePage.class);
//                    //Intent is used to switch from one activity to another.
//
//                    startActivity(i);
//                    //invoke the SecondActivity.
//
//                    finish();
//                    //the current activity will get finished.
//                }
//            }, SPLASH_SCREEN_TIME_OUT);
//        }

        setContentView(R.layout.activity_main);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(MainActivity.this, UserInputTeamA.class);
                startActivity(intent);
                finish();
            }
        }, 1000);
    }





}
