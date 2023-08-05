import javax.swing.JOptionPane;

public class ejercicio28 {

    // Suma de elementos: Escribe un programa que calcule la suma de todos los
    // 88elementos en un arreglo de enteros.
    public static void main(String[] args) {
        int[] arreglo = ingresarArreglo();
        int suma = calcularSuma(arreglo);

        JOptionPane.showMessageDialog(null, "La suma de los elementos es: " + suma);
    }

    public static int[] ingresarArreglo() {
        int longitud = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la longitud del arreglo:"));
        int[] arreglo = new int[longitud];

        for (int i = 0; i < longitud; i++) {
            arreglo[i] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el elemento en la posición " + i + ":"));
        }

        return arreglo;
    }

    public static int calcularSuma(int[] arreglo) {
        int suma = 0;

        for (int elemento : arreglo) {
            suma += elemento;
        }

        return suma;
    }
}

