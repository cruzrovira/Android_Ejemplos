package vibrareltelefono.cruzrovira.blackice;

import android.content.Context;
import android.os.Vibrator;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    Button btnVibrar;
    Vibrator vibrator;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        vibrator =(Vibrator) this.getSystemService(Context.VIBRATOR_SERVICE);
        btnVibrar =(Button) findViewById(R.id.btnVibrar);
        btnVibrar.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
     switch (v.getId()){
         case R.id.btnVibrar:
             if(vibrator.hasVibrator()){ // indica si el telefono puede vibrar o no
                 Log.v("podemos Vibrar","Si");
                vibrator.vibrate(1000); // funcion para vibrar


                 /* patron de vibracion
                long[] pattern ={0,100,100};
                 vibrator.vibrate(pattern,0); // el valor de cero indica que se repiete el patron de forma indefinida
                 vibrator.vibrate(pattern,-1); // el valor de -1 indica al llegar al final dle patron termine
                */
             }else{
                 Log.v("podemos Vibrar","N0");
             }
             break;
     }
    }
}
