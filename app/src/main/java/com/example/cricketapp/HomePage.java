package com.example.cricketapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class HomePage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);
    }

    int playerScore = 0;
    int total  = 0;
    int out = 0;


    public void getSix(View view){
        total+=6;
        displayOutcome(total);
        playerScore+=6;
        displayPlayerScore(playerScore);
    }
    public void getFour(View view){
        total+=4;
        displayOutcome(total);
        playerScore+=4;
        displayPlayerScore(playerScore);
    }
    public void getWide(View view){
        total+=1;
        displayOutcome(total);
    }
    public void getNoBall(View view){
        total+=1;
        displayOutcome(total);
    }
    public void getOne(View view){
        total+=1;
        displayOutcome(total);
        playerScore+=1;
        displayPlayerScore(playerScore);
    }
    public void getTwo(View view){
        total+=2;
        displayOutcome(total);
        playerScore+=2;
        displayPlayerScore(playerScore);
    }
    public void getThree(View view){
        total+=3;
        displayOutcome(total);
        playerScore+=3;
        displayPlayerScore(playerScore);
    }


    public void displayOutcome (int score){
        TextView scoreView = (TextView) findViewById(R.id.TeamATotal);
        scoreView.setText(String.valueOf(score));
    }

    public void displayPlayerScore (int score){
        TextView scoreView = (TextView) findViewById(R.id.playerScore);
        scoreView.setText(String.valueOf(score));
    }

    public void displayForOut (int score){
        TextView wicketView = (TextView) findViewById(R.id.teamAWicket);
        wicketView.setText(String.valueOf(score));
    }


    public void getOut(View view){

        if(out<10) {
            out += 1;
            displayForOut(out);
        }
        else{
            Toast toast =  Toast.makeText(this,"whole team down", Toast.LENGTH_SHORT);
            toast.show();
        }
    }
}