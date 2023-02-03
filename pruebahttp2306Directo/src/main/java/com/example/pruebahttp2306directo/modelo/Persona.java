package com.example.pruebahttp2306directo.modelo;

import lombok.*;

import java.util.Objects;

@Builder
public class Persona {
    @NonNull
    private int id;
    @NonNull
    private  String nombre;
    private String apellidos;
}
