package com.example.appconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class Weight extends AppCompatActivity {


    Spinner sp1,sp2;
    EditText ed1;
    Button b1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weight);

        ed1 = findViewById(R.id.txtamount);
        sp1 = findViewById(R.id.spfrom);
        sp2 = findViewById(R.id.spto);
        b1 = findViewById(R.id.btn2);


        String[] from = {"kg"};
        ArrayAdapter ad = new ArrayAdapter<String>(this,R.layout.support_simple_spinner_dropdown_item,from);
        sp1.setAdapter(ad);

        String[] to = {"mg","g","ct","lb","cnt","t"};
        ArrayAdapter ad1 = new ArrayAdapter<String>(this,R.layout.support_simple_spinner_dropdown_item,to);
        sp2.setAdapter(ad1);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Double tot;
                Double amount = Double.parseDouble(ed1.getText().toString());

                if(sp1.getSelectedItem().toString() == "kg" && sp2.getSelectedItem().toString() == "mg")
                {
                    tot = amount * 1000000.0;
                    Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                }
                else if(sp1.getSelectedItem().toString() == "kg" && sp2.getSelectedItem().toString() == "g") {
                    tot = amount * 1000.0;
                    Toast.makeText(getApplicationContext(), tot.toString(), Toast.LENGTH_LONG).show();
                }

                else if(sp1.getSelectedItem().toString() == "kg" && sp2.getSelectedItem().toString() == "ct") {
                    tot = amount * 5000.0;
                    Toast.makeText(getApplicationContext(), tot.toString(), Toast.LENGTH_LONG).show();
                }

               else if(sp1.getSelectedItem().toString() == "kg" && sp2.getSelectedItem().toString() == "lb") {
                    tot = amount * 2.2;
                    Toast.makeText(getApplicationContext(), tot.toString(), Toast.LENGTH_LONG).show();
                }

                else if(sp1.getSelectedItem().toString() == "kg" && sp2.getSelectedItem().toString() == "cnt") {
                    tot = amount * 0.01;
                    Toast.makeText(getApplicationContext(), tot.toString(), Toast.LENGTH_LONG).show();
                }

                else if(sp1.getSelectedItem().toString() == "kg" && sp2.getSelectedItem().toString() == "t") {
                    tot = amount * 0.001;
                    Toast.makeText(getApplicationContext(), tot.toString(), Toast.LENGTH_LONG).show();
                }

            }
        });


    }
}