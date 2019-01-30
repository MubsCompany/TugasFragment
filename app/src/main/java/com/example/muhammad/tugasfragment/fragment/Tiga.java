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
public class Tiga extends Fragment {


    public Tiga() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View varC  = inflater.inflate( R.layout.fragment_tiga, container, false );
        Button btntiga = varC.findViewById( R.id.btn_third );
        btntiga.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText( getActivity(), "Lanjut", Toast.LENGTH_SHORT ).show();
            }
        } );
        return varC;
    }

}
