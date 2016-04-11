package cardviewandrecyclerview.cruzrovira.blackice;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;


import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    List<Titular> lista ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        inicializar();
        recyclerView =(RecyclerView) findViewById(R.id.recyclerView);
        // configuracion del Manager
        LinearLayoutManager llm = new LinearLayoutManager(this);
        llm.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(llm);

        // configuracion del Adapter
        TitularAdapter adapter = new TitularAdapter(lista);
        recyclerView.setAdapter(adapter);


    }


    public void inicializar(){
        lista = new ArrayList<Titular>();
        lista.add(new Titular(R.drawable.imagen1,"Titulo 1 ","Contenido 1"));
        lista.add(new Titular(R.drawable.imagen2,"Titulo 2 ","Contenido 2"));
        lista.add(new Titular(R.drawable.imagen3,"Titulo 3 ","Contenido 3"));
        lista.add(new Titular(R.drawable.imagen4,"Titulo 4 ","Contenido 4"));
        lista.add(new Titular(R.drawable.imagen5,"Titulo 5 ","Contenido 5"));
        lista.add(new Titular(R.drawable.imagen6,"Titulo 6 ","Contenido 6"));
    }
}
