

import java.util.ArrayList;

public class Alumno {
        private String nombre;
        private int edad;
        private ArrayList<Double> calificaciones;

        public Alumno(String nombre, int edad) {
            this.nombre = nombre;
            this.edad = edad;
            this.calificaciones = new ArrayList<>();
        }

    public Alumno() {

    }

    public void asignarCalificacion(double calificacion) {
            calificaciones.add(calificacion);
        }

        public double calcularPromedio() {
            if (calificaciones.isEmpty()) {
                return 0;
            }
            double sum = 0;
            for (double calificacion : calificaciones) {
                sum += calificacion;
            }
            return sum / calificaciones.size();
        }

        public String obtenerInformacion() {
            double promedio = calcularPromedio();
            return "Nombre: " + nombre + "\n"
                    + "Edad: " + edad + "\n"
                    + "Calificaciones: " + calificaciones.toString() + "\n"
                    + "Promedio de calificaciones: " + String.format("%.2f", promedio);
        }
    }

