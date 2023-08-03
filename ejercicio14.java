import javax.swing.JOptionPane;

public class ejercicio14  {
    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("Ingrese un número entero positivo:");
        int numero = Integer.parseInt(input);

        if (esNumeroPerfecto(numero)) {
            JOptionPane.showMessageDialog(null, numero + " es un número perfecto.");
        } else {
            JOptionPane.showMessageDialog(null, numero + " no es un número perfecto.");
        }
    }

    // Función para verificar si un número es perfecto
    public static boolean esNumeroPerfecto(int n) {
        if (n <= 1) {
            return false;
        }

        int sumaDivisores = 1; // Inicializamos con 1, ya que todos los números tienen 1 como divisor

        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                sumaDivisores += i;
                if (i != n / i) {
                    sumaDivisores += n / i;
                }
            }
        }

        return sumaDivisores == n;
    }
}

