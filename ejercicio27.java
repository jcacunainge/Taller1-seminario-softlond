import java.util.Arrays;
import javax.swing.JOptionPane;

public class ejercicio27 {
    public static void main(String[] args) {
        //Crea un programa que solicite al usuario una frase y luego muestre las
        //palabras ordenadas alfabéticamente
        String frase = ingresarFrase();
        String[] palabras = separarPalabras(frase);
        Arrays.sort(palabras);

        JOptionPane.showMessageDialog(null, "Palabras ordenadas alfabéticamente:");

        for (String palabra : palabras) {
            JOptionPane.showMessageDialog(null, palabra);
        }
    }

    public static String ingresarFrase() {
        String frase = JOptionPane.showInputDialog("Ingrese una frase:");
        return frase;
    }

    public static String[] separarPalabras(String frase) {
        return frase.split("\\s+");
    }
}

