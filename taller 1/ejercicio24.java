import javax.swing.JOptionPane;

public class ejercicio24 {
    public static void main(String[] args) {

        // Realiza un programa que solicite al usuario una cadena y reemplace todas
        // las apariciones de una letra específica por otra

        
        String cadena = ingresarCadena();
        char letraOriginal = ingresarLetraOriginal();
        char letraReemplazo = ingresarLetraReemplazo();

        String cadenaModificada = reemplazarLetra(cadena, letraOriginal, letraReemplazo);

        JOptionPane.showMessageDialog(null, "Cadena modificada: " + cadenaModificada);
    }

    public static String ingresarCadena() {
        String cadena = JOptionPane.showInputDialog("Ingrese una cadena:");
        return cadena;
    }

    public static char ingresarLetraOriginal() {
        String input = JOptionPane.showInputDialog("Ingrese la letra original:");
        return input.charAt(0);
    }

    public static char ingresarLetraReemplazo() {
        String input = JOptionPane.showInputDialog("Ingrese la letra de reemplazo:");
        return input.charAt(0);
    }

    public static String reemplazarLetra(String cadena, char letraOriginal, char letraReemplazo) {
        return cadena.replace(letraOriginal, letraReemplazo);
    }
}
