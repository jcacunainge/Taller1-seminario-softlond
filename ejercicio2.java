import javax.swing.JOptionPane;

public class ejercicio2 {

    // Escribe un programa que pida al usuario un número entero y determine si es
    // par o impar.

    public static void main(String[] args) {
        String input1 = JOptionPane.showInputDialog("Ingrese un numero entero");
        int numero = Integer.parseInt(input1);

        if (numero % 2 == 0) {
            JOptionPane.showMessageDialog(null, "El número " + numero + " es par.");
        } else {
            JOptionPane.showMessageDialog(null, "El número " + numero + " es impar.");
        }
    }
}

