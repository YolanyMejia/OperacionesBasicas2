package com.example.operacionesbasicas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText n1,n2;
    Button btnSumar,btnRestar,btnMultiplicar,btnDividir;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //codigo
        n1 = findViewById(R.id.edt01);
        n2 = findViewById(R.id.edt02);
        btnSumar = findViewById(R.id.btnSumar);
        btnRestar = findViewById(R.id.btnRestar);
        btnMultiplicar = findViewById(R.id.btnMultiplicar);
        btnDividir = findViewById(R.id.btnDividir);

        btnSumar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double num1 = Double.parseDouble( n1.getText().toString());
                int num2 = Integer.parseInt( n2.getText().toString());

                double resultado = num1 + num2;

                Toast.makeText(MainActivity.this, "La suma es: "+resultado, Toast.LENGTH_LONG).show();

            }
        });

        btnRestar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double num1 = Double.parseDouble( n1.getText().toString());
                int num2 = Integer.parseInt( n2.getText().toString());

                double resultado = num1 - num2;

                Toast.makeText(MainActivity.this, "La Resta es: "+resultado, Toast.LENGTH_LONG).show();

            }
        });

        btnMultiplicar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double num1 = Double.parseDouble( n1.getText().toString());
                int num2 = Integer.parseInt( n2.getText().toString());

                double resultado = num1 * num2;

                Toast.makeText(MainActivity.this, "La Multiplicacion es: "+resultado, Toast.LENGTH_LONG).show();

            }
        });

        btnDividir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double num1 = Double.parseDouble( n1.getText().toString());
                int num2 = Integer.parseInt( n2.getText().toString());

                double resultado = num1 / num2;

                Toast.makeText(MainActivity.this, "La Division es: "+resultado, Toast.LENGTH_LONG).show();

            }
        });
    }}