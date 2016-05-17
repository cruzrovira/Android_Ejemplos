package com.blackice.textinputlayout;

import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.regex.Pattern;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    Button button_aceptar, button_cancelar;
    TextInputLayout tilNombre, tilTelefono,tilCorreo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button_aceptar =(Button) findViewById(R.id.boton_aceptar);
        tilNombre =(TextInputLayout) findViewById(R.id.til_nombre);
        tilTelefono =(TextInputLayout) findViewById(R.id.til_telefono);
        tilCorreo =(TextInputLayout) findViewById(R.id.til_correo);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.boton_aceptar:
                    validar();
                break;
            case R.id.boton_cancelar:
                break;
        }
    }


    public boolean validarNombre(String nombre){
        Pattern pattern = Pattern.compile("^[a-zA-Z]+$");
        if( ! pattern.matcher(nombre).matches() || nombre.length()>30){
            tilNombre.setError("Nombre invalido");
            return  false;
        }else{
            tilNombre.setError(null);

        }
        return true;
    }

    public boolean validarTelefono(String telefono){
        if (!Patterns.PHONE.matcher(telefono).matches()){
            tilTelefono.setError("Telefono invalido");
            return false;
        }else{
            tilTelefono.setError(null);
        }
        return true;
    }
    public  boolean validarCorreo(String correo){
        if(!Patterns.EMAIL_ADDRESS.matcher(correo).matches()){
            tilCorreo.setError("Correo invalido");
            return false;
        }else{
            tilCorreo.setError(null);
        }
        return true;
    }


    public  void validar(){
        String nombre = tilNombre.getEditText().getText().toString();
        String telefono = tilTelefono.getEditText().getText().toString();
        String correo = tilCorreo.getEditText().getText().toString();

        boolean a = validarNombre(nombre);
        boolean b = validarCorreo(correo);
        boolean c = validarTelefono(telefono);
        if(a && b && c){
            // todo esta correcto y se puede grabar el contenido en la DB
            Toast.makeText(getApplicationContext(),"Los datos an sido grabados",Toast.LENGTH_SHORT).show();
        }
    }


}
