package br.com.unisagrado.MECA;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class TelaAvaliacao extends AppCompatActivity {

    ImageView btnVoltarAvaliacao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_avaliacao);
        btnVoltarAvaliacao = (ImageView) findViewById(R.id.btnVoltarAvaliacao);

        btnVoltarAvaliacao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });
    }
}