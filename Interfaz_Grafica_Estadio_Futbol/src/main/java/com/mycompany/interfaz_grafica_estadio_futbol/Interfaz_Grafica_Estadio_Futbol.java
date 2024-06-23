/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.interfaz_grafica_estadio_futbol;

/**
 *
 * @author Juan David
 */
import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class Interfaz_Grafica_Estadio_Futbol extends JFrame {
    private final ArrayList<Jugador> jugadores;
    private final ArrayList<Equipo> equipos;
    private final ArrayList<Estadio> estadios;
    private final ArrayList<Grupo> grupos;

    private final JTextField entryJugadorNombre;
    private final JTextField entryJugadorEdad;
    private final JTextField entryJugadorPosicion;
    private final JTextField entryEquipoNombre;
    private final JTextField entryEquipoEntrenador;
    private final JComboBox<String> comboboxEquipo;
    private final JComboBox<String> comboboxJugador;
    private final JTextField entryEstadioNombre;
    private final JTextField entryEstadioCiudad;
    private final JTextField entryEstadioCapacidad;
    private final JTextField entryGrupoNombre;
    private final JComboBox<String> comboboxGrupo;
    private final JComboBox<String> comboboxEquipoGrupo;

    public Interfaz_Grafica_Estadio_Futbol() {
        jugadores = new ArrayList<>();
        equipos = new ArrayList<>();
        estadios = new ArrayList<>();
        grupos = new ArrayList<>();

        setTitle("Sistema de Gestión de Mundial");
        setSize(600, 800);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setBackground(Color.BLUE);
        setLayout(new GridLayout(27, 2));

        // Widgets para registrar jugadores
        addLabel("Registrar Jugador");
        add(new JLabel(""));

        addLabel("Nombre:");
        entryJugadorNombre = new JTextField();
        add(entryJugadorNombre);

        addLabel("Edad:");
        entryJugadorEdad = new JTextField();
        add(entryJugadorEdad);

        addLabel("Posición:");
        entryJugadorPosicion = new JTextField();
        add(entryJugadorPosicion);

        JButton btnRegistrarJugador = new JButton("Registrar Jugador");
        btnRegistrarJugador.addActionListener(e -> registrarJugador());
        add(btnRegistrarJugador);
        add(new JLabel(""));

        // Widgets para registrar equipos
        addLabel("Registrar Equipo");
        add(new JLabel(""));

        addLabel("Nombre:");
        entryEquipoNombre = new JTextField();
        add(entryEquipoNombre);

        addLabel("Entrenador:");
        entryEquipoEntrenador = new JTextField();
        add(entryEquipoEntrenador);

        JButton btnRegistrarEquipo = new JButton("Registrar Equipo");
        btnRegistrarEquipo.addActionListener(e -> registrarEquipo());
        add(btnRegistrarEquipo);
        add(new JLabel(""));

        // Widgets para agregar jugadores a equipos
        addLabel("Agregar Jugador a Equipo");
        add(new JLabel(""));

        addLabel("Equipo:");
        comboboxEquipo = new JComboBox<>();
        add(comboboxEquipo);

        addLabel("Jugador:");
        comboboxJugador = new JComboBox<>();
        add(comboboxJugador);

        JButton btnAgregarJugador = new JButton("Agregar Jugador");
        btnAgregarJugador.addActionListener(e -> agregarJugadorAEquipo());
        add(btnAgregarJugador);
        add(new JLabel(""));

        // Widgets para registrar estadios
        addLabel("Registrar Estadio");
        add(new JLabel(""));

        addLabel("Nombre:");
        entryEstadioNombre = new JTextField();
        add(entryEstadioNombre);

        addLabel("Ciudad:");
        entryEstadioCiudad = new JTextField();
        add(entryEstadioCiudad);

        addLabel("Capacidad:");
        entryEstadioCapacidad = new JTextField();
        add(entryEstadioCapacidad);

        JButton btnRegistrarEstadio = new JButton("Registrar Estadio");
        btnRegistrarEstadio.addActionListener(e -> registrarEstadio());
        add(btnRegistrarEstadio);
        add(new JLabel(""));

        // Widgets para registrar grupos
        addLabel("Registrar Grupo");
        add(new JLabel(""));

        addLabel("Nombre:");
        entryGrupoNombre = new JTextField();
        add(entryGrupoNombre);

        JButton btnRegistrarGrupo = new JButton("Registrar Grupo");
        btnRegistrarGrupo.addActionListener(e -> registrarGrupo());
        add(btnRegistrarGrupo);
        add(new JLabel(""));

        // Widgets para agregar equipos a grupos
        addLabel("Agregar Equipo a Grupo");
        add(new JLabel(""));

        addLabel("Grupo:");
        comboboxGrupo = new JComboBox<>();
        add(comboboxGrupo);

        addLabel("Equipo:");
        comboboxEquipoGrupo = new JComboBox<>();
        add(comboboxEquipoGrupo);

        JButton btnAgregarEquipo = new JButton("Agregar Equipo");
        btnAgregarEquipo.addActionListener(e -> agregarEquipoAGrupo());
        add(btnAgregarEquipo);
        add(new JLabel(""));

        // Widgets para generar fixture
        JButton btnGenerarFixture = new JButton("Generar Fixture");
        btnGenerarFixture.addActionListener(e -> generarFixture());
        add(btnGenerarFixture);
        add(new JLabel(""));

        // Botón para mostrar información de los equipos
        JButton btnMostrarInfoEquipos = new JButton("Mostrar Información de Equipos");
        btnMostrarInfoEquipos.addActionListener(e -> mostrarInfoEquipos());
        add(btnMostrarInfoEquipos);
        add(new JLabel(""));

        setVisible(true);
    }

    private void addLabel(String text) {
        JLabel label = new JLabel(text);
        label.setForeground(Color.WHITE);
        add(label);
    }

    private void registrarJugador() {
        String nombre = entryJugadorNombre.getText();
        String edad = entryJugadorEdad.getText();
        String posicion = entryJugadorPosicion.getText();
        Jugador jugador = new Jugador(nombre, edad, posicion);
        jugadores.add(jugador);
        JOptionPane.showMessageDialog(this, "Jugador registrado con éxito");
        comboboxJugador.addItem(nombre);
    }

    private void registrarEquipo() {
        String nombre = entryEquipoNombre.getText();
        String entrenador = entryEquipoEntrenador.getText();
        Equipo equipo = new Equipo(nombre, entrenador);
        equipos.add(equipo);
        JOptionPane.showMessageDialog(this, "Equipo registrado con éxito");
        comboboxEquipo.addItem(nombre);
        comboboxEquipoGrupo.addItem(nombre);
    }

    private void agregarJugadorAEquipo() {
        String equipoNombre = (String) comboboxEquipo.getSelectedItem();
        String jugadorNombre = (String) comboboxJugador.getSelectedItem();
        Equipo equipo = equipos.stream().filter(e -> e.nombre.equals(equipoNombre)).findFirst().orElse(null);
        Jugador jugador = jugadores.stream().filter(j -> j.nombre.equals(jugadorNombre)).findFirst().orElse(null);
        if (equipo != null && jugador != null) {
            equipo.jugadores.add(jugador);
            JOptionPane.showMessageDialog(this, "Jugador agregado al equipo con éxito");
        } else {
            JOptionPane.showMessageDialog(this, "Equipo o jugador no encontrado", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void registrarEstadio() {
        String nombre = entryEstadioNombre.getText();
        String ciudad = entryEstadioCiudad.getText();
        String capacidad = entryEstadioCapacidad.getText();
        Estadio estadio = new Estadio(nombre, ciudad, capacidad);
        estadios.add(estadio);
        JOptionPane.showMessageDialog(this, "Estadio registrado con éxito");
    }

    private void registrarGrupo() {
        String nombre = entryGrupoNombre.getText();
        Grupo grupo = new Grupo(nombre);
        grupos.add(grupo);
        JOptionPane.showMessageDialog(this, "Grupo registrado con éxito");
        comboboxGrupo.addItem(nombre);
    }

    private void agregarEquipoAGrupo() {
        String grupoNombre = (String) comboboxGrupo.getSelectedItem();
        String equipoNombre = (String) comboboxEquipoGrupo.getSelectedItem();
        Grupo grupo = grupos.stream().filter(g -> g.nombre.equals(grupoNombre)).findFirst().orElse(null);
        Equipo equipo = equipos.stream().filter(e -> e.nombre.equals(equipoNombre)).findFirst().orElse(null);
        if (grupo != null && equipo != null) {
            grupo.equipos.add(equipo);
            JOptionPane.showMessageDialog(this, "Equipo agregado al grupo con éxito");
        } else {
            JOptionPane.showMessageDialog(this, "Grupo o equipo no encontrado", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void generarFixture() {
        Mundial mundial = new Mundial();
        mundial.grupos.addAll(grupos);
        mundial.estadios.addAll(estadios);
        ArrayList<Partido> fixture = mundial.generarFixture();
        StringBuilder fixtureInfo = new StringBuilder();
        for (Partido partido : fixture) {
            fixtureInfo.append(partido.mostrarResultado()).append("\n\n");
        }
        JOptionPane.showMessageDialog(this, fixtureInfo.length() > 0 ? fixtureInfo.toString() : "No hay partidos para mostrar");
    }

    private void mostrarInfoEquipos() {
        StringBuilder infoEquipos = new StringBuilder();
        for (Equipo equipo : equipos) {
            infoEquipos.append(equipo.mostrarInfo()).append("\n\n");
        }
        JOptionPane.showMessageDialog(this, infoEquipos.length() > 0 ? infoEquipos.toString() : "No hay equipos registrados");
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(Interfaz_Grafica_Estadio_Futbol::new);
    }
}