package br.unicamp.projeto19351;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class ListaMonitoresAdapter extends ArrayAdapter<Monitor> {

    private Context context;
    private List<Monitor> listaMonitores = null;

    public ListaMonitoresAdapter(@NonNull Context context, @NonNull List<Monitor> listaMonitores){
        super(context, 0, listaMonitores);

        this.context = context;
        this.listaMonitores = listaMonitores;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View view, @Nullable ViewGroup parent) {

        Monitor monitor = listaMonitores.get(position);

        if(view == null){
            view = LayoutInflater.from(context).inflate(R.layout.activity_lista_monitores, null);

            ImageView imagem = view.findViewById(R.id.image_view_monitor);

            imagem.setImageResource(monitor.getImagem());

            TextView nome = view.findViewById(R.id.tvNome);
            nome.setText(monitor.getNome());
        }
        return view;
    }
}
