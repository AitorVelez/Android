package com.example.aitorvt.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Calculator extends AppCompatActivity {

    private String num=""; //numero tecles
    private String num1="";
    private String num2="";
    private double res=0;
    private TextView numview; //numero del text
    private String operator="";




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);

        numview = findViewById(R.id.textbox);
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

        num1=num;

        num="";
        Button a =(Button)view;
        operator = a.getText().toString();







    }
    public void onClickEquals(View view){

        double Varnum1 = Double.parseDouble(num1);
        double Varnum2 = Double.parseDouble(num);

        if(operator.equals("+")){

            res=Varnum1+Varnum2;
        }
        else if(operator.equals("-")){
            res=Varnum1-Varnum2;
        }

        else if(operator.equals("x")){
            res=Varnum1*Varnum2;
        }
        else if(operator.equals("/")){
            res=Varnum1/Varnum2;
        }



        String finalRes=String.valueOf(res);
        num = "";
        numview.setText(finalRes);


    }
}

