package Proyecto;

import java.util.ArrayList;
import java.util.Scanner;

public class Hospital {

    Pacientes pac = new Pacientes();
    Scanner s = new Scanner(System.in);
    private String Hosp;
    ArrayList<String> ListaHospPac;

    public Hospital() {
        ListaHospPac = new ArrayList<>();
    }

    public void Llenar_Datos_Hosp() {
        String res = "S";
        System.out.println("Ingrese el Nombre del Hospital: ");
        this.Hosp = s.nextLine();
        do {
            System.out.println("-----------------------------------");
            pac.Llenar_Datos();
            System.out.println("Desea Ingresar otro paciente? (S/N)");
            res = s.nextLine();
        } while (res.equalsIgnoreCase("S"));
    }
    
    public void Mostrar_Datos(){
        pac.Mostrar_Datos();
    }

    public String getHosp() {
        return Hosp;
    }

    public ArrayList<String> getListaHospPac() {
        return ListaHospPac;
    }

    public void setHosp(String Hosp) {
        this.Hosp = Hosp;
    }

    public void setListaPacHosp(ArrayList<String> ListaHospPac) {
        this.ListaHospPac = ListaHospPac;
    }

}
