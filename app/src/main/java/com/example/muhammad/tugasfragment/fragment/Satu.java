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
public class Satu extends Fragment {


    public Satu() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View var = inflater.inflate( R.layout.fragment_satu, container, false );
        Button btnsatu = var.findViewById( R.id.btn_first );
        btnsatu.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText( getActivity(), "akhirnyaa :)", Toast.LENGTH_SHORT ).show();
            }
        });
        return var;
    }

}
