package Proyecto;

import java.util.ArrayList;

public class Pacientes {

    Leer Leer = new Leer();

    //Atributos
    private int NumCed;
    private String Paterno;
    private String Materno;
    private String Nombre;
    private String Genero;
    private String FechaNac;

    // No es propio de la clase paciente
    private String UbicIntern;
    ArrayList<String> ListaSint;

    Hospital hosp = new Hospital();

    // Constructores
    public Pacientes() {
        ListaSint = new ArrayList<>();
    }

    //Metodos
    public void Llenar_Datos() {
        String res = "S";
        System.out.println("----------------REGISTRO DE PACIENTE-----------------");
        System.out.println("Digite sun Nmro. de Cedula: ");
        this.NumCed = Leer.pedirInt();
        System.out.println("Digite su apellido Paterno: ");
        this.Paterno = Leer.datoString();
        System.out.println("Digite su apellido Materno: ");
        this.Materno = Leer.datoString();
        System.out.println("Digite su Nombre: ");
        this.Nombre = Leer.datoString();
        System.out.println("Digite su Genero (F,M): ");
        this.Genero = Leer.datoString();
        System.out.println("Digite su Fceha de Nacimiento (dd/mm/aaaa): ");
        this.FechaNac = Leer.datoString();
        System.out.println("----------------------SINTOMAS-----------------------");
        do {
            System.out.println("Digite Sintomas del paciente: ");
            ListaSint.add(Leer.datoString());
            System.out.println("Desea añadir mas sintomas? (S/N)");
            res = Leer.datoString();
        } while (res.equalsIgnoreCase("S"));
        System.out.println("-----------------------------------------------------");
        hosp.Llenar_Datos_Hospital();
    }

    public void Mostrar_Datos() {
        int i = 1;

        System.out.println("-----------------------------------------------------");
        System.out.println("Numero de Cedula: " + this.NumCed);
        System.out.println("Paterno: " + this.Paterno);
        System.out.println("Materno: " + this.Materno);
        System.out.println("Nombre: " + this.Nombre);
        System.out.println("Genero: " + this.Genero);
        System.out.println("Fecha de Nacimiento: " + this.FechaNac);
        System.out.println("Hospital de Internacion: " + this.UbicIntern);
        System.out.println("----------------------SINTOMAS-----------------------");
        for (String sin : ListaSint) {
            System.out.println((i++) + "- " + sin);
        }
        hosp.Mostrar_Datos_Hosp();
        System.out.println("--------------------------------------------");
    }

    //Getters y Setters
    public int getNumCed() {
        return NumCed;
    }

    public String getPaterno() {
        return Paterno;
    }

    public String getMaterno() {
        return Materno;
    }

    public String getNombre() {
        return Nombre;
    }

    public String getGenero() {
        return Genero;
    }

    public String getFechaNac() {
        return FechaNac;
    }

    public String getUbicIntern() {
        return UbicIntern;
    }
}
