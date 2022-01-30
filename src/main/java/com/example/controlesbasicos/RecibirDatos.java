package com.example.controlesbasicos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class RecibirDatos extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recibir_datos);

        TextView Nombre = findViewById(R.id.tvNombreReci);
        TextView Edad = findViewById(R.id.tvEdadReci);
        TextView Estado = findViewById(R.id.tvEstado);
        Button bVolver = findViewById(R.id.btVolver);

        Bundle datosRecibidos = this.getIntent().getExtras();
        String nombre = datosRecibidos.getString("pNombre");
        String edad = datosRecibidos.getString("pEdad");

        Nombre.setText(String.format("Tu nombre es: %s", nombre));
        Edad.setText(String.format("Tu edad es: %s", edad));

        int estado = Integer.parseInt(edad);

        if (estado < 18 ) {
            Estado.setText("Eres menor de edad");
        }else {
            Estado.setText("Eres mayor de edad");
        }

        bVolver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent vuelva= new
                        Intent(RecibirDatos.this,EnviarDatos.class);
                startActivity(vuelva);
            }
        });
    }
}

