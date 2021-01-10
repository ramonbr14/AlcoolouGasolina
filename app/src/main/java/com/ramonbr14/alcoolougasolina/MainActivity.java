package com.ramonbr14.alcoolougasolina;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText edAlcool;
    private EditText edGasolina;
    private TextView tvresultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edAlcool = findViewById(R.id.edalcool);
        edGasolina = findViewById(R.id.edgasolina);
        tvresultado = findViewById(R.id.txresultado);


    }

    /*medoto que calcula o preco da gasolina vs alcool dizendo qual é o melhor*/
    public void calcularPreco(View view){
        Double precoAlcool = Double.parseDouble(edAlcool.getText().toString());
        Double precoGasolina = Double.parseDouble(edGasolina.getText().toString());

        /* */
        Double resultado = precoAlcool/precoGasolina;

        if(resultado >= 0.7){
               tvresultado.setText("USE GASOLINA!"+resultado );
        }else{
                tvresultado.setText("USE ALCOOL!"+resultado);
        }


    }

    public void Limpar(View view){
        edGasolina.setText("");
        edAlcool.setText("");
        tvresultado.setText("AGUARDANDO CALCULO");

    }
}
