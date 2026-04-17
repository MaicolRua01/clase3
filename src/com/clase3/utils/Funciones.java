package com.clase3.utils;

import com.clase3.models.Jugador;
import java.util.function.Function;

public class Funciones {

    public static Function<Jugador, Integer> sumaGoles =
            j -> j.getGoles().stream().mapToInt(Integer::intValue).sum();
}
