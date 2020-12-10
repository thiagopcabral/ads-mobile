package com.example.n1thiagocabraltest2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Nome extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick(View view) {
        Intent intent_nome = new Intent(Nome.this, Notas.class);
        EditText edtNome = (EditText) findViewById(R.id.nome);
        String nome = edtNome.getText().toString();
        intent_nome.putExtra("NOME", nome);
        startActivity(intent_nome);
    }
}