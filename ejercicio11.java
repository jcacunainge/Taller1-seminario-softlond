import javax.swing.JOptionPane;

public class ejercicio11 {
    public static void main(String[] arg){
        // Escribe un programa que calcule el área de un triángulo utilizando la fórmula
        // de Herón. El usuario debe ingresar las longitudes de los tres lados.

        String input1 = JOptionPane.showInputDialog("Ingrese el lado 1 del triangulo");
        float lado1 = Float.parseFloat(input1);
        String input2 = JOptionPane.showInputDialog("Ingrese el lado 2 del triangulo");
        float lado2 = Float.parseFloat(input2);
        String input3 = JOptionPane.showInputDialog("Ingrese el lado 3 del triangulo");
        float lado3 = Float.parseFloat(input3);

        double perimetro = (lado1 + lado2 + lado3) / 2;

        double area = Math.sqrt(perimetro * ((perimetro - lado1) * (perimetro - lado2) * (perimetro - lado3)));

        JOptionPane.showMessageDialog(null, "El area correspondientes es igual a: " + area);

    }
    
}
