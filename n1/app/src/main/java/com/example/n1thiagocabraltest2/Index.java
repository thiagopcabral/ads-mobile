package com.example.n1thiagocabraltest2;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Index extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_index);

        TextView tvNome = (TextView) findViewById(R.id.nome);
        TextView tvResultado = (TextView) findViewById(R.id.resultado);

        tvNome.setText(getIntent().getStringExtra("NOME"));

        Integer n1 = getIntent().getIntExtra("N1", 0);
        Integer n2 = getIntent().getIntExtra("N2", 0);


        if ((n1 + n2 / 2) > 7) {
            tvResultado.setText("Aprovado!");
        }
        else {
            tvResultado.setText("Reprovado!");
        }

    }
}