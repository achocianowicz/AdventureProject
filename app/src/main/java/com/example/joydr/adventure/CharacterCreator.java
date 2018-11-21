package com.example.joydr.adventure;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class CharacterCreator extends AppCompatActivity {
    EditText usernameEditText = null;

    private String username;
    Button serfButton = null;
    Button apprenticeButton = null;
    ImageView classImageView = null;
    TextView healthTextView = null;
    TextView strengthTextView = null;
    TextView intelligenceTextView = null;
    TextView dexTextView = null;

    Button startAdventureButton = null;

private String charClass = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_character_creator);

        usernameEditText = findViewById(R.id.usernameEditText);

        serfButton = findViewById(R.id.serfButton);
        classImageView = findViewById(R.id.classImageView);
        apprenticeButton = findViewById(R.id.apprenticeButton);
        healthTextView = findViewById(R.id.healthTextView);
        strengthTextView = findViewById(R.id.strengthTextView);
        intelligenceTextView = findViewById(R.id.intelligenceTextView);
        dexTextView = findViewById(R.id.dexTextView);
        startAdventureButton = findViewById(R.id.startAdventureButton);

        usernameEditText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                username = String.valueOf(usernameEditText.getText());
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });


        serfButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                serfButton.setBackgroundColor(Color.BLACK);
                serfButton.setTextColor(Color.WHITE);
                apprenticeButton.setBackgroundColor(Color.WHITE);
                apprenticeButton.setTextColor(Color.BLACK);
                classImageView.setImageResource(R.drawable.serf);
                healthTextView.setText("100");
                strengthTextView.setText("5");
                intelligenceTextView.setText("1");
                dexTextView.setText("2");
                charClass = "serf";
            }
        });

        apprenticeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                serfButton.setBackgroundColor(Color.WHITE);
                serfButton.setTextColor(Color.BLACK);
                apprenticeButton.setBackgroundColor(Color.BLACK);
                apprenticeButton.setTextColor(Color.WHITE);
                classImageView.setImageResource(R.drawable.apprentice);
                healthTextView.setText("100");
                strengthTextView.setText("1");
                intelligenceTextView.setText("5");
                dexTextView.setText("1");
                charClass= "apprentice";
            }
        });

        startAdventureButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //save data, pass data to town node
                Intent intent = new Intent(v.getContext(), Town.class);

                Singleton.getInstance().setCharName(username);
                Singleton.getInstance().setCharClass(charClass);
                Singleton.getInstance().setCharBaseHP(healthTextView.getText().toString().trim());
                Singleton.getInstance().setCharCurrentHP(healthTextView.getText().toString().trim());
                Singleton.getInstance().setCharSTR(strengthTextView.getText().toString().trim());
                Singleton.getInstance().setCharINTELL(intelligenceTextView.getText().toString().trim());
                Singleton.getInstance().setCharDEX(dexTextView.getText().toString().trim());
                intent.setFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
                v.getContext().startActivity(intent);
            }
        });
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }


}
