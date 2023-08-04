import javax.swing.JOptionPane;
public class ejercicio23 {
    public static void main(String[] args) {

        //Crea un programa que pida al usuario una oración y muestre cuántas
        //palabras contiene
        String oracion = ingresarOracion();

        int cantidadPalabras = contarPalabras(oracion);

        JOptionPane.showMessageDialog(null, "La oración contiene " + cantidadPalabras + " palabras.");
    }

    public static String ingresarOracion() {
        String oracion = JOptionPane.showInputDialog("Ingrese una oración:");
        return oracion;
    }

    public static int contarPalabras(String oracion) {
        String[] palabras = oracion.split("\\s+");
        return palabras.length;
    }
}

