public class Habitacion {

    private int numero;      // Número de la habitación
    private String ocupante; // Nombre del ocupante de la habitación

    // Constructor de la clase Habitacion
    public Habitacion(int numero) {
        this.numero = numero;     // Asignar el número de la habitación
        this.ocupante = "";       // Inicialmente, la habitación no tiene ocupante
    }

    // Método para obtener el número de la habitación
    public int getNumero() {
        return numero;
    }

    // Método para obtener el nombre del ocupante de la habitación
    public String getOcupante() {
        return ocupante;
    }

    // Método para establecer el nombre del ocupante de la habitación
    public void setOcupante(String ocupante) {
        this.ocupante = ocupante;
    }
}

