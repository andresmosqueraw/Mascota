package com.uniempresarial.mascota;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.uniempresarial.mascota.clases.Mascota;

public class Resultado extends AppCompatActivity {

    private TextView datos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.resultado);
        datos = findViewById(R.id.tv_resultado);
        receiver();
    }

    public void receiver(){
        Bundle receiverD = getIntent().getExtras();
        if (receiverD != null) {
            Mascota mascota;
            mascota = (Mascota) receiverD.get("result");
            double pago = (double) receiverD.get("pago");
            Toast.makeText(this, "" + mascota, Toast.LENGTH_SHORT).show();
            datos.setText(mascota.toString()+ "Pago: " + pago + " pesos.");
        }
    }
}