import javax.swing.JOptionPane;

public class ejercicio19 {
    public static void main(String[] args) {
        // Escribe un programa que solicite al usuario su nombre y luego lo imprima en mayúsculas y minúsculas

        String texto = ingresarNombre();
        String textoMayuscula = texto.toUpperCase();
        String textoMinuscula = texto.toLowerCase();

        JOptionPane.showMessageDialog(null, "Nombre en mayúsculas: " + textoMayuscula );
        JOptionPane.showMessageDialog(null, "Nombre en mayúsculas: " + textoMinuscula);
        
        
    }

    public static String ingresarNombre() {
        String palabra = JOptionPane.showInputDialog("Por favor ingrese su nombre:");
        return palabra;
    }
}
