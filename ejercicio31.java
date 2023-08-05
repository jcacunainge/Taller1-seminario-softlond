import java.util.Arrays;

public class ejercicio31 {
    //Ordenar elementos: Implementa un algoritmo de ordenamiento (por ejemplo,
    //el algoritmo de burbuja o el de selección) para ordenar un arreglo de enteros
    //de manera ascendente.


    public static void main(String[] args) {
        int[] arreglo = {5, 23, 8, 42, 15, 10, 27};
        
        ordenarBurbuja(arreglo);

        System.out.println("Arreglo ordenado: " + Arrays.toString(arreglo));
    }

    public static void ordenarBurbuja(int[] arreglo) {
        int longitud = arreglo.length;
        
        for (int i = 0; i < longitud - 1; i++) {
            for (int j = 0; j < longitud - i - 1; j++) {
                if (arreglo[j] > arreglo[j + 1]) {
                    // Intercambiar elementos
                    int temp = arreglo[j];
                    arreglo[j] = arreglo[j + 1];
                    arreglo[j + 1] = temp;
                }
            }
        }
    }
}

