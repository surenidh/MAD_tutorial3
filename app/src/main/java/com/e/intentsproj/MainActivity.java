package com.e.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText num1;
    EditText num2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        num1 = findViewById(R.id.number1);
        num2 = findViewById(R.id.number2);
    }

    public void openSecond(View view){
        Intent intent = new Intent(this,SecondActivity.class);
        intent.putExtra("n1",num1.getText().toString());
        intent.putExtra("n2",num2.getText().toString());

        Toast.makeText(this,"opeing calacution of sum",Toast.LENGTH_SHORT).show();
        startActivity(intent);
    }


}