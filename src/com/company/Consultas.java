package com.company;
import javax.swing.JOptionPane;

public class Consultas {

    private String idConsulta;
    private String fecha;
    private String hora;
    private String idPaciente;
    private String idMédico;
    private String motivo;

    public Consultas(String idConsulta, String fecha, String hora, String idPaciente, String idMédico, String motivo) {
        this.idConsulta = idConsulta;
        this.fecha = fecha;
        this.hora = hora;
        this.idPaciente = idPaciente;
        this.idMédico = idMédico;
        this.motivo = motivo;
    }

    public String getIdConsulta() {
        return idConsulta;
    }

    public void setIdConsulta(String idConsulta) {
        this.idConsulta = idConsulta;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getIdPaciente() {
        return idPaciente;
    }

    public void setIdPaciente(String idPacientes) {
        this.idPaciente = idPacientes;
    }

    public String getIdMédico() {
        return idMédico;
    }

    public void setIdMédico(String idMédico) {
        this.idMédico = idMédico;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    //Mostrar información de la consulta
    public void mostrar() {
        String mensaje = "ID Consulta: " + idConsulta + "\nFecha: " + fecha
                + "\nId paciente: " + idPaciente + "\nId médico: " + idMédico + "\nMotivo: " + motivo;
        JOptionPane.showMessageDialog(null, mensaje, "Mostrar Consulta", JOptionPane.INFORMATION_MESSAGE);
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
