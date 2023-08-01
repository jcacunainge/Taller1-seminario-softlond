import javax.swing.JOptionPane;

public class ejercicio1 {
    public static void main(String[] args) {
        // Realiza un programa que solicite al usuario dos números enteros y muestre
        // su suma, resta, multiplicación y división.

        String input1 = JOptionPane.showInputDialog("Ingrese un numero entero");
        int numero1 = Integer.parseInt(input1);

        String input2 = JOptionPane.showInputDialog("Ingrese un numero entero");
        int numero2 = Integer.parseInt(input2);

        int suma = numero1 + numero2;
        int resta = numero1 - numero2;
        int multiplicacion = numero1 * numero2;

        // Verificar si el divisor (numero2) es distinto de cero para evitar división por cero.
        double division = (numero2 != 0) ? (double) numero1 / numero2 : Double.POSITIVE_INFINITY;

        JOptionPane.showMessageDialog(null, "La suma de los números es: " + suma);
        JOptionPane.showMessageDialog(null, "La resta de los números es: " + resta);
        JOptionPane.showMessageDialog(null, "La multiplicación de los números es: " + multiplicacion);
        JOptionPane.showMessageDialog(null, "La división de los números es: " + division);
    }
}