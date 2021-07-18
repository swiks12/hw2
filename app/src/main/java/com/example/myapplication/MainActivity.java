package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputEditText;

public class MainActivity extends AppCompatActivity {
private TextView yourself;
private TextInputEditText first_name;
    private TextInputEditText last_name;
    private TextInputEditText age;
    private TextInputEditText hobby;
    private TextInputEditText strength;
    private TextInputEditText weakness;
    private Button submit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        yourself=findViewById(R.id.yourself);
        first_name=findViewById(R.id.first_Name);
        last_name=findViewById(R.id.last_Name);
        age=findViewById(R.id.age);
        hobby=findViewById(R.id.hobby);
        strength=findViewById(R.id.strength);
        weakness=findViewById(R.id.weakness);
        submit=findViewById(R.id.submit);
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String username=first_name.getText().toString();
                String user_surname=last_name.getText().toString();
                String user_age=age.getText().toString();
                String user_hobby=hobby.getText().toString();
                String user_strength=strength.getText().toString();
                String user_weakness=weakness.getText().toString();
                Intent intent=new Intent(MainActivity.this,content.class);
                intent.putExtra("keyname",username);
                intent.putExtra("keyname_one",user_surname);
                intent.putExtra("keyname_two",user_age);
                intent.putExtra("keyname_three",user_hobby);
                intent.putExtra("keyname_four",user_strength);
                intent.putExtra("keyname_five",user_weakness);
                startActivity(intent);
            }
        });

    }
}