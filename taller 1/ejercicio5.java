import javax.swing.JOptionPane;

public class ejercicio5 {
    public static void main(String[] arg){
        // Realiza un programa que solicite al usuario dos números enteros y determine
        // cuál es el mayor de ellos.
        String input1 = JOptionPane.showInputDialog("Ingrese un numero entero");
        int numero1 = Integer.parseInt(input1);

        String input2 = JOptionPane.showInputDialog("Ingrese un numero entero");
        int numero2 = Integer.parseInt(input2);

        if(numero1 > numero2){
            JOptionPane.showMessageDialog(null, "El numero: " + numero1 + " es mayor que el numero: " + numero2);
        }else{
            JOptionPane.showMessageDialog(null, "El numero: " + numero1 + " es menor que el numero: " + numero2);
        }


    }
    
}
