package fragment_13.cruzrovira.blackice;

import android.app.Fragment;
import android.os.Bundle;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by cruzr on 28/3/2016.
 */
public class FragmentA extends Fragment{
    View rootView;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        rootView = inflater.inflate(R.layout.fragmenta,container,false);
        return rootView;
    }
}
