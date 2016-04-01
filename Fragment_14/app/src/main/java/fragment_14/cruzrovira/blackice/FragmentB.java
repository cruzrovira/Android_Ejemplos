package fragment_14.cruzrovira.blackice;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by cruzr on 29/3/2016.
 */
public class FragmentB extends Fragment{
    TextView lblDato;
    View rootView;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        rootView = inflater.inflate(R.layout.fragmentb,container,false);
        lblDato =(TextView) rootView.findViewById(R.id.lblDato);
        return rootView;
    }

    public  void recibir(String dato){
        lblDato.setText(dato);
    }
}
