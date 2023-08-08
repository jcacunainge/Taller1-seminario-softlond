public class Reserva {
    private Cliente cliente;       // Cliente asociado a la reserva
    private Hotel hotel;           // Hotel en el que se hizo la reserva
    private Habitacion habitacion; // Habitación reservada

    // Constructor de la clase Reserva
    public Reserva(Cliente cliente, Hotel hotel, Habitacion habitacion) {
        this.cliente = cliente;       // Asignar el cliente a la reserva
        this.hotel = hotel;           // Asignar el hotel a la reserva
        this.habitacion = habitacion; // Asignar la habitación a la reserva

        // Establecer al cliente como ocupante de la habitación
        habitacion.setOcupante(cliente.getNombreEmpresa());
    }

    // Método para obtener el cliente asociado a la reserva
    public Cliente getCliente() {
        return cliente;
    }

    // Método para obtener el hotel en el que se hizo la reserva
    public Hotel getHotel() {
        return hotel;
    }

    // Método para obtener la habitación reservada
    public Habitacion getHabitacion() {
        return habitacion;
    }
}

