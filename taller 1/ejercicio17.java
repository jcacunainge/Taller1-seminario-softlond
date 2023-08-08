import javax.swing.JOptionPane;

public class ejercicio17 {
    //Pide al usuario dos números enteros y muestra todos los números primos
    //que se encuentran en ese rango.

    public static void main(String[] args) {
        String input1 = JOptionPane.showInputDialog("Ingrese el primer número entero:");
        int numero1 = Integer.parseInt(input1);

        String input2 = JOptionPane.showInputDialog("Ingrese el segundo número entero:");
        int numero2 = Integer.parseInt(input2);

        System.out.println("Números primos entre " + numero1 + " y " + numero2 + ":");

        for (int i = numero1; i <= numero2; i++) {
            if (esPrimo(i)) {
                System.out.print(i + " ");
            }
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

        for (int i = 5; i * i <= n; i += 6) {
            if (n % i == 0 || n % (i + 2) == 0) {
                return false;
            }
        }
        return true;
    }
}

