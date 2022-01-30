package com.example.controlesbasicos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

Button bSeguir;
Button bEnviarDatos;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final EditText tNombre = this.findViewById(R.id.etNombre);
        final EditText tApellido = this.findViewById(R.id.etApellido);
        bSeguir= findViewById(R.id.btSeguir);
        bEnviarDatos= (Button)findViewById(R.id.btEnviarDatos);

        //noinspection Convert2Lambda
        bEnviarDatos.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                String nom = tNombre.getText().toString();
                String ape = tApellido.getText().toString();
                Toast.makeText(getApplicationContext(), "Tu nombre es: " + nom + " " + ape, Toast.LENGTH_LONG).show();

            }
        });
        bSeguir.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent( MainActivity.this,EnviarDatos.class);
                startActivity(i);
            }
        });
    }

            }


