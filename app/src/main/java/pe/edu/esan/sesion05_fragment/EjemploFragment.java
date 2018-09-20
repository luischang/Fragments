package pe.edu.esan.sesion05_fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class EjemploFragment extends Fragment {

    private Button btnCalcular;
    private EditText txtNombre;
    private TextView tvResultado;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_ejemplo, container, false);

        RelativeLayout.LayoutParams params = new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.MATCH_PARENT
                                                                            ,RelativeLayout.LayoutParams.MATCH_PARENT);
        params.addRule(RelativeLayout.BELOW, R.id.btnDinamico);
        params.setMargins(0,41,0,0);
        view.setLayoutParams(params);

        btnCalcular = (Button) view.findViewById(R.id.btnCalcular);
        txtNombre = (EditText) view.findViewById(R.id.txtNombre);
        tvResultado = (TextView) view.findViewById(R.id.tvResultado);

        btnCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String mensaje = txtNombre.getText().toString();
                tvResultado.setText(String.valueOf(mensaje.length()));
            }
        });

        return view;
    }
}
