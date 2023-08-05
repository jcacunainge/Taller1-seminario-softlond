import java.util.Arrays;

public class ejercicio30 {

    //Eliminar duplicados: Diseña un programa que elimine los elementos
    //duplicados de un arreglo.
    public static void main(String[] args) {
        int[] arreglo = {5, 23, 8, 42, 15, 10, 27, 23, 10};
        
        int[] arregloSinDuplicados = eliminarDuplicados(arreglo);

        System.out.println("Arreglo original: " + Arrays.toString(arreglo));
        System.out.println("Arreglo sin duplicados: " + Arrays.toString(arregloSinDuplicados));
    }

    public static int[] eliminarDuplicados(int[] arreglo) {
        int longitudOriginal = arreglo.length;
        int[] arregloSinDuplicados = new int[longitudOriginal];
        int nuevoIndice = 0;

        for (int i = 0; i < longitudOriginal; i++) {
            boolean esDuplicado = false;

            for (int j = 0; j < nuevoIndice; j++) {
                if (arreglo[i] == arregloSinDuplicados[j]) {
                    esDuplicado = true;
                    break;
                }
            }

            if (!esDuplicado) {
                arregloSinDuplicados[nuevoIndice] = arreglo[i];
                nuevoIndice++;
            }
        }

        return Arrays.copyOf(arregloSinDuplicados, nuevoIndice);
    }
}

