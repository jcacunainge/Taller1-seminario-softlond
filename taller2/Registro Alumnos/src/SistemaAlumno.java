import javax.swing.*;
import java.util.HashMap;

class SistemaAlumno {
    private HashMap<String, Alumno> alumnos;
    Alumno alumno = new Alumno();

    public SistemaAlumno() {
        alumnos = new HashMap<>();
    }

    public void agregarAlumno(String nombre, int edad) {
        Alumno alumno = new Alumno(nombre, edad);
        alumnos.put(nombre, alumno);
        JOptionPane.showMessageDialog(null, "Alumno agregado correctamente.");
    }

    public void asignarCalificacion(String nombreAlumno, double calificacion) {
        if (alumnos.containsKey(nombreAlumno)) {
            Alumno alumno = alumnos.get(nombreAlumno);
            alumno.asignarCalificacion(calificacion);
            JOptionPane.showMessageDialog(null, "Calificación asignada correctamente.");
        } else {
            JOptionPane.showMessageDialog(null, "El alumno no existe.");
        }
    }

    public void calcularPromedio(String nombreAlumno) {
        if (alumnos.containsKey(nombreAlumno)) {
            Alumno alumno = alumnos.get(nombreAlumno);
            double promedio = alumno.calcularPromedio();
            JOptionPane.showMessageDialog(null, "El promedio de " + nombreAlumno + " es: " + String.format("%.2f", promedio));
        } else {
            JOptionPane.showMessageDialog(null, "El alumno no existe.");
        }
    }

    public void mostrarInformacionAlumno(String nombreAlumno) {
        if (alumnos.containsKey(nombreAlumno)) {
            Alumno alumno = alumnos.get(nombreAlumno);
            String informacion = alumno.obtenerInformacion();
            JOptionPane.showMessageDialog(null, informacion);
        } else {
            JOptionPane.showMessageDialog(null, "El alumno no existe.");
        }
    }
}

