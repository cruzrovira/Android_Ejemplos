package fragment_14.cruzrovira.blackice;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements Enviarmensaje{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void enviarDatos(String dato) {
        FragmentB fragmentB = (FragmentB) getFragmentManager().findFragmentById(R.id.fragmentb);
        fragmentB.recibir(dato);

    }
}
