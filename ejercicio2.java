import javax.swing.JOptionPane;

public class ejercicio2 {

    // Escribe un programa que pida al usuario un número entero y determine si es
    // par o impar.

    public static void main(String[] args) {
        String input1 = JOptionPane.showInputDialog("Ingrese un numero entero");
        int numero1 = Integer.parseInt(input1);

        if (numero1 % 2 == 0) {
            JOptionPane.showMessageDialog(null, "El número " + numero1 + " es par.");
        } else {
            JOptionPane.showMessageDialog(null, "El número " + numero1 + " es impar.");
        }
    }
}

