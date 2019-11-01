package br.com.etecia.agendaapp.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

import br.com.etecia.agendaapp.R;

public class ListaUsuarioActivity extends AppCompatActivity {

    ListView listView;

    String[] txtName = {"Jupiter", "Lua", "Marte", "Plutão", "Saturno", "Sol", "Terra", "Venus"};
    String[] txtEmail = {"ashdads@gmail.com", "Lua", "Marte", "Plutão", "Saturno", "Sol", "Terra", "Venus"};
    String[] txtTel = {"213213123132", "Lua", "Marte", "Plutão", "Saturno", "Sol", "Terra", "Venus"};
    String[] txtCep = {"123123", "Lua", "Marte", "Plutão", "Saturno", "Sol", "Terra", "Venus"};
    String[] txtEndereco = {"Rua asasddas", "Lua", "Marte", "Plutão", "Saturno", "Sol", "Terra", "Venus"};
    String[] txtNasc = {"10-01-16", "Lua", "Marte", "Plutão", "Saturno", "Sol", "Terra", "Venus"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lista_usuario_layout);

        listView = findViewById(R.id.idListView);

        CustomAdapter customAdapter = new CustomAdapter();
        listView.setAdapter(customAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(getApplicationContext(),InflateActivity.class);
                intent.putExtra("nome", txtName[position]);
                intent.putExtra("email", txtEmail[position]);
                intent.putExtra("telefone", txtTel[position]);
                intent.putExtra("cep", txtCep[position]);
                intent.putExtra("endereco", txtEndereco[position]);
                intent.putExtra("nasc", txtNasc[position]);

                startActivity(intent);
            }
        });
    }

    class CustomAdapter extends BaseAdapter {
        @Override
        public int getCount() {
            return txtEmail.length;
        }

        @Override
        public Object getItem(int position) {
            return null;
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {

            View view1 = getLayoutInflater().inflate(R.layout.modelo_agenda, null);

            TextView nome = (TextView) view1.findViewById(R.id.idNome);
            TextView email = (TextView) view1.findViewById(R.id.idEmail);


            nome.setText(txtName[position]);
            email.setText(txtEmail[position]);


            return view1;
        }
    }
}
