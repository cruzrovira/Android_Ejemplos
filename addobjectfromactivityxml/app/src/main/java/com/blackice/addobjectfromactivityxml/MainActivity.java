package com.blackice.addobjectfromactivityxml;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity  {
    LinearLayout linear;
    TextView lblNombre , lblApellido;
    EditText txtNombre , txtApellido;
    Button btnAgregar, btnCAlcelar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        linear = (LinearLayout) findViewById(R.id.layout);

        lblNombre = new TextView(this);
        lblNombre.setText("Nombre");
        lblNombre.setLayoutParams(new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT));


        txtNombre = new EditText(this);
        txtNombre.setLayoutParams(new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT));
        txtNombre.setHint("oscar");
        txtNombre.setTextColor(Color.parseColor("#2c2c2c"));
        txtNombre.setTextSize(16f);

        lblApellido = new TextView(this);
        lblApellido.setText("Apellido:");
        lblApellido.setLayoutParams(new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT));


        txtApellido = new EditText(this);
        txtApellido.setLayoutParams(new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT));
        txtApellido.setHint("Rovira");
        txtApellido.setTextColor(Color.parseColor("#2c2c2c"));
        txtApellido.setTextSize(16f);


        // adicon de elemtnos a botonera
        btnCAlcelar = new Button(this);
        btnCAlcelar.setText("Cancelar");
        btnCAlcelar.setLayoutParams(new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT));

        btnAgregar = new Button(this);
        btnAgregar.setText("Agregar");
        btnAgregar.setLayoutParams(new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT));




        // adicion de elemtnos a layout principal
        linear.addView(lblNombre);
        linear.addView(txtNombre);
        linear.addView(lblApellido);
        linear.addView(txtApellido);
        linear.addView(btnCAlcelar);
        linear.addView(btnAgregar);

        // agregados a metodos click

        btnAgregar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Elemento Agregado",Toast.LENGTH_LONG).show();
            }
        });
        btnCAlcelar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtApellido.setText(null);
                txtNombre.setText(null);
            }
        });
    }


}
