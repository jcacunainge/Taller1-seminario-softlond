import java.util.Random;
import javax.swing.JOptionPane;

public class ejercicio8 {
    public static void main(String[] arg){

        // Realiza un programa que simule un juego de adivinar un número. El
        // programa debe generar un número aleatorio entre 1 y 100, y el usuario debe
        // adivinarlo. El programa debe indicar si el número ingresado es mayor o
        // menor que el número a adivinar.

        // Generamos un número aleatorio entre 1 y 100
        Random random = new Random();
        int numeroAdivinar = random.nextInt(100) + 1;
        System.out.println(numeroAdivinar);

       
        boolean adivinado = false;

        
        while (!adivinado) {
            // Pedimos al usuario que ingrese un número
            String input = JOptionPane.showInputDialog("Adivina el número (entre 1 y 100):");
            int numeroUsuario = Integer.parseInt(input);

            
            if (numeroUsuario == numeroAdivinar) {
                JOptionPane.showMessageDialog(null, "¡Felicidades! Has adivinado el número.");
                adivinado = true;
            } else if (numeroUsuario < numeroAdivinar) {
                JOptionPane.showMessageDialog(null, "El número ingresado es menor que el número a adivinar.");
            } else {
                JOptionPane.showMessageDialog(null, "El número ingresado es mayor que el número a adivinar.");
            }
        }
    }
}
    

