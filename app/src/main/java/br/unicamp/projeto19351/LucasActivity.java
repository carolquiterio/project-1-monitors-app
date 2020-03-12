package br.unicamp.projeto19351;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.google.android.material.tabs.TabItem;

import org.w3c.dom.Text;

public class LucasActivity extends AppCompatActivity {

    Monitor monitor;
    ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lucas);

       // imageView = findViewById(R.id.image_view_monitor);

      //  imageView.setImageResource(monitor.getImagem());
    }
}
