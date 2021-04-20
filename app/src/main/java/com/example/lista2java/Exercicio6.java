package com.example.lista2java;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Exercicio6 extends AppCompatActivity {

    EditText valor;
    TextView resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercicio6);

        valor = findViewById(R.id.editValor);
        resultado = findViewById(R.id.textResultado);

    }

    public void verificar(View view){

        int num = Integer.parseInt(valor.getText().toString());
        valor.setText("");

        if (num >= 10 && num <= 50){
            resultado.setText("O número " +num+ " existe na faixa");
        }
        else {
            resultado.setText("O número " +num+ " não existe na faixa");
        }

    }

}
