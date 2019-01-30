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
public class Lima extends Fragment {


    public Lima() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View varE = inflater.inflate( R.layout.fragment_lima, container, false );
        Button lima = varE.findViewById( R.id.btn_fifth );
        lima.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText( getActivity(), "Finish........ : )", Toast.LENGTH_SHORT ).show();
            }
        } );
        return varE;
    }

}

