package com.example.joydr.adventure;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class UserAccount extends AppCompatActivity {
    Button createCharacterButton = null;
    Button pickCharacterButton = null;
    Button addFundsButton = null;
    Button exitButton= null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_account);
        createCharacterButton = findViewById(R.id.createCharacterButton);
        pickCharacterButton = findViewById(R.id.pickCharacterButton);
        addFundsButton = findViewById(R.id.addFundsButton);
        exitButton = findViewById(R.id.exitButton);


        createCharacterButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), CharacterCreator.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
                v.getContext().startActivity(intent);

            }
        });

        pickCharacterButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // pick from characters to go adventuring
                //oops, i meant to create a character
                // Uh Oh, need to go to hospital to get my adventurer back
                Intent intent = new Intent(v.getContext(), UserCharacters.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
                v.getContext().startActivity(intent);


            }
        });
        addFundsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // link to cloud server to add funds

            }
        });
        exitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // Save and exit game

            }
        });
    }
}
