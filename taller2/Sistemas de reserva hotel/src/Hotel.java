import java.util.ArrayList;
import java.util.List;

class Hotel {
    private String nombre;           // Nombre del hotel
    private List<Habitacion> habitaciones; // Lista de habitaciones del hotel

    // Constructor de la clase Hotel
    public Hotel(String nombre, int cantidadHabitaciones) {
        this.nombre = nombre;                   // Asignar el nombre del hotel
        this.habitaciones = new ArrayList<>();  // Inicializar la lista de habitaciones

        // Crear y agregar las habitaciones al hotel
        for (int i = 1; i <= cantidadHabitaciones; i++) {
            habitaciones.add(new Habitacion(i)); // Crear una nueva habitación con el número i
        }
    }

    // Método para obtener el nombre del hotel
    public String getNombre() {
        return nombre;
    }

    // Método para obtener las habitaciones disponibles en el hotel
    public List<Habitacion> getHabitacionesDisponibles() {
        List<Habitacion> disponibles = new ArrayList<>();
        for (Habitacion habitacion : habitaciones) {
            // Si la habitación no tiene ocupante, agregarla a la lista de disponibles
            if (habitacion.getOcupante().isEmpty()) {
                disponibles.add(habitacion);
            }
        }
        return disponibles;
    }

    // Método toString personalizado para mostrar el nombre del hotel
    @Override
    public String toString() {
        return nombre;
    }
}

