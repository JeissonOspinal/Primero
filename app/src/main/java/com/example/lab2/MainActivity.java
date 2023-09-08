package com.example.lab2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    Spinner ListaA;
    Button bonton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListaA = findViewById(R.id.Lista);
        bonton = findViewById(R.id.Boton);

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,R.array.lista, android.R.layout.simple_spinner_item);
        ListaA.setAdapter(adapter);
        bonton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView Des = (TextView)findViewById(R.id.Descripcion);
                Des.setText("Has elegido: " + ListaA.getSelectedItem().toString());
            }
        });
    }

}
