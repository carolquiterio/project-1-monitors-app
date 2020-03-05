package br.unicamp.projeto19351;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lvMonitores;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvMonitores = findViewById(R.id.lvMonitores);

        ArrayList<Monitor> listaMonitores = incluirNoArrayList();

        ListaMonitoresAdapter adapter = new ListaMonitoresAdapter(this, listaMonitores);

        lvMonitores.setAdapter(adapter);

        lvMonitores.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch(position){
                    case 0: goIsa();
                    break;

                    case 1: goLucas();
                    break;
                }
            }
        });
    }

    private void goLucas() {
        Intent goLucas = new Intent (MainActivity.this, LucasActivity.class);
        startActivity(goLucas);
    }

    private void goIsa() {
        Intent goIsa = new Intent (MainActivity.this, IsaActivity.class);
        startActivity(goIsa);
    }

    private ArrayList<Monitor> incluirNoArrayList() {
        ArrayList<Monitor> adicionaMonitor = new ArrayList<Monitor>();
        adicionaMonitor.add(gerarMonitor("Lucas", "19351", "Oi", R.drawable.oi ));

        return adicionaMonitor;
    }

    private Monitor gerarMonitor(String nome, String ra,String horario, int imagem){
        Monitor monitor = new Monitor();
        monitor.setNome(nome);
        monitor.setRa(ra);
        monitor.setHorario(horario);
        monitor.setImagem(imagem);

        return monitor;
    }
}
