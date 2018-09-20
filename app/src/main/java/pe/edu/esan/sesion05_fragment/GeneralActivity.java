package pe.edu.esan.sesion05_fragment;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class GeneralActivity extends AppCompatActivity {
    private Button btnDinamico;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_general);

        btnDinamico = (Button) findViewById(R.id.btnDinamico);

        btnDinamico.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                FragmentManager fragmentManager = getSupportFragmentManager();
                FragmentTransaction transaction = fragmentManager.beginTransaction();

                EjemploFragment fragmentoEjemplo = new EjemploFragment();
                transaction.add(R.id.contenedor, fragmentoEjemplo);

                transaction.commit();
            }
        });

    }
}
