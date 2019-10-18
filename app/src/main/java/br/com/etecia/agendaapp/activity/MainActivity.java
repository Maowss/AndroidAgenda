package br.com.etecia.agendaapp.activity;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import br.com.etecia.agendaapp.R;
import br.com.etecia.agendaapp.model.PessoaActivity;

public class MainActivity extends AppCompatActivity {

    ArrayList<PessoaActivity> usuario = new ArrayList();

    ListView listView = findViewById(R.id.idListView);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
