/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.interfaz_grafica_estadio_futbol;

/**
 *
 * @author Juan David
 */
public class Partido {
    Equipo equipoLocal;
    Equipo equipoVisitante;
    Estadio estadio;
    String resultado;

    public Partido(Equipo equipoLocal, Equipo equipoVisitante, Estadio estadio) {
        this.equipoLocal = equipoLocal;
        this.equipoVisitante = equipoVisitante;
        this.estadio = estadio;
        this.resultado = null;
    }

    public String mostrarResultado() {
        return resultado != null ? 
               "Partido: " + equipoLocal.nombre + " vs " + equipoVisitante.nombre + ", Resultado: " + resultado : 
               "El partido aún no se ha jugado";
    }
}
