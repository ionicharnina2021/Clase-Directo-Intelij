package com.example.pruebahttp2306directo.modelo;

public class Contrato {
    private String referencia;
    private float cuantia;

    public Contrato(String referencia, float cuantia) {
        this.referencia = referencia;
        this.cuantia = cuantia;
    }

    public float getCuantia() {
        return cuantia;
    }

    public void setCuantia(float cuantia) {
        this.cuantia = cuantia;
    }

    public String getReferencia() {
        return referencia;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

}
