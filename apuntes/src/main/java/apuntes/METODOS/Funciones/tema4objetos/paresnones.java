package apuntes.METODOS.Funciones.tema4objetos;

import java.util.Scanner;
import java.nio.channels.Pipe.SourceChannel;
import java.util.Random;

public class paresnones {
    public static void main(String[] args) {
        
        // Scanner;
        Scanner albondigo = new Scanner(System.in);

        // VAriables;
        String eleccion;
        int salidaHumano = 0;
        int salidaMáquina = 0;
        int numero;
        int numeroMaquina;
        int numeroTotal;

        // Random;
        Random r = new Random();

        // Empieza el juego.
        do {

            // Ambos equipos eligen numero.
            System.out.println("Eliga un numero aleatorio del uno al 10");
            System.out.println("¿Eliges pares o nones?: ");
            eleccion = albondigo.nextLine().toUpperCase();
            
            // Validar que el usuario introduzca pares o nones
            while (!eleccion.equals("pares") && !eleccion.equals("nones") && !eleccion.equals("pares") && !eleccion.equals("nones")) {
                System.out.println("No me vale tio elige o pares o nones:");
                eleccion = albondigo.nextLine().toLowerCase();
            }
            
            // Determinar si el usuario eligió pares o nones
            boolean jugadorEligioPares = eleccion.equals("p") || eleccion.equals("pares");
            
            System.out.println("Has elegido: " + (jugadorEligioPares ? "PARES" : "NONES"));
            
            System.out.println("Introduce un numero: ");
            numero = albondigo.nextInt();
            albondigo.nextLine(); // Limpio el buffer
            numeroMaquina = r.nextInt(1, 11);
            System.out.println("El numero que ha sacado la maquina es: " + numeroMaquina);

            // Empiezamos a contar.
            numeroTotal = numero + numeroMaquina; // numeroTotal = numero + numeroMaquina.

            // Confirmamos los numero:
            System.out.println("El numero que has escogido es: " + numero);
            System.out.println("El numero que ha escogido la maquina es: " + numeroMaquina);
            System.out.println("La suma de ambos numeros es: " + numeroTotal);

            // Ahora comprobamos que la suma de ambos numero es par o none.
            if (numeroTotal % 2 == 0) { // si el numero es divisible entre dos decimos que es par.
                System.out.println("Resultado: Par");
                if (jugadorEligioPares) { //Este metodoo es un booleano que nos comprueba lo que ha escogido la maquina.
                    System.out.println("Enorabuena vete ya.");
                    salidaHumano++;
                } else {
                    System.out.println("Has perdido tio vete ya.");
                    salidaMáquina++;
                }
            } else {
                System.out.println("Resultado: Nones.");
                if (!jugadorEligioPares) {
                    System.out.println("Enorabuena vete ya bro");
                    salidaHumano++;
                } else {
                    System.out.println("Has perdido tio vete ya.");
                     salidaMáquina++;
                }
            }
            
            System.out.println("Puntuación - Tú: " + salidaHumano + " | Máquina: " + salidaMáquina);

        } while (salidaHumano == 2 || salidaMáquina == 2);
    }
}
