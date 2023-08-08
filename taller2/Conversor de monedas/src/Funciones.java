import javax.swing.*;

public class Funciones {

    //Creamos una instacia para poder acceder a los metodos de la otra clase
    ConvertirMonedas monedas = new ConvertirMonedas();
    public void ConvertirMonedas(double valorRecibido){
        String opciones = (JOptionPane.showInputDialog(null, "Elije la monedad a la que deseas convertir tu dinero", "Tipos de conversiones",
                JOptionPane.QUESTION_MESSAGE, null,
                new Object[] {"De Pesos a Dolar", "De Pesos a Euro", "De Pesos a Libras", "De Dolares a Pesos", "De Euro a Pesos", "De libras a Pesos" },
                "Seleccion")).toString();

        switch (opciones) {
            case "De pesos a Dolar":
                monedas.ConvertirPesosColombianosADolar(valorRecibido);
                break;
            case "De pesos a Euro":
                monedas.ConvertirPesosColombianosAEuro(valorRecibido);
                break;
            case  "De pesos a Libras":
                monedas.ConvertirPesosColombianosALibras(valorRecibido);
                break;
            case "De Dolares a Pesos":
                monedas.ConvertirDeDolaresPesos(valorRecibido);
                break;
            case "De Euro a Pesos":
                monedas.ConvertirDeEurosAPesos(valorRecibido);
                break;
            case  "De libras a Pesos":
                monedas.ConvertirDeLibrasPesos(valorRecibido);
                break;
        }
    }
}

