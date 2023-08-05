public class ejercicio29 {
    public static void main(String[] args) {
        int[] arreglo = {5, 23, 8, 42, 15, 10, 27};
        int maximo = encontrarMaximo(arreglo);

        System.out.println("El número más grande en el arreglo es: " + maximo);
    }

    public static int encontrarMaximo(int[] arreglo) {
        int maximo = arreglo[0];

        for (int i = 1; i < arreglo.length; i++) {
            if (arreglo[i] > maximo) {
                maximo = arreglo[i];
            }
        }

        return maximo;
    }
}

