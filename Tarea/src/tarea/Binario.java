package tarea;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author migue
 */
public class Binario {
    
     public static void main(String[] args) {
         
        Scanner s = new Scanner(System.in);
        System.out.print("Ingrese los numeros separados por comas: ");
        String input = s.nextLine();
        String[] inputArray = input.split(",");
        Integer[] datos = new Integer[inputArray.length];
        for (int i = 0; i < inputArray.length; i++) {
            datos[i] = Integer.parseInt(inputArray[i].trim());
        }
        
        System.out.println("Array: " + Arrays.toString(datos));
        
        //Búsqueda de la posición por búsqueda binaria
        Arrays.sort(datos); // Ordenamiento de datos
        System.out.println("Array ordenado: " + Arrays.toString(datos));
        
         System.out.println("Ingresa el primer numero quieres buscar?");
         int numero = s.nextInt();
         
        Integer index = Busqueda.Binario(datos, numero); 
        System.out.println("Buscando " + numero + "..."); 
        //Mostrar resultado
        if (index != null) {
            System.out.println("Elemento encontrado en la posicion " + index);
        } else {
            System.out.println("Elemento no encontrado");
        }
        
        System.out.println("Ingresa el segundo numero quieres buscar?");
         int numero2 = s.nextInt();
        index = Busqueda.Binario(datos, numero2);
        System.out.println("Buscando " + numero2 + "...");
        //Mostrar resultado
        if (index != null) {
            System.out.println("Elemento encontrado en la posicion " + index);
        } else {
            System.out.println("Elemento no encontrado");
        }
    }
    
}
