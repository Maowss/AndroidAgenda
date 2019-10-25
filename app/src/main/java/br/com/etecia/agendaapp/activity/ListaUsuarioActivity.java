package br.com.etecia.agendaapp.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

import br.com.etecia.agendaapp.R;

public class ListaUsuarioActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lista_usuario_layout);
    }


    TextView txtNome, txtEmail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.modelo_agenda);

        lstPlanetas = (TextView) findViewById(R.id.lstDPlanetas);
        imgPlanetas = (ImageView) findViewById(R.id.lstIMGPlanetas);

        Intent intent = getIntent();
        String nomeRetorno = intent.getStringExtra("name");
        int imagemRetorno = intent.getIntExtra("image", 0);

        lstPlanetas.setText(nomeRetorno);
        imgPlanetas.setImageResource(imagemRetorno);

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



}
