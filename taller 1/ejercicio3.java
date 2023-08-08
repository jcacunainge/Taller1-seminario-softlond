import javax.swing.JOptionPane;

public class ejercicio3 {
    public static void main(String[] args) {

        // Crea un programa que calcule y muestre el área y el perímetro de un círculo.
        // El usuario debe proporcionar el radio del círculo.

        String input2 = JOptionPane.showInputDialog("Ingrese el radio del circulo");
        float radio = Float.parseFloat(input2);

        double area =  Math.round(3.1416 * (radio*radio));
        double perimetro =  Math.round(2 * 3.1416 * radio);

        JOptionPane.showMessageDialog(null, "El área del circulo es = " + area);
        JOptionPane.showMessageDialog(null, "El perimetro del circulo es = " + perimetro);

    }
    
}
