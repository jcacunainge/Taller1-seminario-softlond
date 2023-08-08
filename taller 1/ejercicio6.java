import javax.swing.JOptionPane;

public class ejercicio6 {

    public static void main( String[] arg){

    // Escribe un programa que pida al usuario un número y verifique si es positivo,
    // negativo o cero.

    String input = JOptionPane.showInputDialog("Ingrese un numero");
    int numero = Integer.parseInt(input);

    if(numero > 0 ){
        JOptionPane.showMessageDialog(null, "El número es positivo.");
    }else if(numero < 0){
        JOptionPane.showMessageDialog(null, "El número es negativo.");

    }else{
        JOptionPane.showMessageDialog(null, "El número es 0.");
    }

    }
    
}
