package com.example.lab3;
import  android.content.Intent;
import  android.os.Bundle;
import  android.view.View;
import  android.widget.Button;
import  android.widget.EditText;
import  android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    EditText ET1, ET2;
    Button B1, B2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//Referencing
        ET1=(EditText) findViewById(R.id.etName);
        ET2=( EditText) findViewById(R.id.etPass);
        B1=(Button) findViewById(R.id.btnOk);
        B2=(Button) findViewById(R.id.btnReset);
        B1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Login Button Selected.",
                        Toast.LENGTH_LONG).show();
                String textN=ET1.getText().toString();
                String textP=ET2.getText().toString();
                if((textN.equals("Ismail")) && (textP.equals("2013"))){
                    Intent intent = new Intent(getApplicationContext(),
                            temp.class);
                    startActivity(intent);
                }
            }
        });
        B2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Reset Button Selected.",
                        Toast.LENGTH_LONG).show();
            } });
    }
}