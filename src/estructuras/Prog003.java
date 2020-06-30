
package estructuras;

import java.util.Scanner;

public class Prog003 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String cadena;
        System.out.println("**** MANEJO DE CADENAS ****");
        System.out.print("Leer Cadena con nexLine(): ");
        cadena = teclado.nextLine();
        System.out.println("Valor inicial ingresado es: " + cadena);
        System.out.println("Mayuscula con toUpperCase()" + cadena.toUpperCase());
        System.out.println("Minuscula con toLoweCase()"+ cadena.toLowerCase());
        System.out.println("Eliminar espacios con trim: " +cadena.trim());
        System.out.println("Subcadena con Substring(int): " + cadena.substring(5,10));
        System.out.println("Tamaño de una cadena: " + cadena.length());
        System.out.println("Extraer letra: " + cadena.charAt(0));
        System.out.println("Extraer letra: " + cadena.charAt(1));
        System.out.println("Extraer letra: " + cadena.charAt(2));
        System.out.println("Extraer letra: " + cadena.charAt(3));
        System.out.println("Extraer letra: " + cadena.charAt(4));
        System.out.println("Extraer letra: " + cadena.charAt(5));
        System.out.println("Extraer letra: " + cadena.charAt(6));
        System.out.println("Ultima letra: " + cadena.charAt(cadena.length()-1));
    }
}
