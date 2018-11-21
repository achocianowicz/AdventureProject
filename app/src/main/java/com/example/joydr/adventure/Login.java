package com.example.joydr.adventure;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Login extends AppCompatActivity {
    EditText usernameEditText = null;
    EditText passwordEditText = null;
    Button clearButton = null;
    Button resetPasswordButton =null;
    Button goToUserAccount = null;
    private String username, password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        usernameEditText = findViewById(R.id.usernameEditText);
        passwordEditText = findViewById(R.id.passwordEditText);
        clearButton = findViewById(R.id.clearButton);
        resetPasswordButton =findViewById(R.id.resetPasswordButton);
        goToUserAccount = findViewById(R.id.goToUserAccount);
/*
        usernameEditText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                username = String.valueOf(usernameEditText.getText().toString());
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
                password = String.valueOf(passwordEditText.getText().toString());
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

*/
        clearButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                usernameEditText.setText("");
                passwordEditText.setText("");
                username = null;
                password = null;

            }
        });

        resetPasswordButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO make password reset screen
                /* //Check to see if info is correct and then proceedd
                Intent intent = new Intent(v.getContext(), UserAccount.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
                v.getContext().startActivity(intent);
                //Other wise tell them error of their ways
                */

            }
        });

        goToUserAccount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Singleton.getInstance().getUsername() == null) {
                    Singleton.getInstance().setUsername("username");
                }

                if (Singleton.getInstance().getPassword() == null) {
                    Singleton.getInstance().setPassword("password");
                }

              /* if(usernameEditText.getText().toString() == Singleton.getInstance().getUsername() &&
                       passwordEditText.getText().toString() == Singleton.getInstance().getPassword()) {
                    //Check to see if info is correct and then proceedd
                    Intent intent = new Intent(v.getContext(), UserAccount.class);
                    intent.setFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
                    v.getContext().startActivity(intent);
                    //Other wise tell them error of their ways
                }
                else {
                    goToUserAccount.setText("Try again");


                }

            }
            */
                Intent intent = new Intent(v.getContext(), UserAccount.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
                v.getContext().startActivity(intent);
            }});
    }

}
