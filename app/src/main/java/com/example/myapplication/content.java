package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class content extends AppCompatActivity {
    private TextView response;
    private TextView name;
    private TextView surname;
    private TextView years;
    private TextView interests;
    private TextView power;
    private TextView weak;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_content);
        response=findViewById(R.id.response);
        name=findViewById(R.id.Name);
        surname=findViewById(R.id.surname);
        years=findViewById(R.id.years);
        interests=findViewById(R.id.Interests);
        power=findViewById(R.id.power);
        weak=findViewById(R.id.weak);
        String userName=getIntent().getStringExtra("keyname");
        String user_Surname=getIntent().getStringExtra("keyname_one");
        String user_Age=getIntent().getStringExtra("keyname_two");
        String user_Hobby=getIntent().getStringExtra("keyname_three");
        String user_Strength=getIntent().getStringExtra("keyname_four");
        String user_Weakness=getIntent().getStringExtra("keyname_five");
        name.setText(userName);
        surname.setText(user_Surname);
        years.setText(user_Age);
        interests.setText(user_Hobby);
power.setText(user_Strength);
weak.setText(user_Weakness);




    }
}