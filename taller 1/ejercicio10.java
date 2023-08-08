public class ejercicio10 {
        public static void main(String[] args) {

            // Ejercicio 10: Crea un programa que muestre los primeros 20 números de la
            // serie Fibonacci. La serie Fibonacci se forma sumando los dos números
            // anteriores para obtener el siguiente número: 0, 1, 1, 2, 3, 5, 8, 13

            
            int n = 20; // Número de términos de la serie Fibonacci a mostrar
            int primero = 0;
            int segundo = 1;
    
            System.out.println("Los primeros " + n + " números de la serie Fibonacci:");
    
            for (int i = 0; i < n; i++) {
                if (i <= 1) {
                    System.out.print(primero + " ");
                } else {
                    int siguiente = primero + segundo;
                    System.out.print(siguiente + " ");
    
                    primero = segundo;
                    segundo = siguiente;
                }
            }
        }
    }
    
