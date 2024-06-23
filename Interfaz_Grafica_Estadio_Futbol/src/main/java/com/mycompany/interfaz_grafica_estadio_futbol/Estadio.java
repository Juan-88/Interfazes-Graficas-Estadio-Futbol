/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.interfaz_grafica_estadio_futbol;

/**
 *
 * @author Juan David
 */
public class Estadio {
    String nombre;
    String ciudad;
    String capacidad;

    public Estadio(String nombre, String ciudad, String capacidad) {
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.capacidad = capacidad;
    }

    public String mostrarInfo() {
        return "Estadio: " + nombre + ", Ciudad: " + ciudad + ", Capacidad: " + capacidad;
    }
}
