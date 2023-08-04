import javax.swing.JOptionPane;

public class ejercicio21 {

    public static void main(String[] args) {

        //Pide al usuario una cadena y muestra cuántas veces aparece una letra
        //específica en ella
        String cadena = ingresarCadena();
        char letra = ingresarLetra();
        int cantidad = contarLetra(cadena, letra);

        JOptionPane.showMessageDialog(null, "La letra '" + letra + "' aparece " + cantidad + " veces en la cadena.");
    }

    public static String ingresarCadena() {
        String cadena = JOptionPane.showInputDialog("Ingrese una cadena:");
        return cadena;
    }

    public static char ingresarLetra() {
        String input = JOptionPane.showInputDialog("Ingrese una letra:");
        return input.charAt(0);
    }

    public static int contarLetra(String cadena, char letra) {
        int contador = 0;

        for (int i = 0; i < cadena.length(); i++) {
            if (cadena.charAt(i) == letra) {
                contador++;
            }
        }

        return contador;
    }
}

    
