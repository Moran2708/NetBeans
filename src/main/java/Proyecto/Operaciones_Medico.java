package Proyecto;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Operaciones_Medico {

    Scanner s = new Scanner(System.in);
    List<Medico> ListaMed;

    public Operaciones_Medico() {
        ListaMed = new ArrayList<>();
    }

    public void Registrar_Medico() {
        Medico med = new Medico();
        med.Registrar_Medico();
        //Adicionando Paciente a la Lista
        ListaMed.add(med);
        System.out.println("Medico Registrado.");
        System.out.println("--------------------------------------------");
    }

    public void Listado_De_Medicos() {
        for (Medico med : ListaMed) {
            med.Mostrar_Medicos();
        }
    }

    public void Buscar_Med(int Id) {
        int sw = 0;
        for (Medico med : ListaMed) {
            if (med.getId() == Id) {
                sw = 1;
                med.Mostrar_Medicos();
            }
        }
        if (sw == 0) {
            System.out.println("Ningun Medico con Nro de ID: " + Id);
        }
    }

//    public void Eliminar_Med(int Elim) {
//        int sw = 0;
//        for (Medico med : ListaMed) {
//            if (med.getId() == Elim) {
//                sw = 1;
//                med.ListaMed.remove(Elim);
//            }
//        }
//        if (sw == 0) {
//            System.out.println("Ningun Medico con Nro de ID: " + Elim);
//        }
//        for (Medico med : ListaMed) {
//            med.Mostrar_Medicos();
//        }
//    }
}
