package com.example.joydr.adventure;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class TestBattle extends AppCompatActivity {
    Button enemyButton = null;
    Button rightButton = null;
    Button leftButton = null;
    Button backpackButton = null;
    Button runButton = null;
    TextView enemyHealthtextView = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_battle);

        enemyButton = findViewById(R.id.enemyButton);
        rightButton = findViewById(R.id.rightButton);
        leftButton = findViewById(R.id.leftButton);
        backpackButton = findViewById(R.id.backpackButton);
        runButton = findViewById(R.id.runButton);

        enemyHealthtextView = findViewById(R.id.enemyHealthtextView);
        enemyHealthtextView.setText(String.valueOf(100));
        enemyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                DealDamage();

            }
        });

        rightButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            //UseRightHand();
            }
        });

        leftButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
             //   UseLeftHand();

            }
        });

        backpackButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //  OpenBackPack();

            }
        });

        runButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(v.getContext(), MainMenu.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
                v.getContext().startActivity(intent);
                finish();

            }
        });


    }

    private void DealDamage () {
int damage = 10;

       int currentEnemyHealth = Integer.parseInt(enemyHealthtextView.getText().toString());

        currentEnemyHealth -= damage;
        enemyHealthtextView.setText(String.valueOf(currentEnemyHealth));



    }
}
