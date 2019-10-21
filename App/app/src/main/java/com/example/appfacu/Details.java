package com.example.appfacu;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Details extends AppCompatActivity {
    Button btEditar;
    TextView id, nome, telefone, email;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        // Mostra um botão na Barra Superior para voltar
        getSupportActionBar().setTitle("Contato - Detalhes");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeButtonEnabled(true);

        id = findViewById(R.id.textLerId);
        nome = findViewById(R.id.textLerNome);
        telefone = findViewById(R.id.textLerTelefone);
        email = findViewById(R.id.textLerEmail);
        btEditar = findViewById(R.id.btEditar);

        Intent itContato = getIntent();
        final Contato contato = (Contato)itContato.getExtras().getSerializable("objContato");

        id.setText(String.valueOf(contato.getId()));
        nome.setText(contato.getNome());
        telefone.setText(contato.getTelefone());
        email.setText(contato.getEmail());

        //BtEditar

    }



}
