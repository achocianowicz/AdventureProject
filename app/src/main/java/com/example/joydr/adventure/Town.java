package com.example.joydr.adventure;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Town extends AppCompatActivity {
    Button shopButton = null;
    Button homeButton = null;
    Button trainButton = null;
    Button statsButton = null;
    Button inventoryButton = null;
    Button questButton = null;
    private int dayCount = -1;
    private String dayType = null;
    private boolean isUserOnQuest= false;

    //The day condition will effect how much items or training cost in town.

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_town);
        shopButton.findViewById(R.id.shopButton);
        homeButton.findViewById(R.id.homeButton);
        trainButton.findViewById(R.id.trainButton);
        statsButton.findViewById(R.id.statsButton);
        inventoryButton.findViewById(R.id.inventoryButton);
        questButton.findViewById(R.id.questButton);

        //if user came back from a new quest, update day count
        //then get ready to pass info to relavte screens
        //Don't update again until user comes back from a new question


        shopButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // go to shop to by stuff
            }
        });
        homeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Sort iteams, customize char, other
            }
        });
        trainButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // train by either playing mini game or pay gold to get better stats
            }
        });
        statsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // adjust overall stats of your char. Maybe do a char reset
            }
        });

        inventoryButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // adjust what is in your inventory, what is on your char
            }
        });
        questButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Go on a quest
            }
        });
    }



}
