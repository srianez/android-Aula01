package br.com.fiap.placar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class PlacarActivity extends AppCompatActivity {

    private TextView tvTimeCasa;
    private TextView tvTimeVisitante;
    private TextView tvPlacarCasa;
    private TextView tvPlacarVisitante;

    private int golCasa = 0, golVisitante = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_placar);

        tvTimeCasa = (TextView) findViewById(R.id.tvTimeCasa);
        tvTimeVisitante = (TextView) findViewById(R.id.etTimeVisitante);
        tvPlacarCasa = (TextView) findViewById(R.id.tvPlacarCasa);
        tvPlacarVisitante = (TextView) findViewById(R.id.etTimeVisitante);

    }

    public void  golCasa(View v) {
        golCasa ++;
        tvPlacarCasa.setText(golCasa);
    }

    public void  golVisitante(View v) {
        golVisitante ++;
        tvPlacarVisitante.setText(golVisitante);
    }
}
