package com.example.lista2java;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void button1(View view){

        Intent intent = new Intent(getApplicationContext(), Exercicio1.class);
        startActivity(intent);

    }

    public void button2(View view){

        Intent intent = new Intent(getApplicationContext(), Exercicio2.class);
        startActivity(intent);

    }

    public void button3(View view){

        Intent intent = new Intent(getApplicationContext(), Exercicio3.class);
        startActivity(intent);

    }

    public void button4(View view){

        Intent intent = new Intent(getApplicationContext(), Exercicio4.class);
        startActivity(intent);

    }

    public void button5(View view){

        Intent intent = new Intent(getApplicationContext(), Exercicio5.class);
        startActivity(intent);

    }

    public void button6(View view){

        Intent intent = new Intent(getApplicationContext(), Exercicio6.class);
        startActivity(intent);

    }

}
