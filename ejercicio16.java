import javax.swing.JOptionPane;
public class ejercicio16 {

    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("Ingrese un número límite para la serie de Fibonacci:");
        int limite = Integer.parseInt(input);

        System.out.println("Serie de Fibonacci hasta " + limite + ":");

        int primero = 0;
        int segundo = 1;

        while (primero <= limite) {
            System.out.print(primero + " ");
            int siguiente = primero + segundo;
            primero = segundo;
            segundo = siguiente;
        }
    }
}






