package Proyecto;

import java.util.ArrayList;
import java.util.Scanner;

public class Pacientes {

    Scanner s = new Scanner(System.in);

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

    // Constructores
    public Pacientes() {
        ListaSint = new ArrayList<>();
    }

    //Metodos
    public void Llenar_Datos() {
        String res = "S";

        System.out.println("-------REGISTRO DE PACIENTE-------");
        System.out.println("Digite sun Nmro. de Cedula: ");
        this.NumCed = s.nextInt();
        //Limpieza de Buffer
        s.nextLine();
        System.out.println("Digite su apellido Paterno: ");
        this.Paterno = s.nextLine();
        System.out.println("Digite su apellido Materno: ");
        this.Materno = s.nextLine();
        System.out.println("Digite su Nombre: ");
        this.Nombre = s.nextLine();
        System.out.println("Digite su Genero (F,M): ");
        this.Genero = s.nextLine();
        System.out.println("Digite su Fceha de Nacimiento (dd/mm/aaaa): ");
        this.FechaNac = s.nextLine();
        //Ubicacion de Internacion.
        System.out.println("Digite el Hospital en el cual sera Internado: ");
        this.UbicIntern = s.nextLine();
        System.out.println("-----SINTOMAS-----");
        do {
            System.out.println("Digite Sintomas del paciente: ");
            ListaSint.add(s.nextLine());
            System.out.println("Desea añadir mas sintomas? (S/N)");
            res = s.nextLine();
        } while (res.equalsIgnoreCase("S"));
    }

    public void Mostrar_Datos() {
        System.out.println("--------------------------------------------");
        System.out.println("Numero de Cedula: " + this.NumCed);
        System.out.println("Paterno: " + this.Paterno);
        System.out.println("Materno: " + this.Materno);
        System.out.println("Nombre: " + this.Nombre);
        System.out.println("Genero: " + this.Genero);
        System.out.println("Fecha de Nacimiento: " + this.FechaNac);
        System.out.println("Hospital de Internacion: " + this.UbicIntern);
        System.out.println("--------------------------------------------");
        System.out.println("-----SINTOMAS-----");
        for (String sin : ListaSint) {
            System.out.println(" " + sin);
            System.out.println("--------------------------------------------");
        }
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
