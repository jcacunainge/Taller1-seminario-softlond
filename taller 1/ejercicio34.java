import java.util.Arrays;

public class ejercicio34 {
    //Rotación de elementos: Implementa un programa que rote los elementos de
    //un arreglo hacia la izquierda o la derecha una cierta cantidad de posiciones.

    public static void main(String[] args) {
        int[] arreglo = {1, 2, 3, 4, 5, 6, 7};
        int cantidadRotacion = 2; // Cambia la cantidad de rotación según tu preferencia
        boolean haciaIzquierda = true; // Cambia a false si deseas rotar hacia la derecha

        int[] arregloRotado = rotarArreglo(arreglo, cantidadRotacion, haciaIzquierda);

        System.out.println("Arreglo original: " + Arrays.toString(arreglo));
        System.out.println("Arreglo rotado: " + Arrays.toString(arregloRotado));
    }

    public static int[] rotarArreglo(int[] arreglo, int cantidadRotacion, boolean haciaIzquierda) {
        int longitud = arreglo.length;
        int[] arregloRotado = new int[longitud];

        for (int i = 0; i < longitud; i++) {
            int nuevaPosicion = haciaIzquierda ? (i - cantidadRotacion + longitud) % longitud : (i + cantidadRotacion) % longitud;
            arregloRotado[nuevaPosicion] = arreglo[i];
        }

        return arregloRotado;
    }
}

