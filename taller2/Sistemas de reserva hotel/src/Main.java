import javax.swing.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        List<Hotel> hoteles = new ArrayList<>();
        hoteles.add(new Hotel("Hotel A", 10));
        hoteles.add(new Hotel("Hotel B", 15));

        Map<Cliente, List<Reserva>> reservas = new HashMap<>();

        int numClientes = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de clientes:"));

        for (int i = 0; i < numClientes; i++) {
            String nombreEmpresa = JOptionPane.showInputDialog("Ingrese el nombre de la empresa del cliente " + (i + 1) + ":");
            Cliente cliente = new Cliente(nombreEmpresa);

            List<Reserva> listaReservas = new ArrayList<>();

            int numReservas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de reservas para " + nombreEmpresa + ":"));

            for (int j = 0; j < numReservas; j++) {
                Hotel hotel = seleccionarHotel(hoteles);
                Habitacion habitacion = seleccionarHabitacion(hotel);

                Reserva reserva = new Reserva(cliente, hotel, habitacion);
                listaReservas.add(reserva);
            }

            reservas.put(cliente, listaReservas);
        }

        // Mostrar información de las reservas al final
        StringBuilder infoReservas = new StringBuilder();
        for (Map.Entry<Cliente, List<Reserva>> entry : reservas.entrySet()) {
            Cliente cliente = entry.getKey();
            List<Reserva> listaReservas = entry.getValue();

            infoReservas.append("Empresa: ").append(cliente.getNombreEmpresa()).append("\n");
            for (Reserva reserva : listaReservas) {
                infoReservas.append("Hotel: ").append(reserva.getHotel().getNombre())
                        .append(", Habitación: ").append("Habitación ").append(reserva.getHabitacion().getNumero())
                        .append(", Ocupante: ").append(reserva.getCliente().getNombreEmpresa()).append("\n");
            }
            infoReservas.append("\n");
        }

        JOptionPane.showMessageDialog(null, "Información de las reservas:\n" + infoReservas.toString());
    }

    private static Hotel seleccionarHotel(List<Hotel> hoteles) {
        Object[] opcionesHoteles = hoteles.toArray();
        Object seleccion = JOptionPane.showInputDialog(null, "Seleccione un hotel:", "Selección de Hotel",
                JOptionPane.QUESTION_MESSAGE, null, opcionesHoteles, opcionesHoteles[0]);
        return (Hotel) seleccion;
    }

    private static Habitacion seleccionarHabitacion(Hotel hotel) {
        List<Habitacion> habitacionesDisponibles = hotel.getHabitacionesDisponibles();

        // Crear un arreglo de nombres de habitaciones en el formato "Habitación 1", "Habitación 2", ...
        String[] nombresHabitaciones = new String[habitacionesDisponibles.size()];
        for (int i = 0; i < habitacionesDisponibles.size(); i++) {
            nombresHabitaciones[i] = "Habitación " + habitacionesDisponibles.get(i).getNumero();
        }

        String seleccion = (String) JOptionPane.showInputDialog(null, "Seleccione una habitación:",
                "Selección de Habitación", JOptionPane.QUESTION_MESSAGE, null,
                nombresHabitaciones, nombresHabitaciones[0]);

        // Obtener el número de habitación a partir de la selección
        int numeroHabitacion = Integer.parseInt(seleccion.split(" ")[1]);

        // Buscar la habitación correspondiente al número
        for (Habitacion habitacion : habitacionesDisponibles) {
            if (habitacion.getNumero() == numeroHabitacion) {
                return habitacion;
            }
        }


        return null;
    }

}
