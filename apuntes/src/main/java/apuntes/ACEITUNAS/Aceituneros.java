package apuntes.ACEITUNAS;

import javax.swing.JOptionPane;

public class Aceituneros {
     public static void main(String[] args) {
        // variables.
        final double PRECIOINICIAL = 1.23;
        int contador = 0;
        
        while (contador < 10){
            
            // Empezamos con la variable tipo: 
            String tipo;
            do {                
                tipo = JOptionPane.showInputDialog("Introduce el tipo de aceituna (picual, aloreña, hojiblanca)" + "Escribe salir para terminar: ").toLowerCase();
                if (tipo.equals("salir")) {
                    break;
                }
                
            
            } while (!tipo.equals("picual") && !tipo.equals("aloreña") && !tipo.equals("hojiblanca"));
            
            // Empezamos con la variable Tamaño:
            String tamaño;
            do {                
                tamaño = JOptionPane.showInputDialog("Introduce el tamaño de la aceituna (gruesa o fina): ").toLowerCase();
               

            } while (!tamaño.equals("gruesa") && !tamaño.equals("fina"));
            
            // Empezamos con la variable kilos
            double kilos;
            do {                
                kilos = Double.parseDouble(JOptionPane.showInputDialog("Introduce el total de kilos:  "));
            } while (kilos < 0);
            
        }
    }
        
}
