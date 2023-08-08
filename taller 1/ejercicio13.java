import javax.swing.JOptionPane;
public class ejercicio13  {
    public static void main(String[] args) {

        //Pide al usuario un número decimal y muestra su valor redondeado a un
        //número específico de decimales
        
        String input = JOptionPane.showInputDialog("Ingrese un número decimal:");
        double numero = Double.parseDouble(input);

        String decimalesInput = JOptionPane.showInputDialog("Ingrese la cantidad de decimales a redondear:");
        int decimales = Integer.parseInt(decimalesInput);

        double numeroRedondeado = redondearDecimal(numero, decimales);

        JOptionPane.showMessageDialog(null, "El número redondeado es: " + numeroRedondeado);
    }

    // Función para redondear un número decimal a un número específico de decimales
    public static double redondearDecimal(double numero, int numDecimales) {
        double factor = Math.pow(10, numDecimales);
        return Math.round(numero * factor) / factor;
    }
}

