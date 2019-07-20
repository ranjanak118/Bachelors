package com.example.Bachelors;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
   Button b1,b2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
     //   startActivity(new Intent(MainActivity.this , signup.class));
        b1 =(Button)findViewById(R.id.signup1);
        b2 =(Button)findViewById(R.id.signin1);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this , SignupActivity.class));
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            //@Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, LoginActivity.class));
            }
        });

    }
}
