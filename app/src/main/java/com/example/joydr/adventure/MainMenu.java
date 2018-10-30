package com.example.joydr.adventure;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainMenu extends AppCompatActivity {
Button newAccountButton = null;
    Button testButton = null;
    Button loginButton = null;
    Button settingsButton = null;
    Button exitGameButton = null;
    Button addFundsbutton =null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);
        newAccountButton = findViewById(R.id.newAccountButton);
        testButton = findViewById(R.id.testButton);
        loginButton = findViewById(R.id.loginButton);
        addFundsbutton = findViewById(R.id.addFundsbutton);
        settingsButton = findViewById(R.id.settingButton);
        exitGameButton = findViewById(R.id.exitGameButton);

        newAccountButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Make a new game
                Intent intent = new Intent(v.getContext(), NewAccount.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
                v.getContext().startActivity(intent);
            }
        });

        testButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //test a battle out
                //Quick Demo
                Intent intent = new Intent(v.getContext(), TestBattle.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
                v.getContext().startActivity(intent);
            }
        });
        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //login into Saved Account
                Intent intent = new Intent(v.getContext(), Login.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
                v.getContext().startActivity(intent);
            }
        });
        addFundsbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Go to web server to buy funds for in game currecny
            }
        });
        settingsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // adjust overall settings of game
            }
        });

        exitGameButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // pop up a fragment window seeing is player wants to quit game
                //If so, then save game data and then kill game

                android.os.Process.killProcess(android.os.Process.myPid());
            }
        });

    }



}
