import javax.swing.JOptionPane;

public class ejercicio15 {
    public static void main(String[] args) {

        //Crea un programa que pida al usuario un número entero y determine si es un
        // número capicúa. Un número capicúa es aquel que se lee igual de izquierda a
        // derecha que de derecha a izquierda.
        
        String input = JOptionPane.showInputDialog("Ingrese un número entero:");
        int numero = Integer.parseInt(input);

        if (esNumeroCapicua(numero)) {
            JOptionPane.showMessageDialog(null, numero + " es un número capicúa.");
        } else {
            JOptionPane.showMessageDialog(null, numero + " no es un número capicúa.");
        }
    }

    // Función para verificar si un número es capicúa
    public static boolean esNumeroCapicua(int n) {
        int numeroOriginal = n;
        int numeroInvertido = 0;

        while (n > 0) {
            int digito = n % 10;
            numeroInvertido = numeroInvertido * 10 + digito;
            n /= 10;
        }

        return numeroInvertido == numeroOriginal;
    }
}

