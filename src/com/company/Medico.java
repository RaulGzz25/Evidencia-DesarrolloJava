package com.company;
import javax.swing.JOptionPane;

public class Medico {

    private String id;
    private String nombre;
    private String apellidos;
    private String especialidad;

    public Medico(String id, String nombre, String apellidos, String especialidad) {
        this.id = id;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.especialidad = especialidad;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

   //Mostrar información de los medicos
    public void mostrar() {
        String mensaje = "ID Médico: " + id + "\nNombre: " + nombre
                + "\nApellidos: " + apellidos + "\nEspecialidad: " + especialidad;
        JOptionPane.showMessageDialog(null, mensaje, "Mostrar Medico", JOptionPane.INFORMATION_MESSAGE);
    }
    public Medico remove(int i) {
        return null;
    }
    public Medico get(int i) {
        return null;
    }
    public int size() {
        return 0;
    }
}