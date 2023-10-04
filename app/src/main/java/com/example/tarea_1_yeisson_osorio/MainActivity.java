package com.example.tarea_1_yeisson_osorio;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText num1,num2;

    int n1,n2;

    float Resul;

    Button suma,resta,multipli,divisi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        num1 = (EditText) findViewById(R.id.txtnumero1);
        num2= (EditText) findViewById(R.id.txtnumero2);

        suma= (Button) findViewById(R.id.btnsuma);
        resta=(Button) findViewById(R.id.btnresta);
        multipli = (Button) findViewById(R.id.btnmultiplicacion);
        divisi = (Button) findViewById(R.id.btndivision);


        suma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(veri()==true){

                    convert();

                    operaciones op = new operaciones(n1,n2);

                    Resul = op.suma();

                    Intent resultado = new Intent(getApplicationContext(), ActivityResultado.class);
                    resultado.putExtra("resultado",Resul);
                    startActivity(resultado);
                }
                else {
                    Toast.makeText(getApplicationContext(),"No deje campo vacios",Toast.LENGTH_LONG).show();
                }
            }
        });

        resta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(veri()==true){

                    convert();

                    operaciones op = new operaciones(n1,n2);

                    Resul= op.resta();
                    Intent resultado = new Intent(getApplicationContext(), ActivityResultado.class);
                    resultado.putExtra("resultado",Resul);
                    startActivity(resultado);
                }
                else {
                    Toast.makeText(getApplicationContext(),"No deje campo vacios",Toast.LENGTH_LONG).show();
                }
            }
        });

        multipli.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(veri()==true){

                    convert();

                    operaciones op = new operaciones(n1,n2);

                    Resul = op.multi();
                    Intent resultado = new Intent(getApplicationContext(), ActivityResultado.class);
                    resultado.putExtra("resultado",Resul);
                    startActivity(resultado);
                }
                else {
                    Toast.makeText(getApplicationContext(),"No deje campo vacios",Toast.LENGTH_LONG).show();
                }
            }
        });

        divisi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(veri()==true){

                    convert();

                    operaciones op = new operaciones(n1,n2);

                    Resul = op.divi();

                    Intent resultado = new Intent(getApplicationContext(), ActivityResultado.class);
                    resultado.putExtra("resultado",Resul);
                    startActivity(resultado);
                }
                else {
                    Toast.makeText(getApplicationContext(),"No deje campo vacios",Toast.LENGTH_LONG).show();
                }
            }
        });
    }

    public Boolean veri(){
        boolean aceptar;

        if(num1.getText().toString().isEmpty()){
            aceptar = false;
        }
        else if (num2.getText().toString().isEmpty()){
            aceptar = false;
        }
        else {
            aceptar = true;
        }

        return aceptar;
    }

    public void convert(){
        n1 = Integer.parseInt(num1.getText().toString());
        n2 = Integer.parseInt(num2.getText().toString());
    }
}