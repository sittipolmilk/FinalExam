package com.example.administrator.finalexam;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class LoginActivity extends AppCompatActivity {
 Button butlogin,butregister;
    EditText TextUsername,Textpass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        butlogin = (Button)findViewById(R.id.but_login);
        butregister = (Button)findViewById(R.id.but_register);

        TextUsername = (EditText)findViewById(R.id.editTextUsername);
        Textpass = (EditText)findViewById(R.id.editTextpass);
    }

}
