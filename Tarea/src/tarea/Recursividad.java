package tarea;

import java.util.Scanner;

/**
 *
 * @author migue
 */
public class Recursividad {
    
    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }
    
    public static void main(String[] args) {
       Scanner s = new Scanner(System.in);
        System.out.print("Ingrese un numero para calcular su factorial: ");
        int n = s.nextInt();
        int resultado = factorial(n);
        System.out.println("El factorial de " + n + " es:\n " + resultado);
    }

}
