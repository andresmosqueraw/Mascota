package com.uniempresarial.mascota;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

import com.uniempresarial.mascota.clases.Mascota;

import java.io.Serializable;

public class MainActivity extends AppCompatActivity {

    private RadioButton rbCat;
    private RadioButton rbDog;
    private EditText namePet;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        inicio();
    }

    private void inicio(){
        rbCat = findViewById(R.id.rb_gatito);
        rbDog = findViewById(R.id.rb_perrito);
        namePet = findViewById(R.id.et_nombre);
    }

    public void totalPago(View view){
        String tipo = (rbCat.isChecked() == true) ? "gato" : "perro";

        // Validación del nombre de la mascota
        if (namePet.getText().toString().trim().isEmpty()) {
            Toast.makeText(this, "El nombre de la mascota no puede estar vacío.", Toast.LENGTH_SHORT).show();
            return;
        }

        // Validación de selección de tipo
        if (!rbCat.isChecked() && !rbDog.isChecked()) {
            Toast.makeText(this, "Por favor, selecciona un tipo de mascota.", Toast.LENGTH_SHORT).show();
            return;
        }

        Mascota mascota = new Mascota(namePet.getText().toString(),tipo);
        double resultadoPago = mascota.calculoPago();
        irResultado(resultadoPago, mascota);
    }

    public void irResultado(double pago, Mascota mascota){
        Intent resultado = new Intent(this, Resultado.class);
        resultado.putExtra("result", (Serializable) mascota);
        resultado.putExtra("pago", pago);
        startActivity(resultado);
    }
}