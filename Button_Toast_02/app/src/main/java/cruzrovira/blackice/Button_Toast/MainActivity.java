
package cruzrovira.blackice.Button_Toast;

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
import android.widget.EditText;
import android.widget.Toast;

// implementamos interfas  View.OnClickListener que es necasria para la captura
// de los eventos de los button
public class MainActivity extends AppCompatActivity  implements View.OnClickListener{
   // variables  para el manejo del contexto
    Context context = this;
    // variabels para la creacion de buttons
    Button btn1 ,btn2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        btn1 =(Button) findViewById(R.id.btn1);
        btn2=(Button) findViewById(R.id.btn2);

        // suscripcion a los eventos de los boton
        // de no estar  inscrito al menjador del evento , la funcion click
        // de dicho button no funcionaria
        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);


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



    // importante esta funcion captura todos los eventos de button suscritos a este evento
    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn1:  // cada calse indica el evento clik de cada button
                Toast.makeText(context,"se preciono el button 1", Toast.LENGTH_SHORT).show();
                break;
            case R.id.btn2:
                Toast.makeText(context,"se preciono el button 2", Toast.LENGTH_SHORT).show();
                break;
        }
    }
}
