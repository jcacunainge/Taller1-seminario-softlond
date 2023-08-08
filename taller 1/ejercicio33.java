import java.util.HashMap;
import java.util.Map;

public class ejercicio33 {
    //Frecuencia de elementos: Escribe un programa que cuente la frecuencia de
    //cada elemento en un arreglo.

    public static void main(String[] args) {
        int[] arreglo = {5, 23, 8, 42, 15, 10, 27, 5, 8, 15, 27, 27};

        Map<Integer, Integer> frecuencia = contarFrecuencia(arreglo);

        for (Map.Entry<Integer, Integer> entry : frecuencia.entrySet()) {
            System.out.println("El elemento " + entry.getKey() + " aparece " + entry.getValue() + " veces.");
        }
    }

    public static Map<Integer, Integer> contarFrecuencia(int[] arreglo) {
        Map<Integer, Integer> frecuencia = new HashMap<>();

        for (int elemento : arreglo) {
            frecuencia.put(elemento, frecuencia.getOrDefault(elemento, 0) + 1);
        }

        return frecuencia;
    }
}

