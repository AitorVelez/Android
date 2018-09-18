package com.example.aitorvt.kmtomilles;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText edit_km=findViewById(R.id.edit_km);
        edit_km.setText("1.5");
    }

    public void onClickMilles(View view) {
    EditText edit_km=findViewById(R.id.edit_km);
    EditText edit_milles=findViewById(R.id.edit_milles);
    String skm=edit_km.getText().toString();
    if(!skm.isEmpty()){
        float km =Float.valueOf(skm);
        float milles=km*1.609f;
        String smilles=Float.toString(milles);
        edit_milles.setText(smilles);
    }
    }

    public void onClickKm(View view) {
        EditText edit_milles=findViewById(R.id.edit_milles);
        EditText edit_km=findViewById(R.id.edit_km);
        String smilles=edit_milles.getText().toString();
        if(!smilles.isEmpty()){
            float milles=Float.valueOf(smilles);
            float km=milles/0.621371f;
            String skm=Float.toString(milles);
            edit_km.setText(skm);

        }

    }
}
