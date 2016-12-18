package com.example.administrator.finalexam;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class RegisterActivity extends AppCompatActivity {

    EditText ReName,ReUser,RePass;
    Button creacc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        ReName = (EditText)findViewById(R.id.RegisName);
        ReUser = (EditText)findViewById(R.id.RegisUser);
        RePass = (EditText)findViewById(R.id.RegisPass);
        creacc = (Button)findViewById(R.id.butCreat);

    }
}
