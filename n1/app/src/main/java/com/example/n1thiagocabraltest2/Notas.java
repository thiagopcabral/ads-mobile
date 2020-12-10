package com.example.n1thiagocabraltest2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class Notas extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notas);
    }

    public void onClick_sobrenome(View view) {
        EditText edtN1 = (EditText) findViewById(R.id.n1);
        EditText edtN2 = (EditText) findViewById(R.id.n2);
        String nome = getIntent().getStringExtra("NOME");

        Integer n1 = Integer.parseInt(edtN1.getText().toString());
        Integer n2 = Integer.parseInt(edtN2.getText().toString());

        Intent intent_notas = new Intent(Notas.this, Index.class);
        intent_notas.putExtra("N1", n1);
        intent_notas.putExtra("N2", n2);
        intent_notas.putExtra("NOME", nome);
        startActivity(intent_notas);
    }
}