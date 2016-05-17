package com.blackice.avisos;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class AvisosActivity extends AppCompatActivity {
    private ListView mlistView;
    private List<String> list;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        list = new ArrayList();
        list.add("uno");
        list.add("Dos");
        list.add("tres");
        setContentView(R.layout.activity_avisos);
        mlistView = (ListView) findViewById(R.id.avisos_listview);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this,R.layout.avisos_row,R.id.row_text,list);
        mlistView.setAdapter(arrayAdapter);


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_avisos,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.action_nuevo:
                Toast.makeText(getApplicationContext(),"Nuevo aviso",Toast.LENGTH_SHORT).show();
                return  true;
            case  R.id.action_salir:
                finish();
                Toast.makeText(getApplicationContext(),"Salir",Toast.LENGTH_SHORT).show();
                return true;
            default:
                return super.onOptionsItemSelected(item);

        }
    }
}



