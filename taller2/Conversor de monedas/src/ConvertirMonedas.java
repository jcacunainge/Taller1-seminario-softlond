import javax.swing.*;

public class ConvertirMonedas {

    public void ConvertirPesosColombianosADolar(double valorRecibir) {
        //Conversion valor ingresado que es pesos a dolares
        double monedaDolar = valorRecibir / 4028.85;
        //Colocar dos decimales
        monedaDolar = (double) Math.round(monedaDolar * 100d) / 100;
        //Mostrar mensaje
        JOptionPane.showMessageDialog(null, "Tienes $" + monedaDolar + " Dolares");

    }

    public void ConvertirPesosColombianosAEuro(double valorRecibir) {
        //Conversion valor ingresado que es pesos a euro
        double monedaEuro = valorRecibir / 4425;
        //Colocar dos decimales
        monedaEuro = (double) Math.round(monedaEuro * 100d) / 100;
        //Mostrar mensaje
        JOptionPane.showMessageDialog(null, "Tienes $" + monedaEuro + "Euro");

    }

    public void ConvertirPesosColombianosALibras(double valorRecibir) {
        //Conversion valor ingresado que es pesos a euro
        double monedaLibras = valorRecibir / 5138.78;
        //Colocar dos decimales
        monedaLibras = (double) Math.round(monedaLibras * 100d) / 100;
        //Mostrar mensaje
        JOptionPane.showMessageDialog(null, "Tienes $" + monedaLibras + " Libras");

    }

    public void ConvertirDeDolaresPesos(double valorRecibir) {
        //Conversion de dolares a pesos colombianos
        double monedaPesoColombiano = valorRecibir * 4028.85;
        //Colocar dos decimales
        monedaPesoColombiano = (double) Math.round(monedaPesoColombiano * 100d) / 100;
        //Mostrar mensaje
        JOptionPane.showMessageDialog(null, "Tienes $" + monedaPesoColombiano + " Dolares");

    }

    public void ConvertirDeEurosAPesos(double valorRecibir) {
        //Conversion de euro a pesos colombianos
        double monedaPesoColombiano = valorRecibir * 4425;
        //Colocar dos decimales
        monedaPesoColombiano = (double) Math.round(monedaPesoColombiano * 100d) / 100;
        //Mostrar mensaje
        JOptionPane.showMessageDialog(null, "Tienes $" + monedaPesoColombiano + " Pesos");
    }

    public void ConvertirDeLibrasPesos(double valorRecibir){
        //Conversion de libras a pesos Colombianos
        double monedaPesosColombianos = valorRecibir * 5138.78;
        //Colocar dos decimales
        monedaPesosColombianos= (double) Math.round(monedaPesosColombianos*100d)/100;
        //Mostrar mensaje
        JOptionPane.showMessageDialog(null, "Tienes $" + monedaPesosColombianos + " Pesos");

    }
}
