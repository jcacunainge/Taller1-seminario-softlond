import javax.swing.*;

public class OperacionesBasicas {

    //Creamos las variables que necesitaremos
    double number1;
    double number2;
    double resultado;

    //Constructor
    public OperacionesBasicas(){
        number1 = 0;
        number2 = 0;
        resultado = 0;

    }
    //Metodo suma
    public void suma(){
        number1  = Double.parseDouble(JOptionPane.showInputDialog("Dijite el primer valor"));
        number2  = Double.parseDouble(JOptionPane.showInputDialog("Dijite el segundo valor"));
        resultado = number1 + number2;
        JOptionPane.showInputDialog(null, "El resultado es: " + resultado);
    }

    //Metodo resta
    public void resta(){
            number1  = Double.parseDouble(JOptionPane.showInputDialog("Dijite el primer valor"));
            number2  = Double.parseDouble(JOptionPane.showInputDialog("Dijite el segundo valor"));
            resultado = number1 - number2;
            JOptionPane.showInputDialog(null, "El resultado es: " + resultado);
    }
    public void multiplocacion(){
        number1  = Double.parseDouble(JOptionPane.showInputDialog("Dijite el primer valor"));
        number2  = Double.parseDouble(JOptionPane.showInputDialog("Dijite el segundo valor"));
        resultado = number1 * number2;
        JOptionPane.showInputDialog(null, "El resultado es: " + resultado);
    }
    public void division(){
        number1  = Double.parseDouble(JOptionPane.showInputDialog("Dijite el primer valor"));
        number2  = Double.parseDouble(JOptionPane.showInputDialog("Dijite el segundo valor"));
        resultado = number1 / number2;
        JOptionPane.showInputDialog(null, "El resultado es: " + resultado);
    }
}


