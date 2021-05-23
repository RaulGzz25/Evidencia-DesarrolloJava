package com.company;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class EditPacientes {
    private ArrayList<Pacientes> pacientes;

    public EditPacientes() {
        pacientes = new ArrayList<Pacientes>();
    }


    public boolean nuevoPaciente() {
        String id = JOptionPane.showInputDialog(null, "Ingrese ID:", "Nuevo paciente", JOptionPane.QUESTION_MESSAGE);
        String nombre = JOptionPane.showInputDialog(null, "Nombre:", "Nuevo paciente", JOptionPane.QUESTION_MESSAGE);
        String apellidos = JOptionPane.showInputDialog(null, "Apellidos:", "Nuevo paciente", JOptionPane.QUESTION_MESSAGE);
        String genero = JOptionPane.showInputDialog(null, "Género:", "Nuevo paciente", JOptionPane.QUESTION_MESSAGE);
        int edad = 0;
        try {
            edad = Integer.parseInt(JOptionPane.showInputDialog(null, "Edad:", "Nuevo Paciente", JOptionPane.QUESTION_MESSAGE));
        }
        catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Valor no valido",
                    "Error", JOptionPane.WARNING_MESSAGE);
        }
        Pacientes nuevoPaciente = new Pacientes(id, nombre, apellidos, edad, genero);
        return pacientes.add(nuevoPaciente);
    }

    //Mostrar info de pacientes registrados
    public void mostrarPacientes() {
        for (Pacientes p: pacientes)
            p.mostrar();
    }

   // Modificar información del paciente
    public boolean modificarPaciente() {
        String id = JOptionPane.showInputDialog(null, "Ingrese el ID del paciente a editar:",
                "Modificar Paciente", JOptionPane.QUESTION_MESSAGE);

        Pacientes paciente = null;
        for (int i = 0; i < pacientes.size(); i++){
            if (pacientes.get(i).getId().equals(id)) {
                paciente = pacientes.get(i);
                break;
            }
        }

        if (paciente == null) {
            JOptionPane.showMessageDialog(null, "No se encuentra Paciente con el ID:\n" + id,
                    "Paciente no encontrado", JOptionPane.WARNING_MESSAGE);
            return false;
        }
        else {
            paciente.setId(JOptionPane.showInputDialog(null, "ID actual: " + paciente.getId()
                    + "\nIngrese nuevo ID:", "Edite Paciente", JOptionPane.QUESTION_MESSAGE));
            paciente.setNombre(JOptionPane.showInputDialog(null, "Nombre actual: " + paciente.getNombre()
                    + "\nIngrese nombre:", "Edite Paciente", JOptionPane.QUESTION_MESSAGE));
            paciente.setApellidos(JOptionPane.showInputDialog(null, "Apellidos actuales: " + paciente.getApellidos()
                    + "\nIngrese apellidos:", "Edite Paciente", JOptionPane.QUESTION_MESSAGE));
            paciente.setGenero(JOptionPane.showInputDialog(null, "Genero actual: " + paciente.getGenero()
                    + "\nIngrese especialidad:", "Edite Paciente", JOptionPane.QUESTION_MESSAGE));
            try {
                paciente.setEdad(Integer.parseInt(JOptionPane.showInputDialog(null, "Edad actual: " + paciente.getEdad()
                        + "\nIngrese nuevaedad:", "Editar Paciente", JOptionPane.QUESTION_MESSAGE)));
            }
            catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Valor no valido",
                        "Error", JOptionPane.WARNING_MESSAGE);
            }
            return true;
        }
    }

    //Eliminar paciente de la lista
    public boolean borrarPaciente() {
        String id = JOptionPane.showInputDialog(null, "Ingrese el ID del paciente a borrar:",
                "Borrar Paciente", JOptionPane.QUESTION_MESSAGE);

        Pacientes paciente = null;
        for (int i = 0; i < pacientes.size(); i++){
            if (pacientes.get(i).getId().equals(id))
                paciente = pacientes.remove(i);
        }

        if (paciente == null) {
            JOptionPane.showMessageDialog(null, "No se encontro el ID: " + id,
                    "Paciente no encontrado", JOptionPane.WARNING_MESSAGE);
            return false;
        }
        else {
            JOptionPane.showMessageDialog(null, "Se elimino el paciente con ID: " + id,
                    "Paciente Eliminado", JOptionPane.INFORMATION_MESSAGE);
            return false;
        }
    }
}
