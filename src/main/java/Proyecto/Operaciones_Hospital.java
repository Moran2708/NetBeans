package Proyecto;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Operaciones_Hospital {

    Scanner s = new Scanner(System.in);
    List<Hospital> ListaHospPac;
    Hospital hosp = new Hospital();

    public Operaciones_Hospital() {
        ListaHospPac = new ArrayList<>();
    }

/*    public void Registrar_Datos() {
        Hospital hosp = new Hospital();
        hosp.Llenar_Datos_Hospital();
        //Adicionando Paciente a la Lista
        ListaHospPac.add(hosp);
        System.out.println("Datos Guardados.");
        System.out.println("-----------------------------------------------------");
    }

    public void Mostrar_Datos_Hosp() {
        for (Hospital hosp : ListaHospPac) {
            System.out.println(hosp.getNombreHosp());
            hosp.Mostrar_Datos_Hosp();
        }

    }*/

    public List<Hospital> getListaHospPac() {
        return ListaHospPac;
    }

    public void setListaHospPac(List<Hospital> ListaHospPac) {
        this.ListaHospPac = ListaHospPac;
    }

}
