package com.example.muhammad.tugasfragment;

import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.Spinner;
import android.widget.Toast;

import com.example.muhammad.tugasfragment.fragment.Dua;
import com.example.muhammad.tugasfragment.fragment.Empat;
import com.example.muhammad.tugasfragment.fragment.Lima;
import com.example.muhammad.tugasfragment.fragment.Satu;
import com.example.muhammad.tugasfragment.fragment.Tiga;

public class HomeActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    Spinner spin;
    RelativeLayout relative;
    FragmentManager fm;
    Button btnFirst,btnSecond,btnThird,btnFourth,btnFifth;

    public String[] list = {"first", "second", "third", "fourth", "fifth"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_home );

        spin = findViewById( R.id.spinn );
        relative = findViewById( R.id.container );
       

        ArrayAdapter<String> adapter = new ArrayAdapter<>( this, android.R.layout.simple_spinner_item, list );
        spin.setAdapter( adapter );
        spin.setOnItemSelectedListener( this );

    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        fm = getSupportFragmentManager();

        btnFirst = findViewById( R.id.btn_first );
        btnSecond = findViewById( R.id.btn_second );
        btnThird = findViewById( R.id.btn_third );
        btnFourth = findViewById( R.id.btn_fourth );
        btnFifth = findViewById( R.id.btn_fifth );


        switch (position) {
            case 0:
                fm.beginTransaction().add( R.id.container,new Satu()).commit();
                Toast.makeText( this, "first Blood!", Toast.LENGTH_SHORT ).show();
                break;
            case 1:
                Toast.makeText( this, "Double kill!!", Toast.LENGTH_SHORT ).show();
                fm.beginTransaction().add( R.id.container,new Dua() ).commit();
                break;
            case 2:
                Toast.makeText( this, "Triple kill!!!", Toast.LENGTH_SHORT ).show();
                fm.beginTransaction().add( R.id.container, new Tiga() ).commit();
                break;
            case 3:
                Toast.makeText( this, "Maniac!!!!", Toast.LENGTH_SHORT ).show();
                fm.beginTransaction().add( R.id.container, new Empat() ).commit();
                break;
            case 4:
                Toast.makeText( this, "Savage!!!!!", Toast.LENGTH_SHORT ).show();
                fm.beginTransaction().add( R.id.container, new Lima() ).commit();
                break;


        }

    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}
