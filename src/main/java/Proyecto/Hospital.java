package Proyecto;

public class Hospital {

    Leer Leer = new Leer();

    //Atributos
    private String nombreHosp;
    private String nombreArea;
    private int numPiso;
    private String nombreEdif;
    private int numSala;

    //Metodos
    public void Llenar_Datos_Hospital() {
        System.out.println("------------------REGISTRO HOSPITAL------------------");
        System.out.println("Digite el nombre del hospital");
        this.nombreHosp = Leer.datoString();
        System.out.println("Area donde esta siendo atendido");
        this.nombreArea = Leer.datoString();
        System.out.println("Digite el nro. del piso donde esta siendo atendido");
        this.numPiso = Leer.pedirInt();
        System.out.println("Digite el nombre del edificio");
        this.nombreEdif = Leer.datoString();
        System.out.println("Digite el numero de la Sala");
        this.numSala = Leer.pedirInt();
    }

    public void Llenar_Datos_Hospital_PMed() {
        System.out.println("------------------REGISTRO HOSPITAL------------------");
        System.out.println("Nombre del hospital");
        this.nombreHosp = Leer.datoString();
        System.out.println("Area : ");
        this.nombreArea = Leer.datoString();
        System.out.println("Piso :");
        this.numPiso = Leer.pedirInt();

        System.out.println("Nombre del edificio");
        this.nombreEdif = Leer.datoString();
        System.out.println("Numero de la Sala");
        this.numSala = Leer.pedirInt();
    }

    public void Mostrar_Datos_Hosp() {
        System.out.println("Nombre del Hospital: " + this.nombreHosp);
        System.out.println("Area donde fue atendido:" + this.nombreArea);
        System.out.println("Numero del Piso donde fue atendido: " + this.numPiso);
        System.out.println("Nombre del Edificio: " + this.nombreEdif);
        System.out.println("Numero de la Sala: " + this.numSala);
    }

    public void Mostrar_Datos_Hosp_PMed() {
        System.out.println("Hospital: " + this.nombreHosp);
        System.out.println("Nombre del Area:" + this.nombreArea);
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

    public String getNombreArea() {
        return nombreArea;
    }

    public void setNombreArea(String nombreArea) {
        this.nombreArea = nombreArea;
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
