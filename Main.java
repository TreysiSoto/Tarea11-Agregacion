package Movil;

public class Main {
    public static void main(String args[]) {

        System.out.println();

        Funda funda = new Funda("rojo");
        Audifonos audifonos = new Audifonos("Samsung", "negro");
        Chip chip = new Chip("Entel", 921987737);
        Celular celular = new Celular("Samsung", 521322116, "A21-34AG435");

        System.out.println("***Celular***");
        System.out.println("Marca del celular: " + celular.getMarca());
        System.out.println("Numero del IMEI: " + celular.getNumImei());
        System.out.println("Modelo del celular: " + celular.getModelo());
        System.out.println();
        System.out.println("**Chip**");
        System.out.println("Operador del chip: " + chip.getOperador());
        System.out.println("Numero de chip: " + chip.getNumero());
        System.out.println();
        System.out.println("***Audifonos***");
        System.out.println("Marca de los audifonos: " + audifonos.getMarca());
        System.out.println("Color de los audifonos: " + audifonos.getColor());
        System.out.println();
        System.out.println("***Funda***");
        System.out.println("Color de funda: " + funda.getColor());
        System.out.println();
    }

}
