package com.company;
import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {
        EditPacientes pacientes = new EditPacientes();
        EditMedico medicos = new EditMedico();
        EditConsultas consultas = new EditConsultas();
        int Menu;
        int EleccionMedico;
        int EleccionPaciente;
        int EleccionConsulta;

        while (true) {

            Menu = Integer.parseInt(JOptionPane.showInputDialog(null,
                    "1: Médico\n" +
                             "2: Paciente\n" +
                             "3: Cita\n" +
                             "0: Salir\n" ,
                    "Menu Principal", JOptionPane.QUESTION_MESSAGE));

            switch (Menu) {
                case 0:
                    System.out.println("Saliendo del programa");
                    System.exit(0);
                    break;

                case 1:
                    //Menu de selección Medico
                    EleccionMedico = Integer.parseInt(JOptionPane.showInputDialog(null,

                            "1: Nuevo médico\n" +
                                     "2: Modificar médico\n" +
                                     "3: Mostrar médico\n" +
                                     "4: Borrar médico\n"+
                                     "0: Salir\n",
                            "Menu médico", JOptionPane.QUESTION_MESSAGE));

                    //Situaciones de elección menu medico
                    switch (EleccionMedico) {
                        case 0:
                            System.out.println("Saliendo del programa");
                            break;
                        case 1:
                            medicos.nuevoMedico();
                            break;
                        case 2:
                            medicos.modificarMedico();
                            break;
                        case 3:
                            medicos.mostrarMedico();
                            break;
                        case 4:
                            medicos.borrarMedico();
                            break;
                        default:
                            System.out.println("Opción no válida");
                            break;
                    }
                    break;
                case 2:
                    //Menu de selección Paciente
                    EleccionPaciente = Integer.parseInt(JOptionPane.showInputDialog(null,

                            "1: Nuevo Paciente\n" +
                                     "2: Modificar Paciente\n" +
                                     "3: Mostrar Paciente\n" +
                                     "4: Borrar medico\n" +
                                     "0: Salir\n",
                            "Menu paciente", JOptionPane.QUESTION_MESSAGE));

                    //Situaciones de elección menu Paciente
                    switch (EleccionPaciente) {
                        case 0:
                            System.out.println("Saliendo del programa");
                            break;
                        case 1:
                            pacientes.nuevoPaciente();
                            break;
                        case 2:
                            pacientes.modificarPaciente();
                            break;
                        case 3:
                            pacientes.mostrarPacientes();
                            break;
                        case 4:
                            pacientes.borrarPaciente();
                            break;
                        default:
                            System.out.println("Opción no válida");
                            break;
                    }
                case 3:
                    //Menu de selección Consulta
                    EleccionConsulta = Integer.parseInt(JOptionPane.showInputDialog(null,

                            "1: Nueva Consulta\n" +
                                     "2: Modificar Consulta\n" +
                                     "3: Mostrar Consulta\n" +
                                     "4: Borrar Consulta\n" +
                                     "0: Salir\n",
                            "Menu Consultas", JOptionPane.QUESTION_MESSAGE));

                    //Situaciones de elección menu consulta
                    switch (EleccionConsulta) {
                        case 0:
                            System.out.println("Saliendo del programa");
                            break;
                        case 1:
                            consultas.NuevaConsulta();
                            break;
                        case 2:
                            consultas.modificarConsulta();
                            break;
                        case 3:
                            consultas.mostrarConsultas();
                            break;
                        case 4:
                            consultas.borrarConsulta();
                            break;
                        default:
                            System.out.println("Opción no válida");
                            break;
                    }
                default:
                    System.out.println("Seleccione una opción");
                    break;
            }
        }
    }
}
