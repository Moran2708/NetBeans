package Proyecto;

public class Principal_Paciente {

    public static void main(String[] args) {

        Leer Leer = new Leer();

        boolean cont = true;
        int opc;
        //Instranciar objeto para llamar a los metodos
        Operaciones_Pacientes obj = new Operaciones_Pacientes();
        Operaciones_Medico med = new Operaciones_Medico();
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
            opc = Leer.pedirInt();
            System.out.println("-----------------------------------------------------");
            switch (opc) {
                case 1:
                    med.Registrar_Medico();
                    break;

                case 2:
                    med.Listado_De_Medicos();
                    break;

                case 3:
                    if (med.ListaMed.size() < 1) {
                        System.out.println("Ningun Medico Registrado.");
                    } else {
                        System.out.println("Digite el Nro. de Id del Medico: ");
                        int Id = Leer.pedirInt();
                        med.Buscar_Med(Id);
                    }

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
                    if (obj.ListaPaciente.size() < 1) {
                        System.out.println("Ningun Paciente Registrado.");
                    } else {
                        System.out.println("Digite el numero de cedula del paciente: ");
                        int nc = Leer.pedirInt();
                        obj.Buscar_Pac(nc);
                    }
                    break;

                case 8:
                    if (obj.ListaPaciente.size() < 1) {
                        System.out.println("Ningun Paciente Registrado.");
                    } else {
                        System.out.println("Nro. de Paciente a Eliminar: ");
                        int pac = Leer.pedirInt();
                        obj.Eliminar_Paciente(pac);
                    }
                    break;

                default:
                    cont = false;
                    break;
            }
        } while (cont);
    }
}
