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
        System.out.println("-----------------------------------------------------");
    }

    public void Listado_De_Medicos() {
        if (ListaMed.size() < 1) {
            System.out.println("No hay Medicos Registrados...");
        } else {
            for (Medico med : ListaMed) {
                med.Mostrar_Medicos();
            }
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
}
