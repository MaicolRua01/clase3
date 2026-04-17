package com.clase3.models;

import java.util.ArrayDeque;
import java.util.Deque;

public class Entrenador {

    private String nombre;
    private Categoria categoria;
    private Equipo equipo;
    private int partidosGanados;
    private Deque<Jugador> jugadores;

    public Entrenador() {
        jugadores = new ArrayDeque<>();
    }

    public Entrenador(String nombre, Categoria categoria, Equipo equipo, int partidosGanados) {
        this.nombre = nombre;
        this.categoria = categoria;
        this.equipo = equipo;
        this.partidosGanados = partidosGanados;
        this.jugadores = new ArrayDeque<>();
    }

    public Deque<Jugador> getJugadores() {
        return jugadores;
    }

    public void setJugadores(Deque<Jugador> jugadores) {
        this.jugadores = jugadores;
    }
}