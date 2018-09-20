package com.example.aitorvt.calculadora;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class CalculadoraActivity extends AppCompatActivity {

    private String num="";
    private String num2="";
    private TextView numview;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculadora);


        numview = findViewById(R.id.textBox);
        numview.setText(num);
    }

    public void onClickDigit(View view){
        Button b =(Button)view;
        num += b.getText().toString().charAt(0);
        numview.setText(num);
    }

    public void onClickDot(View view){


    }

    public void onClickOperator(View view){
        Button b =(Button)view;
        num += b.getText().toString().charAt(0);
        numview.setText(num);
    }

    public void onClickEquals(View view){

    }

}
