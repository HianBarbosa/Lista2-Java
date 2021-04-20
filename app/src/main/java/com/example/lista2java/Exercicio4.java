package com.example.lista2java;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Exercicio4 extends AppCompatActivity {

    private EditText valores;
    private TextView resultado;
    private Button enviar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercicio4);

        valores = findViewById(R.id.editValores);
        resultado = findViewById(R.id.textFaltam);
        enviar = findViewById(R.id.buttonEnviar);

    }

    int[] numeros = new int[10];
    int i = 0;
    public void adicionar(View view){

        if (i < numeros.length){
            numeros[i] = Integer.valueOf(valores.getText().toString());
            valores.setText("");
            i++;
            if ((10-i) != 0) {
                resultado.setText("Faltam " + (10 - i) + " números");
            }
            else {
                resultado.setText("Aperte para ver o resultado");
                valores.setEnabled(false);
                enviar.setText("Verificar");
            }
        }
        else {

            Arrays.sort(numeros);
            resultado.setText(numeros[0] +" - "+ numeros[9]);
            valores.setText("");

        }
    }

}
