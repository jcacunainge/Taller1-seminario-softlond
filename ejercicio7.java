import javax.swing.JOptionPane;

public class ejercicio7 {
    public static void main(String[] arg){
        String input = JOptionPane.showInputDialog("Ingrese un numero entero positivo");
        int numero = Integer.parseInt(input);

        for(int i=1; i<=10; i++){
            System.out.println(numero + " X " + i + " = " + (numero * i ));
        }

    }

    
}
