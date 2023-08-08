import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        SistemaAlumno sistema = new SistemaAlumno();

        boolean continuar = true;

        while (continuar) {
            String opciones = (JOptionPane.showInputDialog(null, "Seleccione lo que quiere realizar",
                    "Menú", JOptionPane.QUESTION_MESSAGE, null,
                    new Object[]{"","Agregar alumnos", "Agregar calificacion", "Calcular promedio", "Informacion estudiante", "Salir"},
                    "Selección")).toString();

            switch (opciones) {
                case "Agregar alumnos": {
                    String nombre = JOptionPane.showInputDialog("Ingrese el nombre del alumno:");
                    int edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad del alumno:"));
                    sistema.agregarAlumno(nombre, edad);
                    break;
                }
                case "Agregar calificacion": {
                    String nombre = JOptionPane.showInputDialog("Ingrese el nombre del alumno:");
                    double calificacion = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la calificación:"));
                    sistema.asignarCalificacion(nombre, calificacion);
                    break;
                }
                case "Calcular promedio": {
                    String nombre = JOptionPane.showInputDialog("Ingrese el nombre del alumno:");
                    sistema.calcularPromedio(nombre);
                    break;
                }
                case "Informacion estudiante": {
                    String nombre = JOptionPane.showInputDialog("Ingrese el nombre del alumno:");
                    sistema.mostrarInformacionAlumno(nombre);
                    break;
                }
                case "Salir": {
                    int opcion = JOptionPane.showConfirmDialog(null, "¿Desea salir del programa?", "Salir", JOptionPane.YES_NO_OPTION);
                    if (opcion == JOptionPane.YES_OPTION) {
                        continuar = false;
                    }
                    break;
                }
            }
        }
    }
}





