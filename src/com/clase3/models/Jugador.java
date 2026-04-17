package com.clase3.models;

import java.util.Stack;
import java.util.function.Function;

public class Jugador {

    private String nombre;
    private Categoria categoria;
    private Equipo equipo;
    private Stack<Integer> goles;

    public Jugador() {
        goles = new Stack<>();
    }

    public Jugador(String nombre, Categoria categoria, Equipo equipo) {
        this.nombre = nombre;
        this.categoria = categoria;
        this.equipo = equipo;
        this.goles = new Stack<>();
    }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public Categoria getCategoria() { return categoria; }
    public void setCategoria(Categoria categoria) { this.categoria = categoria; }

    public Equipo getEquipo() { return equipo; }
    public void setEquipo(Equipo equipo) { this.equipo = equipo; }

    public Stack<Integer> getGoles() { return goles; }

    public void agregarGoles(int gol) {
        goles.push(gol);
    }

    // Punto 5
    public int verTotalGoles(Function<Jugador, Integer> funcion) {
        return funcion.apply(this);
    }
}