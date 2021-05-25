package com.example.appconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;


public class distance1 extends AppCompatActivity {



    Spinner sp1,sp2;
    EditText ed1;
    Button b1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_distance1);

        ed1 = findViewById(R.id.txtamount);
        sp1 = findViewById(R.id.spfrom);
        sp2 = findViewById(R.id.spto);
        b1 = findViewById(R.id.btn2);

        String[] from = {"m"};
        ArrayAdapter ad = new ArrayAdapter<String>(this,R.layout.support_simple_spinner_dropdown_item,from);
        sp1.setAdapter(ad);

        String[] to = {"mm","cm","dm","km","ml","ft","inch"};
        ArrayAdapter ad1 = new ArrayAdapter<String>(this,R.layout.support_simple_spinner_dropdown_item,to);
        sp2.setAdapter(ad1);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Double tot;
                Double amount = Double.parseDouble(ed1.getText().toString());


                if(sp1.getSelectedItem().toString() == "m" && sp2.getSelectedItem().toString() == "mm")
                {
                    tot = amount * 1000.0;
                    Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                }
                else if(sp1.getSelectedItem().toString() == "m" && sp2.getSelectedItem().toString() == "cm") {
                    tot = amount * 100.0 ;
                    Toast.makeText(getApplicationContext(), tot.toString(), Toast.LENGTH_LONG).show();
                }

                else if(sp1.getSelectedItem().toString() == "m" && sp2.getSelectedItem().toString() == "dm") {
                    tot = amount * 10.0;
                    Toast.makeText(getApplicationContext(), tot.toString(), Toast.LENGTH_LONG).show();
                }
                if(sp1.getSelectedItem().toString() == "m" && sp2.getSelectedItem().toString() == "km") {
                    tot = amount * 0.001;
                    Toast.makeText(getApplicationContext(), tot.toString(), Toast.LENGTH_LONG).show();
                }
                if(sp1.getSelectedItem().toString() == "m" && sp2.getSelectedItem().toString() == "ml") {
                    tot = amount * 0.00062;
                    Toast.makeText(getApplicationContext(), tot.toString(), Toast.LENGTH_LONG).show();
                }
                if(sp1.getSelectedItem().toString() == "m" && sp2.getSelectedItem().toString() == "ft") {
                    tot = amount * 3.28;
                    Toast.makeText(getApplicationContext(), tot.toString(), Toast.LENGTH_LONG).show();
                }
                if(sp1.getSelectedItem().toString() == "m" && sp2.getSelectedItem().toString() == "inch") {
                    tot = amount * 39.3;
                    Toast.makeText(getApplicationContext(), tot.toString(), Toast.LENGTH_LONG).show();
                }
            }
        });




    }
}