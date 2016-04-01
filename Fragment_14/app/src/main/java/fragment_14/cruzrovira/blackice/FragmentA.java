package fragment_14.cruzrovira.blackice;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;


public class FragmentA extends Fragment{
    EditText txtDatos;
    Button btnEnviar;
    View rootView;
    // elemnto de tipo interfaz

    Enviarmensaje Em;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        rootView = inflater.inflate(R.layout.fragmenta,container,false);

        txtDatos =(EditText) rootView.findViewById(R.id.txtDatos);
        btnEnviar =(Button) rootView.findViewById(R.id.btnEnviar);
        btnEnviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String dato = txtDatos.getText().toString();
                Em.enviarDatos(dato);

            }
        });
        return  rootView;
    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        Em =(Enviarmensaje) activity;
    }
}
