package com.clase3.controllers;

import com.clase3.models.*;
import com.clase3.utils.Funciones;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        // 5 jugadores JUNIOR de ENVIGADO
        Jugador j1 = new Jugador("Juan Gil", Categoria.JUNIOR, Equipo.ENVIGADO);
        Jugador j2 = new Jugador("Pedro Porro", Categoria.JUNIOR, Equipo.ENVIGADO);
        Jugador j3 = new Jugador("Luis Diaz", Categoria.JUNIOR, Equipo.ENVIGADO);
        Jugador j4 = new Jugador("Carlos Bacca", Categoria.JUNIOR, Equipo.ENVIGADO);
        Jugador j5 = new Jugador("Andres Sarmiento", Categoria.JUNIOR, Equipo.ENVIGADO);

        // Jugador de NACIONAL (para punto 3)
        Jugador j6 = new Jugador("Edwin Cardona", Categoria.PROFESIONAL, Equipo.NACIONAL);

        // Goles en los últimos 5 partidos
        Arrays.asList(j1, j2, j3, j4, j5, j6).forEach(j -> {
            j.agregarGoles(1);
            j.agregarGoles(2);
            j.agregarGoles(0);
            j.agregarGoles(3);
            j.agregarGoles(1);
        });

        // Stack de jugadores
        Stack<Jugador> jugadores = new Stack<>();
        jugadores.addAll(Arrays.asList(j1, j2, j3, j4, j5, j6));

        // Convertir a Deque
        Deque<Jugador> dequeJugadores = new ArrayDeque<>(jugadores);

        // Entrenador
        Entrenador entrenador = new Entrenador("Profe", Categoria.JUNIOR, Equipo.ENVIGADO, 10);
        entrenador.setJugadores(dequeJugadores);

        // =========================
        // PUNTO 2 - ListIterator (SIN WHILE)
        System.out.println("ListIterator (Stack):");
        ListIterator<Jugador> it = jugadores.listIterator();

        for (; it.hasNext(); ) {
            Jugador j = it.next();
            System.out.println(j.getNombre() + " - " + j.getCategoria() + " - " + j.getEquipo());
        }

        // Iterator con Deque (SIN WHILE)
        System.out.println("\nIterator (Deque):");
        Iterator<Jugador> it2 = dequeJugadores.iterator();

        for (; it2.hasNext(); ) {
            Jugador j = it2.next();
            System.out.println(j.getNombre() + " - " + j.getCategoria() + " - " + j.getEquipo());
        }

        // =========================
        // PUNTO 3 - Programación funcional
        System.out.println("\nJugadores de NACIONAL:");
        dequeJugadores.stream()
                .filter(j -> j.getEquipo() == Equipo.NACIONAL)
                .forEach(j -> System.out.println(j.getNombre()));

        // =========================
        // PUNTO 5 - Total de goles usando Function
        System.out.println("\nTotal goles:");
        System.out.println(j1.getNombre() + ": " + j1.verTotalGoles(Funciones.sumaGoles));
    }
}