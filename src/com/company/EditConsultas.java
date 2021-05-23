package com.company;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class EditConsultas {
    private ArrayList<Consultas> consultas;

    public EditConsultas() {
        consultas = new ArrayList<Consultas>();
    }

    // Crear nueva consulta
    public boolean NuevaConsulta() {
        String idConsulta = JOptionPane.showInputDialog(null, "Ingrese Id de consulta:", "Crear consulta", JOptionPane.QUESTION_MESSAGE);
        String fecha = JOptionPane.showInputDialog(null, "Fecha:", "Crear consulta", JOptionPane.QUESTION_MESSAGE);
        String hora = JOptionPane.showInputDialog(null, "Hora:", "Crear consulta", JOptionPane.QUESTION_MESSAGE);
        String idPaciente = JOptionPane.showInputDialog(null, "Id paciente:", "Crear consulta", JOptionPane.QUESTION_MESSAGE);
        String idMédico = JOptionPane.showInputDialog(null, "Id médico:", "Crear consulta", JOptionPane.QUESTION_MESSAGE);
        String motivo = JOptionPane.showInputDialog(null, "Motivo:", "Crear consulta", JOptionPane.QUESTION_MESSAGE);

        Consultas NuevaConsulta = new Consultas(idConsulta, fecha, hora, idPaciente, idMédico, motivo);
        return consultas.add(NuevaConsulta);
    }

    // Mostrar info de consultas registradas
    public void mostrarConsultas() {
        for (Consultas c: consultas)
            c.mostrar();
    }

    // Modificar información de la consulta
    public boolean modificarConsulta() {
        String idConsulta = JOptionPane.showInputDialog(null, "Ingrese el ID de la consulta:",
                "Modificar consulta", JOptionPane.QUESTION_MESSAGE);

        Consultas consulta = null;
        for (int i = 0; i < consultas.size(); i++){
            if (consultas.get(i).getIdConsulta().equals(idConsulta)) {
                consulta = consultas.get(i);
                break;
            }
        }

        if (consulta == null) {
            JOptionPane.showMessageDialog(null, "No se encuentra la consulta con el ID:\n" + idConsulta,
                    "Consulta no encontrada", JOptionPane.WARNING_MESSAGE);
            return false;
        }
        else {
            consulta.setFecha(JOptionPane.showInputDialog(null, "Fecha: " + consulta.getFecha()
                    + "\nIngrese nueva fecha:", "Edite consulta", JOptionPane.QUESTION_MESSAGE));
            consulta.setHora(JOptionPane.showInputDialog(null, "Hora: " + consulta.getHora()
                      + "\nIngrese nueva hora:", "Edite consulta", JOptionPane.QUESTION_MESSAGE));   consulta.setIdPaciente(JOptionPane.showInputDialog(null, "Id del paciente: " + consulta.getIdPaciente()
                    + "\nIngrese nuevo Id del paciente:", "Edite consulta", JOptionPane.QUESTION_MESSAGE));
            consulta.setIdMédico(JOptionPane.showInputDialog(null, "Id del médico: " + consulta.getIdMédico()
                    + "\nIngrese nuevo Id del médico:", "Edite consulta", JOptionPane.QUESTION_MESSAGE));
            consulta.setMotivo(JOptionPane.showInputDialog(null, "Observaciones: " + consulta.getMotivo()
                    + "\nIngrese nuevas observaciones:", "Edite consulta", JOptionPane.QUESTION_MESSAGE));
            return true;
        }
    }

    // Eliminar consultas
    public boolean borrarConsulta() {
        String id = JOptionPane.showInputDialog(null, "Ingrese el ID de la consulta a borrar:",
                "Borrar consulta", JOptionPane.QUESTION_MESSAGE);

        Consultas consulta = null;
        for (int i = 0; i < consultas.size(); i++){
            if (consultas.get(i).getIdConsulta().equals(id))
                consulta = consultas.remove(i);
        }

        if (consultas == null) {
            JOptionPane.showMessageDialog(null, "No se encontro la consulta con el ID: " + id,
                    "Consulta no encontrada", JOptionPane.WARNING_MESSAGE);
            return false;
        }
        else {
            JOptionPane.showMessageDialog(null, "Se elimino la consulta con el ID: " + id,
                    "Consulta eliminada", JOptionPane.INFORMATION_MESSAGE);
            return false;
        }
    }
}
