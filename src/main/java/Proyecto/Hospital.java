package Proyecto;

import java.util.Scanner;

public class Hospital {

    Scanner s = new Scanner(System.in);

    //Atributos
    private String nombreHosp;
    private String nombrePiso;
    private int numPiso;
    private String nombreEdif;
    private int numSala;

    //Metodos
    public void Llenar_Datos_Hospital() {
        System.out.println("------------------REGISTRO HOSPITAL------------------");
        System.out.println("Digite el nombre del hospital");
        this.nombreHosp = s.nextLine();
        System.out.println("Digite el nombre del piso donde esta siendo atendido");
        this.nombrePiso = s.nextLine();
        System.out.println("Digite el nro. del piso donde esta siendo atendido");
        this.numPiso = s.nextInt();
        s.nextLine();
        System.out.println("Digite el nombre del edificio");
        this.nombreEdif = s.nextLine();
        System.out.println("Digite el numero de la Sala");
        this.numSala = s.nextInt();
    }

    public void Llenar_Datos_Hospital_PMed() {
        System.out.println("------------------REGISTRO HOSPITAL------------------");
        System.out.println("Nombre del hospital");
        this.nombreHosp = s.nextLine();
        System.out.println("Nombre de Piso: ");
        this.nombrePiso = s.nextLine();
        System.out.println("Piso :");
        this.numPiso = s.nextInt();
        s.nextLine();
        System.out.println("Nombre del edificio");
        this.nombreEdif = s.nextLine();
        System.out.println("Numero de la Sala");
        this.numSala = s.nextInt();
    }

    public void Mostrar_Datos_Hosp() {
        System.out.println("Nombre del hospital: " + this.nombreHosp);
        System.out.println("Nombre del piso donde fue atendido:" + this.nombrePiso);
        System.out.println("Numero del pisp donde fue atendido: " + this.numPiso);
        System.out.println("Nombre del edificio: " + this.nombreEdif);
        System.out.println("Numero de la Sala: " + this.numSala);
    }
    
    public void Mostrar_Datos_Hosp_PMed() {
        System.out.println("Hospital: " + this.nombreHosp);
        System.out.println("Nombre del Piso:" + this.nombrePiso);
        System.out.println("Piso: " + this.numPiso);
        System.out.println("Edificio: " + this.nombreEdif);
        System.out.println("Sala: " + this.numSala);
    }

    //getters y setters
    public String getNombreHosp() {
        return nombreHosp;
    }

    public void setNombreHosp(String nombreHosp) {
        this.nombreHosp = nombreHosp;
    }

    public String getNombrePiso() {
        return nombrePiso;
    }

    public void setNombrePiso(String nombrePiso) {
        this.nombrePiso = nombrePiso;
    }

    public int getNumPiso() {
        return numPiso;
    }

    public void setNumPiso(int numPiso) {
        this.numPiso = numPiso;
    }

    public String getNombreEdif() {
        return nombreEdif;
    }

    public void setNombreEdif(String nombreEdif) {
        this.nombreEdif = nombreEdif;
    }

    public int getNumSala() {
        return numSala;
    }

    public void setNumSala(int numSala) {
        this.numSala = numSala;
    }

}
