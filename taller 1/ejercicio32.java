import javax.swing.JOptionPane;

public class ejercicio32 {

    //Buscar un elemento: Escribe un programa que busque un número específico
    //en un arreglo y muestre su índice (o un mensaje si no se encuentra).
    public static void main(String[] args) {
        int[] arreglo = {5, 23, 8, 42, 15, 10, 27};
        int numeroBuscado = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número a buscar:"));

        int indice = buscarNumero(arreglo, numeroBuscado);

        if (indice != -1) {
            JOptionPane.showMessageDialog(null, "El número " + numeroBuscado + " se encuentra en el índice " + indice);
        } else {
            JOptionPane.showMessageDialog(null, "El número " + numeroBuscado + " no se encuentra en el arreglo.");
        }
    }

    public static int buscarNumero(int[] arreglo, int numeroBuscado) {
        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] == numeroBuscado) {
                return i; // Se encontró el número, se devuelve su índice
            }
        }
        return -1; // No se encontró el número en el arreglo
    }
}

