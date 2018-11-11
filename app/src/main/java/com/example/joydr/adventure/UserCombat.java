package com.example.joydr.adventure;

import android.content.Context;
import android.net.Uri;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class UserCombat extends AppCompatActivity implements  CurrentCharacterMoveSet.OnFragmentInteractionListener {
    // Enemy components
    TextView enemyLevel = null;
    TextView enemyNameTextView = null;
     private String enenmy1Name = null;
    TextView enemyBlockAmount = null;
    private double enemy1Level = -1,enemy1Bolck = -1, enemy1CurrentHp = -1, enemy1BaseHp = -1;
    TextView enemyCurrentHP = null;
    TextView enemyBaseHP = null;
    ImageView enemyImage = null;


    // Player components
    TextView characterLevel = null;
    TextView characterNameTextView = null;
    private String character1Name = null;
    TextView characterBlockAmount = null;
    private double character1Level = -1,character1Block = -1, character1CurrentHp = -1, character1BaseHp = -1;
    TextView characterCurrentHP = null;
    TextView characterBaseHP = null;
    String displayCharacterName = null;
    int displayCharacterLevel = -1, displayCharacterBlock = -1, displaycharacterCurrentHp,  displayCharacterBaseHp;


    //Buttons

    Button fleeButton = null;
    Button inventoryButton =null;
    Button movesButton = null;

    //Fragments
      //To hold combat moves
    CurrentCharacterMoveSet currentCharacterMoveSet = null;

      //To look in inventory
      //


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_combat);
// Enemy Compoments
        enemyLevel = findViewById(R.id.enemyLevel);
        enemyNameTextView =findViewById(R.id.enemyNameTextView);
        enemyBlockAmount = findViewById(R.id.enemyBlockAmount);
        enemyCurrentHP = findViewById(R.id.enemyCurentHP);
        enemyBaseHP = findViewById(R.id.enemyBaseHP);
        enemyImage = findViewById( R.id.enemyImage);

        // User componts
        characterLevel = findViewById(R.id.characterLevel);
        characterNameTextView =findViewById(R.id.characterNameTextView);
        characterBlockAmount = findViewById(R.id.characterBlockAmount);
        characterCurrentHP = findViewById(R.id.characterCurrentHP);
        characterBaseHP = findViewById(R.id.characterBaseHP);
        //GetCharacterStats();
        characterLevel.setText(displayCharacterLevel);
        characterNameTextView.setText(displayCharacterName);
        characterBlockAmount.setText(displayCharacterBlock);
        characterCurrentHP.setText(displaycharacterCurrentHp);
        characterBaseHP.setText(displayCharacterBaseHp);


        //BUtton
fleeButton = findViewById(R.id.fleeButton);
inventoryButton = findViewById(R.id.inventoryButton);
movesButton = findViewById(R.id.moveButton);
        //fragments
        FragmentManager fragmentManager = getSupportFragmentManager();
        currentCharacterMoveSet =  (CurrentCharacterMoveSet) fragmentManager.findFragmentById(R.id.currentCharacterMoveSet);

        fleeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            // pop up fragment to see if user want to leave battle
                //if so what is the pentaly
                // return to Quest or quest reward screen
            }
        });

        inventoryButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // pop up to use inventory and items


            }
        });

        movesButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // fragment window to show the Attacks and Blocks user can use


            }
        });



    }

    public void GetCharacterStats(Context context) throws IOException {
        FileReader in = null;
        String[] characterStats = null;
        characterStats = new String[6];
        InputStream inputStream = context.openFileInput("~\\AdventureProject\\app\\src\\main\\java\\com\\example\\joydr\\adventure\\UserCharacterStats.txt");
        //FileWriter out = null;
//UserCharacterStats.txt
        try {
           // in = new FileReader("~\\AdventureProject\\app\\src\\main\\java\\com\\example\\joydr\\adventure\\UserCharacterStats.txt");
            //out = new FileWriter("output.txt");
            if(inputStream !=null){
                InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
                BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
                String  receviveString = "";
                StringBuilder stringBuilder = new StringBuilder();

            }

            int c;
            while ((c = in.read()) != -1) {
               // out.write(c);
            }
        }finally {
            if (in != null) {
                in.close();
            }
            //if (out != null) {
             //   out.close();
            //}
        }
    }



    public String getEnenmy1Name() {
        return enenmy1Name;
    }

    public void setEnenmy1Name(String enenmy1Name) {
        this.enenmy1Name = enenmy1Name;
    }

    public double getEnemy1Level() {
        return enemy1Level;
    }

    public void setEnemy1Level(double enemy1Level) {
        this.enemy1Level = enemy1Level;
    }

    public double getEnemy1Bolck() {
        return enemy1Bolck;
    }

    public void setEnemy1Bolck(double enemy1Bolck) {
        this.enemy1Bolck = enemy1Bolck;
    }

    public double getEnemy1CurrentHp() {
        return enemy1CurrentHp;
    }

    public void setEnemy1CurrentHp(double enemy1CurrentHp) {
        this.enemy1CurrentHp = enemy1CurrentHp;
    }

    public double getEnemy1BaseHp() {
        return enemy1BaseHp;
    }

    public void setEnemy1BaseHp(double enemy1BaseHp) {
        this.enemy1BaseHp = enemy1BaseHp;
    }

    public String getCharacter1Name() {
        return character1Name;
    }

    public void setCharacter1Name(String character1Name) {
        this.character1Name = character1Name;
    }

    public double getCharacter1Level() {
        return character1Level;
    }

    public void setCharacter1Level(double character1Level) {
        this.character1Level = character1Level;
    }

    public double getCharacter1Block() {
        return character1Block;
    }

    public void setCharacter1Block(double character1Block) {
        this.character1Block = character1Block;
    }

    public double getCharacter1CurrentHp() {
        return character1CurrentHp;
    }

    public void setCharacter1CurrentHp(double character1CurrentHp) {
        this.character1CurrentHp = character1CurrentHp;
    }

    public double getCharacter1BaseHp() {
        return character1BaseHp;
    }

    public void setCharacter1BaseHp(double character1BaseHp) {
        this.character1BaseHp = character1BaseHp;
    }

    public String getDisplayCharacterName() {
        return displayCharacterName;
    }

    public void setDisplayCharacterName(String displayCharacterName) {
        this.displayCharacterName = displayCharacterName;
    }

    public int getDisplayCharacterLevel() {
        return displayCharacterLevel;
    }

    public void setDisplayCharacterLevel(int displayCharacterLevel) {
        this.displayCharacterLevel = displayCharacterLevel;
    }

    public int getDisplayCharacterBlock() {
        return displayCharacterBlock;
    }

    public void setDisplayCharacterBlock(int displayCharacterBlock) {
        this.displayCharacterBlock = displayCharacterBlock;
    }

    public int getDisplaycharacterCurrentHp() {
        return displaycharacterCurrentHp;
    }

    public void setDisplaycharacterCurrentHp(int displaycharacterCurrentHp) {
        this.displaycharacterCurrentHp = displaycharacterCurrentHp;
    }

    public int getDisplayCharacterBaseHp() {
        return displayCharacterBaseHp;
    }

    public void setDisplayCharacterBaseHp(int displayCharacterBaseHp) {
        this.displayCharacterBaseHp = displayCharacterBaseHp;
    }

    @Override
    public void onFragmentInteraction(Uri uri) {

    }
}
