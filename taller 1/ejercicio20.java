import javax.swing.JOptionPane;

public class ejercicio20 {
    public static void main(String[] arg){
        // Realiza un programa que solicite al usuario una cadena y luego invierta su
        // orden
    
    String texto = ingresarCadena();
    StringBuilder textoInvertido = new StringBuilder(texto).reverse();
    JOptionPane.showMessageDialog(null, "El texto invertido es el siguiente;" + textoInvertido);

    }

    public static String ingresarCadena() {
    String palabra = JOptionPane.showInputDialog("Por favor ingrese un texto:");
    return palabra;
    }
    
}
