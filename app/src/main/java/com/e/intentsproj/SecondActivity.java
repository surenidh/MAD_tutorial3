package com.e.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    EditText num1;
    EditText num2;
    TextView lblsum;
    String number1,number2;
int n1,n2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        num1 = findViewById(R.id.number1);
        num2 = findViewById(R.id.number2);
        lblsum = findViewById(R.id.lblsum);

        Intent intent = getIntent();

         number1 = intent.getStringExtra("n1");
         number2 = intent.getStringExtra("n2");

        num1.setText(number1);
        num2.setText(number2);

        n1 = Integer.parseInt(number1);
        n2 = Integer.parseInt(number2);
    }

    public void add(View view){
        lblsum.setText(n1+ n2);
    }
    public void minus(View view){
        lblsum.setText(n2 - n1);
    }
    public void multiply(View view){
        lblsum.setText(n1 * n2);
    }
    public void divide(View view){
        lblsum.setText(n1 / n2);
    }
}