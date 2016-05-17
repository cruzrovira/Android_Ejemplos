package com.blackice.ejemploactionbaryoutube;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.buscar:
                Toast.makeText(getApplicationContext(),"Buscando",Toast.LENGTH_SHORT).show();
                return true;
            case R.id.foto:
                Toast.makeText(getApplicationContext(),"Tomando imagen",Toast.LENGTH_SHORT).show();
                return true;
            case R.id.action_settings:
                Toast.makeText(getApplicationContext(),"Settings",Toast.LENGTH_SHORT).show();
                return true;
            default:
                return super.onOptionsItemSelected(item);

        }

    }
}
