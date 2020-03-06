package br.unicamp.projeto19351;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

public class IsaActivity extends AppCompatActivity {

    TextView tvIsa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_isa);

        tvIsa = findViewById(R.id.tvIsa);
        tvIsa.setText("oi");
    }
}
