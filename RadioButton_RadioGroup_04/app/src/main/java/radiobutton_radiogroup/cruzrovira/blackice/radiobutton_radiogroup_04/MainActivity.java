package radiobutton_radiogroup.cruzrovira.blackice.radiobutton_radiogroup_04;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    Context context =this;
    RadioGroup rbtngGustos;
    RadioButton rbtnMusica,rbtnTv, rbtnPro;
    Button btnEnviar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        rbtngGustos =(RadioGroup) findViewById(R.id.rbtngGustos);
        rbtnMusica =(RadioButton) findViewById(R.id.rbtnMusica);
        rbtnTv =(RadioButton) findViewById(R.id.rbtnTv);
        rbtnPro =(RadioButton) findViewById(R.id.rbtnPro);
        btnEnviar = (Button) findViewById(R.id.btnEviar);
        // la primara mara para dectectar que radio boton sea selecionado es utilizando el
        // RadioGroup pero esto se detecta el cambio en el mismo instate en que sea seleccionado o
        // cambiado la seleccion ,
        rbtngGustos.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
             switch (checkedId){
                 case R.id.rbtnMusica:
                     Toast.makeText(context,"Musica",Toast.LENGTH_SHORT).show();
                     break;
                 case R.id.rbtnTv:
                     Toast.makeText(context,"tv",Toast.LENGTH_SHORT).show();
                     break;
                 case R.id.rbtnPro:
                     Toast.makeText(context,"Programacion",Toast.LENGTH_SHORT).show();
                     break;


             }

            }
        });

        // la otra manera de hacerlo es usando el evento click en un boton
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
            case R.id.btnEviar:
                if(rbtnPro.isChecked()){
                    Toast.makeText(context,"Desde el boton , Programacion",Toast.LENGTH_SHORT).show();
                }else if(rbtnMusica.isChecked()){
                    Toast.makeText(context,"Desde el boton , Musica",Toast.LENGTH_SHORT).show();
                }else if(rbtnTv.isChecked()){
                    Toast.makeText(context,"Desde el boton , Tv",Toast.LENGTH_SHORT).show();
                }
                break;
        }
    }
}
