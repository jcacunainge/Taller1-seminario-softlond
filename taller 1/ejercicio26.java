import javax.swing.JOptionPane;

public class ejercicio26 {
    public static void main(String[] args) {

        //Escribe un programa que pida al usuario una cadena y muestre cuántos
        //caracteres tiene sin contar los espacios en blanco
        
        String cadena = ingresarCadena();
        int cantidadCaracteres = contarCaracteresSinEspacios(cadena);

        JOptionPane.showMessageDialog(null, "La cadena tiene " + cantidadCaracteres + " caracteres sin contar espacios.");
    }

    public static String ingresarCadena() {
        String cadena = JOptionPane.showInputDialog("Ingrese una cadena:");
        return cadena;
    }

    public static int contarCaracteresSinEspacios(String cadena) {
        return cadena.replace(" ", "").length();
    }
}

