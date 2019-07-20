package com.example.Bachelors;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;


public class ownerReg extends AppCompatActivity {


    EditText Name;
    EditText Contact;
    EditText Email_Id;
    EditText Age;
    EditText Address;
    Spinner spinner;
    Button addo;


    @Override
    public void onCreate(@Nullable Bundle savedInstancesState){
        super.onCreate(savedInstancesState);
        setContentView(R.layout.activity_owner_reg);

        addo =(Button)findViewById(R.id.email_sign_in_button);
        addo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(v.getContext(), LoginActivity.class));
            }
        });


    }
}
