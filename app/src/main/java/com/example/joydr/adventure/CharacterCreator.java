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
    EditText passwordEditText = null;
    private String username, password;
    Button serfButton = null;
    Button apprenticeButton = null;
    ImageView classImageView = null;
    TextView healthTextView = null;
    TextView strengthTextView = null;
    TextView magicTextView = null;

    Button startAdventureButton = null;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_character_creator);

        usernameEditText = findViewById(R.id.usernameEditText);
        passwordEditText = findViewById(R.id.passwordEditText);
        serfButton = findViewById(R.id.serfButton);
        classImageView = findViewById(R.id.classImageView);
        apprenticeButton = findViewById(R.id.apprenticeButton);
        healthTextView = findViewById(R.id.healthTextView);
        strengthTextView = findViewById(R.id.strengthTextView);
        magicTextView = findViewById(R.id.magicTextView);
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
        passwordEditText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                password = String.valueOf(passwordEditText.getText());
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
                magicTextView.setText("1");
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
                magicTextView.setText("5");
            }
        });

        startAdventureButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //save data, pass data to town node
                Intent intent = new Intent(v.getContext(), Town.class);
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
