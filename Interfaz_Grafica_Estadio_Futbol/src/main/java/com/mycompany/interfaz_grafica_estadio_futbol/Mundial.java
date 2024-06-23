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

class Mundial {
    ArrayList<Grupo> grupos;
    ArrayList<Estadio> estadios;

    public Mundial() {
        this.grupos = new ArrayList<>();
        this.estadios = new ArrayList<>();
    }

    public ArrayList<Partido> generarFixture() {
        ArrayList<Partido> fixture = new ArrayList<>();
        for (Grupo grupo : grupos) {
            ArrayList<Equipo> equipos = grupo.equipos;
            for (int i = 0; i < equipos.size(); i++) {
                for (int j = i + 1; j < equipos.size(); j++) {
                    Partido partido = new Partido(equipos.get(i), equipos.get(j), estadios.get(0));  // Se usa el primer estadio
                    fixture.add(partido);
                }
            }
        }
        return fixture;
    }
}
