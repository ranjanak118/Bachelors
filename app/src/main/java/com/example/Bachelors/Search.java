package com.example.Bachelors;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.SeekBar;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;


public class Search extends AppCompatActivity {

    private static SeekBar seek_bar;
    private static TextView text_view;
    int progress_value;
    Spinner city;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);

        city = (Spinner) findViewById(R.id.city);
        // String citystr = city.getSelectedItem().toString();
        // seek_bar = (SeekBar) findViewById(R.id.seekBar5);
        // text_view = (TextView) findViewById(R.id.text2);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(Search.this, android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.city));
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        city.setAdapter(adapter);
        seebbarr();
        //if(TextUtils.isEmpty(citystr)){
        //  Toast.makeText(this,"Enter city details",Toast.LENGTH_LONG).show();
    }


    public void seebbarr() {
        seek_bar = (SeekBar) findViewById(R.id.seekBar5);
        text_view = (TextView) findViewById(R.id.textView11);
        text_view.setText("Cost in INR : " + seek_bar.getProgress() + "/ " + seek_bar.getMax());
        seek_bar.setOnSeekBarChangeListener(
                new SeekBar.OnSeekBarChangeListener() {


                    @Override
                    public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                        progress_value = progress;
                        text_view.setText("Cost in INR : " + progress + " / " + seek_bar.getMax());
                        Toast.makeText(Search.this, "Seekbar in progress", Toast.LENGTH_LONG).show();
                    }

                    @Override
                    public void onStartTrackingTouch(SeekBar seekBar) {
                        Toast.makeText(Search.this, "Seekbar in starttracking", Toast.LENGTH_LONG).show();
                    }

                    @Override
                    public void onStopTrackingTouch(SeekBar seekBar) {
                        text_view.setText("Cost in INR : " + progress_value + " / " + seek_bar.getMax());
                        Toast.makeText(Search.this, "Seekbar in stoptracking", Toast.LENGTH_LONG).show();

                    }
                }
        );
    }
}


