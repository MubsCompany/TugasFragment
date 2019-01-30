package com.example.muhammad.tugasfragment.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import com.example.muhammad.tugasfragment.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class Dua extends Fragment {


    public Dua() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View varB = inflater.inflate( R.layout.fragment_dua, container, false );
        Button btndua = varB.findViewById( R.id.btn_second );
        btndua.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText( getActivity(), "Terhura saya :(", Toast.LENGTH_SHORT ).show();
            }
        } );
        return varB;
    }

}
