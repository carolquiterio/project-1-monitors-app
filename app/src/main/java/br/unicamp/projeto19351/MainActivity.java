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
    Monitor monitor;
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
                    case 0: goLucas();
                    break;

                    case 1: goIsa();
                    break;

                    case 2: goNouani();
                    break;

                    case 3: goArruda();
                    break;

                    case 4: goNicholas();
                    break;
                }
            }
        });
    }

    private void goArruda() {
        Intent goArruda = new Intent (MainActivity.this, ArrudaActivity.class);
        startActivity(goArruda);
    }

    private void goNouani() {
        Intent goNouani = new Intent (MainActivity.this, NouaniActivity.class);
        startActivity(goNouani);
    }

    private void goNicholas() {
        Intent goNicholas = new Intent (MainActivity.this, NicholasActivity.class);
        startActivity(goNicholas);
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
        adicionaMonitor.add(gerarMonitor("Lucas Silva", "19351", "segunda", R.drawable.lucas ));
        adicionaMonitor.add(gerarMonitor("Isabela Paulino", "19351", "terca", R.drawable.isa ));
        adicionaMonitor.add(gerarMonitor("Nouani Sanches", "19351", "quarta", R.drawable.nouani ));
        adicionaMonitor.add(gerarMonitor("Gabriel Arruda", "19351", "quinta", R.drawable.arruda ));
        adicionaMonitor.add(gerarMonitor("Nicholas Duarte", "19351", "sexta", R.drawable.nicolas ));

        return adicionaMonitor;
    }

    private Monitor gerarMonitor(String nome, String ra,String horario, int imagem){
        monitor = new Monitor();
        monitor.setNome(nome);
        monitor.setRa(ra);
        monitor.setHorario(horario);
        monitor.setImagem(imagem);

        return monitor;
    }
}
