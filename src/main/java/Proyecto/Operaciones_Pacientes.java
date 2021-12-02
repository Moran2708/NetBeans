package Proyecto;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Operaciones_Pacientes {

    Scanner s = new Scanner(System.in);
    List<Pacientes> ListaPaciente;

    public Operaciones_Pacientes() {
        ListaPaciente = new ArrayList<>();
    }

    //Registrar Paciente, Agregar los datos a los atributos corresp.
    //Agregar los sintomas
    //Guardar el objeto en la lista
    public void Registrar_Paciente() {
        Pacientes paciente = new Pacientes();
        paciente.Llenar_Datos();
        //Adicionando Paciente a la Lista
        ListaPaciente.add(paciente);
        System.out.println("Paciente Registrado");
        System.out.println("--------------------------------------------");
    }

    //Listando Pacientes
    public void Listado_De_Pacientes() {
        for (Pacientes paciente : ListaPaciente) {
            paciente.Mostrar_Datos();
        }
    }

    //Pacientes por Genero
    public void Paciente_Genero() {
        System.out.println("Digite el Genero para listar los pacientes: ");
        String genero = s.nextLine();
        for (Pacientes paciente : ListaPaciente) {
            if (paciente.getGenero().equalsIgnoreCase(genero)) {
                paciente.Mostrar_Datos();
            }
        }
    }

    //Buscar paciente
    public void Buscar_Pac(int NumCed) {
        int sw = 0;
        for (Pacientes pac : ListaPaciente) {
            if (pac.getNumCed() == NumCed) {
                sw = 1;
                pac.Mostrar_Datos();
            }
        }
        if (sw == 0) {
            System.out.println("El paciente no esta registrado");
        }
    }
}
