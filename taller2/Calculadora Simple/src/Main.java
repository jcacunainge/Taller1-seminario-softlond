import javax.swing.*;
public class Main {
    public static void main(String[] args) {

        // Variables que necesitaremos
        int option;
        String menu;

        OperacionesBasicas metodos = new OperacionesBasicas();

        do {
            menu = JOptionPane.showInputDialog(
                    "Menu principal \n" +
                            "1. Suma \n" +
                            "2. Resta \n" +
                            "3. Multiplicacion \n" +
                            "4. Division \n" +
                            "5. Salir");
            option = Integer.parseInt(menu);
            switch (option){
                case 1:
                    metodos.suma();
                    break;
                case 2:
                    metodos.resta();
                    break;
                case 3:
                    metodos.multiplocacion();
                    break;
                case 4:
                    metodos.division();
                    break;
                case 5:
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "La opcion " + option + " es incorrecta");
            }
        } while (option != 5); // Agrega la condición aquí para que el bucle se ejecute mientras option sea diferente de 5
    }
}