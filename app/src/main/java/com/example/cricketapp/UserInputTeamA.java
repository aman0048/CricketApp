package com.example.cricketapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class UserInputTeamA extends AppCompatActivity {

    EditText teamName;
    EditText noOfPlayers;
    EditText getNoOfOvers;
    EditText playerName;

    int count = 1;

    ArrayList<String> players = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_input_team);
    }


//    public void display(String aman, int number){
//        EditText editText = (EditText) findViewById(R.id.submit);
//
//    }

    public void teamName(View view){

    }

    public void getValue(View view) {

        if (count == 1) {
            Toast.makeText(this, "Hello bhai", Toast.LENGTH_SHORT).show();
            teamName = (EditText) findViewById(R.id.teamNameDalo);
            noOfPlayers = (EditText) findViewById(R.id.numberOfPlayers);

            String temp = noOfPlayers.getText().toString();
            int value = 0;
            value = Integer.parseInt(temp);

            for (int i = 0; i<value ;i++){
                players.add("aman");
            }

            getNoOfOvers = (EditText) findViewById(R.id.numberOfOvers);
            playerName = (EditText) findViewById(R.id.playerName);
            count++;
        }
        else{
            // intent transfer will process here
            Toast.makeText(this, "Khatam bhai shubharika", Toast.LENGTH_SHORT).show();
        }
    }

}
