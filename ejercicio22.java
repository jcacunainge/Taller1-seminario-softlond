import javax.swing.JOptionPane;

public class ejercicio22 {

    public static void main(String[] args) {

        // Escribe un programa que solicite al usuario una frase y verifique si es un
        // palíndromo (se lee igual de izquierda a derecha que de derecha a izquierda)
        String frase = ingresarFrase();

        if (esPalindromo(frase)) {
            JOptionPane.showMessageDialog(null, "La frase es un palíndromo.");
        } else {
            JOptionPane.showMessageDialog(null, "La frase no es un palíndromo.");
        }
    }

    public static String ingresarFrase() {
        String frase = JOptionPane.showInputDialog("Ingrese una frase:");
        return frase.toLowerCase().replaceAll("[^a-z]", "");
    }

    public static boolean esPalindromo(String frase) {
        int longitud = frase.length();
        for (int i = 0; i < longitud / 2; i++) {
            if (frase.charAt(i) != frase.charAt(longitud - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}
    

