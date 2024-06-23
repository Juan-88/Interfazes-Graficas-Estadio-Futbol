/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.interfaz_grafica_estadio_futbol;

/**
 *
 * @author Juan David
 */
import java.util.ArrayList;

public class Equipo {
    String nombre;
    String entrenador;
    ArrayList<Jugador> jugadores;

    public Equipo(String nombre, String entrenador) {
        this.nombre = nombre;
        this.entrenador = entrenador;
        this.jugadores = new ArrayList<>();
    }

    public String mostrarInfo() {
        StringBuilder jugadoresInfo = new StringBuilder();
        for (Jugador jugador : jugadores) {
            jugadoresInfo.append(jugador.nombre).append("\n");
        }
        return "Equipo: " + nombre + ", Entrenador: " + entrenador + "\nJugadores:\n" + jugadoresInfo.toString();
    }
}

