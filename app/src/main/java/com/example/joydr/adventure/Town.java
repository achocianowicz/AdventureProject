package com.example.joydr.adventure;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Town extends AppCompatActivity {
    // top view
    TextView charName , charlevel, charEXP, userGoldInTown, showDay;

    //town
    Button shopButton = null;
    Button saveButton = null;
    Button trainButton = null;
    Button statsButton = null;
    //Button inventoryButton = null;
    Button questButton = null;
    private int dayCount = -1;
    private String dayType = null;
    private boolean isUserOnQuest= false;

    //The day condition will effect how much items or training cost in town.

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_town);
        charName.findViewById(R.id.charNameTV);
        charlevel.findViewById(R.id.charLevel);
        charEXP.findViewById(R.id.charEXP);
        userGoldInTown.findViewById(R.id.userGold);
        showDay.findViewById(R.id.showDay);

        //town
        shopButton.findViewById(R.id.shopButton);
        saveButton.findViewById(R.id.saveButton);
        trainButton.findViewById(R.id.trainButton);
        statsButton.findViewById(R.id.statsButton);
       // inventoryButton.findViewById(R.id.inventoryButton);
        questButton.findViewById(R.id.questButton);

        // load top bar

        charName.setText( Singleton.getInstance().getCharName());
        charlevel.setText(Singleton.getInstance().getCharLevel());
        charEXP.setText(Singleton.getInstance().getCharEXP());
        userGoldInTown.setText(Singleton.getInstance().getUserGold());

        if(Singleton.getInstance().getDayCount() == null) {
            showDay.setText("1");
        }

        else {
            showDay.setText(Singleton.getInstance().getDayCount());
        }

        //if user came back from a new quest, update day count
        //then get ready to pass info to relavte screens
        //Don't update again until user comes back from a new question


        shopButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // go to shop to by stuff
            }
        });
        saveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Upload to DB
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

      /*  inventoryButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // adjust what is in your inventory, what is on your char
            }
        });
        */
        questButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Go on a quest
                Intent intent = new Intent(v.getContext(), RegionPicker.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
                v.getContext().startActivity(intent);
            }
        });
    }



}
