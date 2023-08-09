package com.uniempresarial.mascota;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Principal extends AppCompatActivity {

    private Button begin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.principal);

        this.begin = findViewById(R.id.btn_begin);
    }

    public void beginRegister(View view) {
        Intent start = new Intent(this, MainActivity.class);
        startActivity(start);
    }
}