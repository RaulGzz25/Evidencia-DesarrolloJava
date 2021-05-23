package com.company;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class EditMedico {
    private ArrayList<Medico> medicos;

    public EditMedico() {
        medicos = new ArrayList<Medico>();
    }

    public boolean nuevoMedico() {
        String id = JOptionPane.showInputDialog(null, "Introduzca Id del médico:", "Agregar médico", JOptionPane.QUESTION_MESSAGE);
        String nombre = JOptionPane.showInputDialog(null, "Nombre:", "Agregar médico", JOptionPane.QUESTION_MESSAGE);
        String apellidos = JOptionPane.showInputDialog(null, "Apellidos:", "Agregar médico", JOptionPane.QUESTION_MESSAGE);
        String especialidad = JOptionPane.showInputDialog(null, "Especialidad:", "Agregar médico", JOptionPane.QUESTION_MESSAGE);

        Medico nuevoMedico = new Medico(id, nombre, apellidos, especialidad);
        return medicos.add(nuevoMedico);
    }


    public void mostrarMedico() {
        for (Medico m: medicos)
            m.mostrar();
    }

    public boolean modificarMedico() {
        String id = JOptionPane.showInputDialog(null, "Introduzca Id del médico a modificar:",
                "Modificar médico", JOptionPane.QUESTION_MESSAGE);

        Medico medico = null;
        for (int i = 0; i < medicos.size(); i++){
            if (medicos.get(i).getId().equals(id)) {
                medico = medicos.get(i);
                break;
            }
        }

        if (medico == null) {
            JOptionPane.showMessageDialog(null, "No se encuentra el médico con el Id:\n" + id,
                    "Medico no encontrado", JOptionPane.WARNING_MESSAGE);
            return false;
        }
        else {

            medico.setId(JOptionPane.showInputDialog(null, "ID: " + medico.getId()
                    + "\nIngresa nuevo Id:", "Modificar Medico", JOptionPane.QUESTION_MESSAGE));
            medico.setNombre(JOptionPane.showInputDialog(null, "Nombre: " + medico.getNombre()
                    + "\nIngresa nuevo nombre:", "Modificar Medico", JOptionPane.QUESTION_MESSAGE));
            medico.setApellidos(JOptionPane.showInputDialog(null, "Apellidos: " + medico.getApellidos()
                    + "\nIngresa nuevos apellidos:", "Modificar Medico", JOptionPane.QUESTION_MESSAGE));
            medico.setEspecialidad(JOptionPane.showInputDialog(null, "Especialidad: " + medico.getEspecialidad()
                    + "\nIngresa nueva especialidad:", "Modificar Medico", JOptionPane.QUESTION_MESSAGE));

            return true;
        }
    }


    public boolean borrarMedico() {
        String id = JOptionPane.showInputDialog(null, "Ingresa ID del médico a borrar:",
                "Borrar medico", JOptionPane.QUESTION_MESSAGE);

        Medico medico = null;
        for (int i = 0; i < medicos.size(); i++){
            if (medicos.get(i).getId().equals(id))
                medico = medico.remove(i);
        }

        if (medico == null) {
            JOptionPane.showMessageDialog(null, "No se encuentra el médico con el ID:\n" + id,
                    "Médico no encontrado", JOptionPane.WARNING_MESSAGE);
            return false;
        }
        else {
            JOptionPane.showMessageDialog(null, "Se elimino el médico con ID:\n" + id,
                    "Médico eliminado", JOptionPane.INFORMATION_MESSAGE);
            return false;
        }

    }
}
