package com.example.joydr.adventure;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainMenu extends AppCompatActivity {
Button newButton = null;
    Button testButton = null;
    Button loadButton = null;
    Button settingsButton = null;
    Button exitGameButton = null;
    Button addFundsbutton =null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);
        newButton = findViewById(R.id.newButton);
        testButton = findViewById(R.id.testButton);
        loadButton = findViewById(R.id.loadButton);
        addFundsbutton = findViewById(R.id.addFundsbutton);
        settingsButton = findViewById(R.id.settingButton);
        exitGameButton = findViewById(R.id.exitGameButton);

        newButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Make a new game
                Intent intent = new Intent(v.getContext(), CharacterCreator.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
                v.getContext().startActivity(intent);
            }
        });

        testButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //test a battle out
                Intent intent = new Intent(v.getContext(), TestBattle.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
                v.getContext().startActivity(intent);
            }
        });
        loadButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //load an old saved game
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
