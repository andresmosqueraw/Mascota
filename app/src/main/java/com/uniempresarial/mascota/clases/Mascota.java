package com.uniempresarial.mascota.clases;

import java.io.Serializable;

public class Mascota implements Serializable {
    private String nombre;
    private String tipo;

    public Mascota(String nombre, String tipo) {
        this.nombre = nombre;
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double calculoPago() {
        double pago = 0;
        pago = (getTipo() == "perro") ? 350000 : 250000;
        return pago;
    }

    @Override
    public String toString() {
        return "Nombre del " + tipo + ": " + nombre + "\n";
    }
}
