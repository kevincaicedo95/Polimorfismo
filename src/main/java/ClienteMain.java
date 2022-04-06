import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ClienteMain {
    /**
     * Arreglo polimórfico de viajes
     */
    public static List<Viaje> viajes = new ArrayList();
    public static void main(String[] args) {
        leerViajes();
        mostrarViajes();
    }
    /**
     * Lee viajes en el arreglo polimórfico
     */
    public static void leerViajes() {
        try {
            Viaje viaje1 = new ViajeFamiliar("Cali", "Medellin", new
                    SimpleDateFormat("dd/MM/yyyy").parse("03/06/2019"), new
                    SimpleDateFormat("dd/MM/yyyy").parse("09/06/2019"),4);
            viajes.add(viaje1);
            Viaje viaje2 = new ViajeIncentivo("Cali", "Medellin", new
                    SimpleDateFormat("dd/MM/yyyy").parse("03/06/2019"), new
                    SimpleDateFormat("dd/MM/yyyy").parse("09/06/2019"), "Emtel", 100000);
            viajes.add(viaje2);
            Viaje viaje3 = new ViajeIndividual("Pasto", "Bogota",
                    new SimpleDateFormat("dd/MM/yyyy").parse("01/07/2019"), new
                    SimpleDateFormat("dd/MM/yyyy").parse("12/07/2019"));
            viajes.add(viaje3);
            Viaje viaje4 = new ViajeTodoIncluido("Cali", "Pasto",
                    new SimpleDateFormat("dd/MM/yyyy").parse("01/07/2019"), new
                    SimpleDateFormat("dd/MM/yyyy").parse("12/07/2019"));
            viajes.add(viaje4);
        }catch(ParseException ex){
                Logger.getLogger(ClienteMain.class.getName()).log(Level.SEVERE, null,
                        ex);
            }
        }
    /**
     * Recorre e imprime datos del arreglo polimófico
     */
    public static void mostrarViajes() {
        for (Viaje viaje : viajes) {
            System.out.println("Origen: " + viaje.getOrigen());
            System.out.println("Destino: " + viaje.getDestino());
            System.out.println("Fecha salida: " + viaje.getFechaSalida());
            System.out.println("Fecha llegada: " + viaje.getFechaLlegada());
            System.out.println("Costo: " + viaje.calcularCosto());
            System.out.println("Descripción: " + viaje.descripcion());
            System.out.println("Codigo de vuelo: " + viaje.generarCodigoVuelo());
            System.out.println("");
        }
    }
}
