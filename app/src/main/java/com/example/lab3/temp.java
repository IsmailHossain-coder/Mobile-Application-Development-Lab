package com.example.lab3;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import  android.view.View;
import android.widget.Button;
import  android.widget.EditText;
import  android.widget.TextView;

public class temp extends AppCompatActivity {
    private Button cToF;
    private TextView result;
    private EditText enterTemp;
    double result1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_temp);
//referencing
        cToF=findViewById(R.id.cToF);
        result=findViewById(R.id.result);
        enterTemp=findViewById(R.id.enterTemp);
        cToF.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
//type converter decimal to double
                double temp= Double.parseDouble(enterTemp.getText().toString());
//to change input from Celsius Scale to Fahrenheit Scale
                result1=(temp * 1.8)+32;
//to show the result in Fahrenheit in UI
                result.setText(String.valueOf(result1));
            }
        });
    }
}