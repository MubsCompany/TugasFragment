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
public class Empat extends Fragment {


    public Empat() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View varD = inflater.inflate( R.layout.fragment_empat, container, false );
        Button empat = varD.findViewById( R.id.btn_fourth );
        empat.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText( getActivity(), "ampe abiss...", Toast.LENGTH_SHORT ).show();
            }
        } );
        return varD;
    }

}
