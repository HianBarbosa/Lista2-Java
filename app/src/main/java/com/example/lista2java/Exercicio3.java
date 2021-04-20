package com.example.lista2java;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Exercicio3 extends AppCompatActivity {

    private EditText valorA;
    private EditText valorB;
    private EditText valorC;
    private TextView resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercicio3);

        valorA = findViewById(R.id.editValorA);
        valorB = findViewById(R.id.editValorB);
        valorC = findViewById(R.id.editValorC);
        resultado = findViewById(R.id.textResultado);

    }

    public void baskhara(View view){

        Double numA = Double.parseDouble(valorA.getText().toString());
        Double numB = Double.parseDouble(valorB.getText().toString());
        Double numC = Double.parseDouble(valorC.getText().toString());

        Double delta = ((numB*numB) - 4 * numA * numC);

        if (delta < 0){
            resultado.setText("Delta menor do que 0. Impossível calcular");
        }
        else if (delta == 0){
            Double raiz = ((numB * (-1)) / (2 * numA));
            resultado.setText("Possui uma raiz real: " + raiz);
        }
        else {
            Double raiz1 = (((numB * (-1) + Math.sqrt(delta)) / (2 * numA)));
            Double raiz2 = (((numB * (-1) - Math.sqrt(delta)) / (2 * numA)));

            resultado.setText("X1 = " + raiz1 + " | X2 = " + raiz2);

        }

    }

    public void limpar(View view){

        valorA.setText("");
        valorB.setText("");
        valorC.setText("");
        resultado.setText("");

    }

}
