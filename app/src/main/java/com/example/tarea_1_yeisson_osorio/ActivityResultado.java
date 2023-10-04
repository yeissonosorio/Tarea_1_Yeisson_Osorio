package com.example.tarea_1_yeisson_osorio;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class ActivityResultado extends AppCompatActivity {

    TextView respuesta;

    Button btnregreasr;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado);

        respuesta = (TextView) findViewById(R.id.tvwRespuesta);
        btnregreasr = (Button) findViewById(R.id.btnregresar);

        Intent resul = getIntent();

        float res = resul.getFloatExtra("resultado",1);
        respuesta.setText("La respuesta es "+res);

        btnregreasr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent atras = new Intent(getApplicationContext(),MainActivity.class);

                startActivity(atras);
            }
        });


    }
}