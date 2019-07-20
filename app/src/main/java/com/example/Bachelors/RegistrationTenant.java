package com.example.Bachelors;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class RegistrationTenant extends AppCompatActivity {

    Spinner dropdownmenu;
    Spinner dropdownmenu_2;
    Spinner dropdownmenu_3;
    private EditText date;
    DatePickerDialog datePickerDialog;
    EditText text1, text2,text3,text4,text5;
    Button reg;
    //DatabaseReference tenantdata;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.acitivtiy_tenant_reg);

        //Code for drop down menu for gender

        dropdownmenu = (Spinner) findViewById(R.id.spinner);

        List<String> list = new ArrayList<>();
        list.add("Select");
        list.add("Male");
        list.add("Female");
        list.add("Others");

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, list);

        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        dropdownmenu.setAdapter(adapter);

        dropdownmenu.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                String itemvalue = parent.getItemAtPosition(position).toString();

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        //Code for Sharing Preference

        dropdownmenu_2 = (Spinner) findViewById(R.id.spinner2);

        List<String> list1 = new ArrayList<>();
        list1.add("Select");
        list1.add("Yes");
        list1.add("No");

        ArrayAdapter<String> adapter1 = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, list1);

        adapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        dropdownmenu_2.setAdapter(adapter1);

        dropdownmenu_2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                String itemvalue = parent.getItemAtPosition(position).toString();

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        //Code for food choice

        dropdownmenu_3 = (Spinner) findViewById(R.id.spinner3);

        List<String> list2 = new ArrayList<>();
        list2.add("Select");
        list2.add("Yes");
        list2.add("No");

        ArrayAdapter<String> adapter2 = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, list2);

        adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        dropdownmenu_3.setAdapter(adapter1);

        dropdownmenu_3.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                String itemvalue = parent.getItemAtPosition(position).toString();

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        //Code for date picker

        date =(EditText) findViewById(R.id.date);
        date.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Calendar calendar = Calendar.getInstance();
                final int year = calendar.get(Calendar.YEAR);
                final int month = calendar.get(Calendar.MONTH);
                final  int day = calendar.get(Calendar.DAY_OF_MONTH);
                datePickerDialog = new DatePickerDialog(RegistrationTenant.this, new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
                        date.setText(day+"."+(month+1)+"."+year);
                    }
                },year, month,day);
                datePickerDialog.show();
            }

        });


        //Code for storing in firebase

        //tenantdata= FirebaseDatabase.getInstance().getReference("Tenants");


        text1 = (EditText) findViewById(R.id.first_name);
        text2 = (EditText) findViewById(R.id.last_name);
        text3 = (EditText) findViewById(R.id.Mob);
        text4 = (EditText) findViewById(R.id.IDproof);
        text5 = (EditText) findViewById(R.id.date);
        dropdownmenu = (Spinner) findViewById(R.id.spinner);
        dropdownmenu_2 = (Spinner) findViewById(R.id.spinner2);
        dropdownmenu_3 = (Spinner) findViewById(R.id.spinner3);
        reg = (Button) findViewById(R.id.register);

        reg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addTenant();
            }
        });

    }
    private void addTenant(){
        String fname = text1.getText().toString().trim();
        String lname = text2.getText().toString().trim();
        String Mnum = text3.getText().toString().trim();
        String ID = text4.getText().toString().trim();
        String date = text5.getText().toString().trim();
        String Sex = dropdownmenu.getSelectedItem().toString();
        String Share = dropdownmenu_2.getSelectedItem().toString();
        String Food = dropdownmenu_3.getSelectedItem().toString();

       /* String id = tenantdata.push().getKey();

        tenantReg tenant = new tenantReg(fname, lname, Mnum, ID, date, Sex, Share, Food);

        tenantdata.child(fname).setValue(tenant);*/

        Toast.makeText(this,"User Registered.",Toast.LENGTH_SHORT).show();
        startActivity(new Intent(RegistrationTenant.this , LoginActivity.class));
    }



    }

