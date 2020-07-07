package modularidad;

import java.util.Scanner;

public class Prog008 {
    public static void saludo(String nombre) {
        System.out.println("Bienvenido "+nombre);
        System.out.println("Disfruta tu estadia en este lugar");
    }
    public static void saludo2(String nombre, String carrera) {
        System.out.println("Bienvenido "+nombre);
        System.out.println("Disfruta tu estadia en la carrera de "+carrera);
    }
    public static void main(String[] args) {
       saludo("Daniel");
       saludo2("Juan","Ing.Sistemas");
    }
}
