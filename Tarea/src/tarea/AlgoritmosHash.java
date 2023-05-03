package tarea;

/**
 *
 * @author migue
 */
import java.util.*;

public class AlgoritmosHash {

    public static void main(String[] args) {
        // Crear un HashMap de cadenas y enteros
        Map<String, Integer> map = new HashMap<>();

        // Agregar valores al HashMap
        map.put("Juan", 25);
        map.put("María", 30);
        map.put("Pedro", 35);

        // Recorrer el HashMap y mostrar los valores
        for (String key : map.keySet()) {
            System.out.println(key + " - " + map.get(key));
        }

        // Buscar un valor en el HashMap
        if (map.containsKey("Juan")) {
            System.out.println("La edad de Juan es " + map.get("Juan"));
        }
    }

}
