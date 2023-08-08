import javax.swing.JOptionPane;
public class ejercicio25{
    
    public static void main(String[] args) {

        //Pide al usuario una frase y muestra cada palabra por separado
        
        String frase = ingresarFrase();
        String[] palabras = separarPalabras(frase);

        JOptionPane.showMessageDialog(null, "Palabras en la frase:");

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
