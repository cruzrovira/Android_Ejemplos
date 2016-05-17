package com.blackice.sharedpreferences;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText texto ;
    Button btnAgregar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        texto = (EditText) findViewById(R.id.texto);
        btnAgregar =(Button) findViewById(R.id.btnAgregar);
        SharedPreferences preferences = getSharedPreferences("apellidos",Context.MODE_PRIVATE);
        texto.setText(preferences.getString("dato","no tenia nada en preferencias"));



        btnAgregar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String dato = texto.getText().toString();
                SharedPreferences preferences = getSharedPreferences("apellidos", Context.MODE_PRIVATE);
                SharedPreferences.Editor editor= preferences.edit();
                editor.putString("dato",dato);
                editor.commit();

            }
        });

    }
}
