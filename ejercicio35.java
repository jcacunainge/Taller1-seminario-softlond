public class ejercicio35 {
    //Tabla de multiplicar: Crea un programa que imprima las tablas de multiplicar
    //del 1 al 10. Usa para esto una matriz

    public static void main(String[] args) {
        int[][] tablas = new int[10][10];

        // Llenar la matriz con las tablas de multiplicar
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                tablas[i][j] = (i + 1) * (j + 1);
            }
        }

        // Imprimir las tablas de multiplicar
        for (int i = 0; i < 10; i++) {
            System.out.println("Tabla de multiplicar del " + (i + 1) + ":");
            for (int j = 0; j < 10; j++) {
                System.out.println((i + 1) + " x " + (j + 1) + " = " + tablas[i][j]);
            }
            System.out.println();
        }
    }
}

