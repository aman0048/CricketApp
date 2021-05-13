package com.example.cricketapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class UserInputTeamA extends AppCompatActivity {

    EditText teamName;
    EditText noOfPlayers;
    EditText getNoOfOvers;
    EditText playerName;
    EditText teamName1;
    ListView show;
    TextView result;

    String a,b,c,d;


    Button btn;

    int count = 1;

    ArrayList<String> players = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_input_team);


        // this is the code for adding players name into arrayList

//        playerName = (EditText) findViewById(R.id.playerName);
//        show = (ListView) findViewById(R.id.listview);
//        btn = (Button) findViewById(R.id.submit);

//        btn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                String getInput = playerName.getText().toString();
//
//                teamName = (EditText) findViewById(R.id.teamNameDalo);
//                noOfPlayers = (EditText) findViewById(R.id.numberOfPlayers);
//
//                if (players.contains(getInput)) {
//                    Toast.makeText(getBaseContext(), "Items already added to the array", Toast.LENGTH_LONG).show();
//                } else if (getInput.trim().equals("")) {
////                        Toast.makeText(getBaseContext(), "Items Field is empty", Toast.LENGTH_LONG).show();
//                    Intent intent = new Intent(UserInputTeamA.this, HomePage.class);
//                    startActivity(intent);
//                } else {
//                    players.add(getInput);
//                    ArrayAdapter<String> adapter = new ArrayAdapter<String>(UserInputTeamA.this, android.R.layout.simple_list_item_1, players);
//                    show.setAdapter(adapter);
//                    ((EditText) findViewById(R.id.playerName)).setText(" ");
//                }
//                getNoOfOvers = (EditText) findViewById(R.id.numberOfOvers);
//
//            }
//
//        });

        btn = (Button) findViewById(R.id.submit);
        teamName = (EditText) findViewById(R.id.teamNameDalo);
        noOfPlayers = (EditText) findViewById(R.id.numberOfPlayers);
        getNoOfOvers = (EditText) findViewById(R.id.numberOfOvers);



        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (count == 1) {

                    String name = teamName.getText().toString();
                    a = name;
                    String nop = noOfPlayers.getText().toString();
                    b= nop;
                    String noo = getNoOfOvers.getText().toString();
                    c = noo;

                    if (name.length()==0){
                        //EditText is empty
                        Toast.makeText(UserInputTeamA.this, "Empty Name", Toast.LENGTH_SHORT).show();
                    }else {
                        teamName.setText(name);
                    }
                    if(nop.length()==0){
                        Toast.makeText(UserInputTeamA.this, " no players Empty", Toast.LENGTH_SHORT).show();
                    }
                    else{
                        noOfPlayers.setText(nop);
                    }
                    if(noo.length()==0){
                        Toast.makeText(UserInputTeamA.this, " no overs Empty", Toast.LENGTH_SHORT).show();
                    }
                    else{
                        getNoOfOvers.setText(noo);
                    }
                   Log.v(a,"a ka value");
                    Log.v(b,"b ka value");
                    Log.v(c,"c ka value");

//                    result.setText("Team Name:\t" + name + "\n Number of Players:\t" +nop+ "\n Number of overs:\t"+noo);

//                    Toast.makeText(UserInputTeamA.this, "into if part", Toast.LENGTH_SHORT).show();
                    count++;

                } else if(count == 2 ) {

                    teamName.setText("");
//                    result.setText("");
                    teamName.requestFocus();

                    String name1 = teamName.getText().toString();
                    d = name1;
                    Log.v(d,"d ka value");

                    if (name1.length() == 0) {
                        //EditText is empty
                        Toast.makeText(UserInputTeamA.this, "Team name Empty", Toast.LENGTH_SHORT).show();
                    } else {
                        teamName.setText(name1);
                    }

                    String nop = noOfPlayers.getText().toString();
                    String noo = getNoOfOvers.getText().toString();

                    noOfPlayers.setText(nop);
                    getNoOfOvers.setText(noo);
//                    result.setText("Team Name:\t" + name + "\n Number of Players:\t" +nop+ "\n Number of overs:\t"+noo);

                    count++;

                }
                else{
                    Intent intent = new Intent(UserInputTeamA.this, HomePage.class);
                    startActivity(intent);
                }

            }
        });



//
//                                   public void getvalue(View view){
////                                       if(count == 1){
////                                           teamName = (EditText) findViewById(R.id.teamNameDalo);
////                                           noOfPlayers = (EditText) findViewById(R.id.numberOfPlayers);
////                                           getNoOfOvers = (EditText) findViewById(R.id.numberOfOvers);
////                                           Toast.makeText(getBaseContext(), "into if part", Toast.LENGTH_LONG).show();
////                                           count++;
////                                       }
////
////                                       else if(count ==2) {
////                                           teamName1 = (EditText) findViewById(R.id.teamNameDalo);
////
////                                           Log.v("line one", "for team name");
////                                           noOfPlayers = (EditText) findViewById(R.id.numberOfPlayers);
////                                           String nop = noOfPlayers.getText().toString();
////                                           Log.v("line two", "for no of players");
////                                           getNoOfOvers = (EditText) findViewById(R.id.numberOfOvers);
////                                           String noo = getNoOfOvers.getText().toString();
////                                           Log.v("line three", "for no of overs");
////                                           noOfPlayers.setText(nop);
////                                           getNoOfOvers.setText(noo);
////
////                                           Toast.makeText(getBaseContext(), "into else part", Toast.LENGTH_LONG).show();
////                                           count++;
////                                       }
////                                       else {
////                                           Intent intent = new Intent(UserInputTeamA.this, HomePage.class);
////                                           startActivity(intent);
////                                       }
//
//                                   }
    }

    public void getvalue(View view){

    }
}


//    public void display(String aman, int number){
//        EditText editText = (EditText) findViewById(R.id.submit);
//
//    }

//    public void teamName(View view){
//
//    }
//
//    public void getValue(View view) {
//
//        if (count == 1) {
//            Toast.makeText(this, "Hello bhai", Toast.LENGTH_SHORT).show();
//            teamName = (EditText) findViewById(R.id.teamNameDalo);
//            noOfPlayers = (EditText) findViewById(R.id.numberOfPlayers);
//
//            playerName = (EditText)findViewById(R.id.playerName);
//
//            String temp1 = playerName.getText().toString();
//
//            Log.v("hello amamn", temp1);
//
//
////            String temp = noOfPlayers.getText().toString();
////
////
////            int value = 0;
////            value = Integer.parseInt(temp);
//
////            for (int i = 0; i<value ;i++){
////                players.add("aman");
////            }
//
//            getNoOfOvers = (EditText) findViewById(R.id.numberOfOvers);
//            playerName = (EditText) findViewById(R.id.playerName);
//            count++;
//        }
//        else{
//            // intent transfer will process here
//            Toast.makeText(this, "Khatam bhai shubharika", Toast.LENGTH_SHORT).show();
//        }
//    }


