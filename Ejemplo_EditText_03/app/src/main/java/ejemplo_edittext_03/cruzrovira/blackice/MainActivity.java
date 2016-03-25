package ejemplo_edittext_03.cruzrovira.blackice;

import android.content.Context;
import android.media.ToneGenerator;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity  implements View.OnClickListener{
    // definicion de contexto
    Context context= this;
    // definicion de Elementos a utilizar desde la vista
    EditText txtNombre;
    Button btnEnviar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        // enlazamos objetos con elemtnos de la vista
        txtNombre =(EditText) findViewById(R.id.txtNombre);
        btnEnviar= (Button) findViewById(R.id.btnEnviar);

        btnEnviar.setOnClickListener(this);


        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btnEnviar:
                String nombre = txtNombre.getText().toString().trim();
                if(nombre.length()>0){
                    Toast.makeText(context,"Tu nombre es: " + nombre,Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(context,"ingresa un nombre." ,Toast.LENGTH_SHORT).show();
                }
                break;
        }
    }
}
