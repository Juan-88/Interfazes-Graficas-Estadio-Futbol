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

public class Grupo {
    String nombre;
    ArrayList<Equipo> equipos;

    public Grupo(String nombre) {
        this.nombre = nombre;
        this.equipos = new ArrayList<>();
    }

    public String mostrarInfo() {
        StringBuilder equiposInfo = new StringBuilder();
        for (Equipo equipo : equipos) {
            equiposInfo.append(equipo.mostrarInfo()).append("\n");
        }
        return "Grupo: " + nombre + "\nEquipos:\n" + equiposInfo.toString();
    }
}
