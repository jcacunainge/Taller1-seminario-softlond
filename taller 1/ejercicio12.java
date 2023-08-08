import javax.swing.JOptionPane;

public class ejercicio12 {
    public static void main(String[] arg){
        //Realiza un programa que pida al usuario un número entero y determine si es
        //un número primo o no

        String input = JOptionPane.showInputDialog("Ingrese un número entero:");
        int numero = Integer.parseInt(input);

        if (esPrimo(numero)) {
            JOptionPane.showMessageDialog(null, numero + " es un número primo.");
        } else {
            JOptionPane.showMessageDialog(null, numero + " no es un número primo.");
        }
    }

    // Función para verificar si un número es primo
    public static boolean esPrimo(int n) {
        if (n <= 1) {
            return false;
        }
        if (n <= 3) {
            return true;
        }
        if (n % 2 == 0 || n % 3 == 0) {
            return false;
        }

        // Comprobar divisibilidad por números mayores que 3 hasta la raíz cuadrada de n
        for (int i = 5; i * i <= n; i += 6) {
            if (n % i == 0 || n % (i + 2) == 0) {
                return false;
            }
        }
        return true;
    }

}
    

