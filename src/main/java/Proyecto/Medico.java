package Proyecto;

import java.util.ArrayList;

public class Medico {

    Leer Leer = new Leer();
    //Atributos
    private int Id;
    private String Nombre;
    private String Apellido;
    private String Espec;

    ArrayList<String> ListaHosp;
    Hospital hosp = new Hospital();

    public void Medico() {
        ListaHosp = new ArrayList<>();
    }

    public void Registrar_Medico() {
        System.out.println("---------------REGISTRAR NUEVO MEDICO---------------");
        System.out.println("Digite sun Nmro. de Id:  ");
        this.Id = Leer.pedirInt();
        System.out.println("Digite Apellido: ");
        this.Apellido = Leer.datoString();
        System.out.println("Digite Nombre:  ");
        this.Nombre = Leer.datoString();
        //Ubicacion de Internacion.
        System.out.println("Especialidad: ");
        this.Espec = Leer.datoString();
        hosp.Llenar_Datos_Hospital_PMed();
    }

    public void Mostrar_Medicos() {
        System.out.println("Id de Medico: " + this.Id);
        System.out.println("Apellido: " + this.Apellido);
        System.out.println("Nombre: " + this.Nombre);
        System.out.println("Especialidad: " + this.Espec);
        hosp.Mostrar_Datos_Hosp_PMed();
        System.out.println("-----------------------------------------------------");
    }

    public int getId() {
        return Id;
    }

    public String getNombre() {
        return Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public String getEspec() {
        return Espec;
    }

    public ArrayList<String> getListaHosp() {
        return ListaHosp;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public void setEspec(String Espec) {
        this.Espec = Espec;
    }

    public void setListaMed(ArrayList<String> ListaMed) {
        this.ListaHosp = ListaMed;
    }

}
