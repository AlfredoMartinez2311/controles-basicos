package com.example.controlesbasicos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class EnviarDatos extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_enviar_datos);

        final EditText eNombre= findViewById(R.id.etNombre);
        final EditText eEdad = this.findViewById(R.id.etEdad);
        Button bEnviar = this.findViewById(R.id.btEnviarDatos);

        bEnviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nombre = eNombre.getText().toString();
                String edad = eEdad.getText().toString();
                Bundle pasarDatos = new Bundle();
                pasarDatos.putString("eNombre",nombre);
                pasarDatos.putString("eEdad",edad);

                Intent siga = new
                        Intent(EnviarDatos.this,RecibirDatos.class);
                siga.putExtras(pasarDatos);
                startActivity(siga);


            }
        });

    }
}