
package estructuras;

import java.util.Scanner;

public class Prog006 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero,s=0;
        System.out.println("Numero: ");
        numero = Integer.valueOf(teclado.nextLine());
        for(int i=1;i<=numero;i++){
            s = s + i;
        }
        System.out.println("Sumatoria = " + s);
        teclado.close();
    }
}
