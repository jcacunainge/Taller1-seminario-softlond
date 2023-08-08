public class ejercicio18 {

        public static void main(String[] args) {

            // Crea un programa que genere una contraseña aleatoria de 8 caracteres que
            // contenga letras mayúsculas, letras minúsculas y dígitos. Puedes utilizar la
            // clase Math para generar números aleatorios y la clase String para manipular
            // la contraseña.
            
            String contraseña = generarContraseña();
            System.out.println("Contraseña generada: " + contraseña);
        }
    
        public static String generarContraseña() {
            String caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
            int longitud = 8;
            StringBuilder contraseña = new StringBuilder();
    
            for (int i = 0; i < longitud; i++) {
                int indiceAleatorio = (int) (Math.random() * caracteres.length());
                char caracterAleatorio = caracteres.charAt(indiceAleatorio);
                contraseña.append(caracterAleatorio);
            }
    
            return contraseña.toString();
        }
    }
    
