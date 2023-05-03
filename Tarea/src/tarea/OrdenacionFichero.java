package tarea;

/*
 *
 * @author migue
 */
import java.io.*;
import java.util.*;

public class OrdenacionFichero {

    public static void main(String[] args) throws IOException {
        String inputFile = "C:\\Users\\migue\\Desktop\\input.txt";
        String outputFile = "C:\\Users\\migue\\Desktop\\output.txt";

        // Leer los datos del archivo de entrada y almacenarlos en una lista
        List<Integer> list = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new FileReader(inputFile));
        String line;
        while ((line = reader.readLine()) != null) {
            list.add(Integer.parseInt(line));
        }
        reader.close();

        // Ordenar la lista utilizando el algoritmo de ordenación por burbuja
        int n = list.size();
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (list.get(j) > list.get(j + 1)) {
                    int temp = list.get(j);
                    list.set(j, list.get(j + 1));
                    list.set(j + 1, temp);
                }
            }
        }

        // Escribir los datos ordenados en el archivo de salida
        BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile));
        for (int i = 0; i < n; i++) {
            writer.write(Integer.toString(list.get(i)));
            writer.newLine();
        }
        writer.close();
    }
}
