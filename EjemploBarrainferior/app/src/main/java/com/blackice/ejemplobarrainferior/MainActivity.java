package com.blackice.ejemplobarrainferior;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    ImageView imagen1 , imagen2,imagen3,imagen4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imagen1 =(ImageView) findViewById(R.id.imagen1);
        imagen2 =(ImageView) findViewById(R.id.imagen2);
        imagen3 =(ImageView) findViewById(R.id.imagen3);
        imagen4 =(ImageView) findViewById(R.id.imagen4);

        imagen1.setOnClickListener(this);
        imagen2.setOnClickListener(this);
        imagen3.setOnClickListener(this);
        imagen4.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.imagen1:
                Toast.makeText(getApplicationContext(),"imagen1",Toast.LENGTH_SHORT).show();
                break;
            case R.id.imagen2:
                Toast.makeText(getApplicationContext(),"imagen2",Toast.LENGTH_SHORT).show();
                break;
            case R.id.imagen3:
                Toast.makeText(getApplicationContext(),"imagen3",Toast.LENGTH_SHORT).show();
                break;
            case R.id.imagen4:
                Toast.makeText(getApplicationContext(),"imagen4",Toast.LENGTH_SHORT).show();
                break;
        }

    }
}
