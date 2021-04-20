package com.example.lista2java;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Arrays;

public class Exercicio2 extends AppCompatActivity {

    private EditText valor1;
    private EditText valor2;
    private EditText valor3;
    private TextView resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercicio2);

        this.valor1 = findViewById(R.id.editValorA);
        this.valor2 = findViewById(R.id.editValor2);
        this.valor3 = findViewById(R.id.editValor3);
        this.resultado = findViewById(R.id.textResultado);

    }

    public void crescente(View view){

        int num1 = Integer.valueOf(valor1.getText().toString());
        int num2 = Integer.valueOf(valor2.getText().toString());
        int num3 = Integer.valueOf(valor3.getText().toString());

        int[] lista = new int[3];
        lista[0] = num1;
        lista[1] = num2;
        lista[2] = num3;
        Arrays.sort(lista);

        resultado.setText(lista[0] +" - "+  lista[1] +" - "+ lista[2]);

    }

    public void limpar(View view){

        valor1.setText("");
        valor2.setText("");
        valor3.setText("");
        resultado.setText("");

    }

}
