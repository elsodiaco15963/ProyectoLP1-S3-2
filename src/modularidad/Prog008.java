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
    public static void factorial(int numero) {
        int fac=1;
        for(int i=1;i<=numero;i++) {
            fac*=i;
        }
        System.out.println("factorial de "+numero+" es: "+fac);
    }
    public static void main(String[] args) {
       saludo("Daniel");
       saludo2("Juan","Ing.Sistemas");
       factorial(5);
    }
}
