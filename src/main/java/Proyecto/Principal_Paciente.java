package Proyecto;

import java.util.Scanner;

public class Principal_Paciente {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        boolean cont = true;
        int opc;
        //Instranciar objeto para llamar a los metodos
        Operaciones_Pacientes obj = new Operaciones_Pacientes();
        Operaciones_Medico med = new Operaciones_Medico();
        Operaciones_Hospital hosp = new Operaciones_Hospital();
        do {
            System.out.println("------------------MENÚ DE OPCIONES-------------------");
            System.out.println("1-Registrar Medico");
            System.out.println("2-Lista de Medicos");
            System.out.println("3-Buscar Medico");
            System.out.println("4-Registrar Paciente");
            System.out.println("5-Listar Pacientes");
            System.out.println("6-Listado de Pacientes por Genero");
            System.out.println("7-Buscar Paciente");
            System.out.println("8-Eliminar Paciente");
            System.out.println("9-Salir");
            opc = s.nextInt();
            s.nextLine();
            System.out.println("-----------------------------------------------------");
            switch (opc) {
                case 1:
                    med.Registrar_Medico();
                    break;

                case 2:
                    med.Listado_De_Medicos();
                    break;

                case 3:
                    System.out.println("Digite el Nro. de Id del Medico: ");
                    int Id = s.nextInt();
                    med.Buscar_Med(Id);
                    break;
                case 4:
                    obj.Registrar_Paciente();
                    break;

                case 5:
                    obj.Listado_De_Pacientes();
                    break;

                case 6:
                    obj.Paciente_Genero();
                    break;

                case 7:
                    System.out.println("Digite el numero de cedula del paciente: ");
                    int nc = s.nextInt();
                    obj.Buscar_Pac(nc);
                    break;

                case 8:
                    System.out.println("Paciente a Eliminar: ");
                    int pac = s.nextInt();
                    obj.Eliminar_Paciente(pac);
                    break;

                default:
                    cont = false;
                    break;
            }
        } while (cont);
    }
}
