import javax.swing.JOptionPane;

public class ejercicio4 {
    public static void main(String[] args) {

        // Pide al usuario su edad y muestra un mensaje indicando si es mayor de edad
        // o menor de edad.

        String edadUsuario = JOptionPane.showInputDialog("Por favor ingrese su edad: ");
        int edad = Integer.parseInt(edadUsuario);

        if(edad >= 18 ){
            JOptionPane.showMessageDialog(null, "Adelante, usted puede ingresar");
        }else{
            JOptionPane.showMessageDialog(null, "Lo lamento, usted no puede ingresa");
        }

    }
}
