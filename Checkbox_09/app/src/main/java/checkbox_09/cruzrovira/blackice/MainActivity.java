package checkbox_09.cruzrovira.blackice;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity  implements View.OnClickListener{
    CheckBox cbxJava,cbxChart,cbxJs,cbxPhp;
    Button btnEnviar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        cbxJava =(CheckBox) findViewById(R.id.cbxJava);
        cbxChart =(CheckBox) findViewById(R.id.cbxChart);
        cbxJs =(CheckBox) findViewById(R.id.cbxJs);
        cbxPhp =(CheckBox) findViewById(R.id.cbxPhp);
        btnEnviar =(Button) findViewById(R.id.btnEnviar);
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
        String dato ="Los lenguajes que te gustan son: ";
        if(cbxJava.isChecked()){
            dato = dato +"Java = true  ";
        }else {
            dato = dato +"Java = false  ";
        }
        if(cbxChart.isChecked()){
            dato = dato +"C# = true  ";
        }else {
            dato = dato +"C# = false  ";
        }
        if(cbxPhp.isChecked()){
            dato = dato +"php = true  ";
        }else{
            dato = dato +"php = false  ";
        }

        if(cbxJs.isChecked()){
            dato = dato + "Js = true  ";
        }else{
            dato = dato +"Js = false  ";
        }

        Toast.makeText(getApplicationContext(),dato,Toast.LENGTH_SHORT).show();

    }
}
