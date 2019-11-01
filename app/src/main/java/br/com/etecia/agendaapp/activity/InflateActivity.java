package br.com.etecia.agendaapp.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

import br.com.etecia.agendaapp.R;

public class InflateActivity extends AppCompatActivity {

    TextView txtNome, txtEmail, txtTel, txtCep, txtEndereco, txtNasc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.carrega_usuario);

        txtNome = (TextView) findViewById(R.id.viewNome);
        txtEmail = (TextView) findViewById(R.id.viewEmail);
        txtTel = (TextView) findViewById(R.id.viewTel);
        txtCep = (TextView) findViewById(R.id.viewCEP);
        txtEndereco = (TextView) findViewById(R.id.viewEndereco);
        txtNasc = (TextView) findViewById(R.id.viewNasc);

        Intent intent = getIntent();
        String nomeRetorno = intent.getStringExtra("nome");
        String emailRetorno = intent.getStringExtra("email");
        String telRetorno = intent.getStringExtra("telefone");
        String cepRetorno = intent.getStringExtra("cep");
        String enderecoRetorno = intent.getStringExtra("endereco");
        String nascRetorno = intent.getStringExtra("nasc");



        txtNome.setText(nomeRetorno);
        txtEmail.setText(emailRetorno);
        txtTel.setText(telRetorno);
        txtCep.setText(cepRetorno);
        txtEndereco.setText(enderecoRetorno);
        txtNasc.setText(nascRetorno);


        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            onBackPressed();
        }
        return super.onOptionsItemSelected(item);
    }
    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }
}