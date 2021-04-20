package com.example.lista2java;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Exercicio1 extends AppCompatActivity {

    private EditText valor1;
    private EditText valor2;
    private EditText valor3;
    private EditText valor4;
    private TextView textResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercicio1);

        this.valor1 = findViewById(R.id.editValorA);
        this.valor2 = findViewById(R.id.editValor2);
        this.valor3 = findViewById(R.id.editValor3);
        this.valor4 = findViewById(R.id.editValor4);
        this.textResultado = findViewById(R.id.textResultado);

    }

    public void media(View view){

        Double num1 = Double.parseDouble(valor1.getText().toString());
        Double num2 = Double.parseDouble(valor2.getText().toString());
        Double num3 = Double.parseDouble(valor3.getText().toString());
        Double num4 = Double.parseDouble(valor4.getText().toString());

        Double result = (num1 + num2 + num3 + num4) / 4;

        String situacao;
        if (result >= 8.5) {
            situacao = "APROVADO";
        } else if (result < 8.5 && result > 6) {
            situacao = "EXAME";
        } else {
            situacao = "RETIDO";
        }

        textResultado.setText("A média das notas é: " + result + " Situação do aluno: " + situacao);

    }

    public void limpar(View view){

        valor1.setText("");
        valor2.setText("");
        valor3.setText("");
        valor4.setText("");
        textResultado.setText("");

    }

}
