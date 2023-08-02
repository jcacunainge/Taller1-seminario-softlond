import javax.swing.JOptionPane;

public class ejercicio9 {
    public static void main(String[] arg) {

        // Escribe un programa que solicite al usuario un número entero positivo y
        // calcule su factorial.

        String input = JOptionPane.showInputDialog("Ingrese un numero entero");
        int numero = Integer.parseInt(input);

        int resultado = 1;

        for (int i = 1; i <= numero; i++) {
            resultado *= i; // Multiplica el resultado por el valor del contador (i)
        }

        JOptionPane.showMessageDialog(null, "El factorial de " + numero + " es: " + resultado);
    }
}
