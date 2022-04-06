import java.util.Date;

public class ViajeFamiliar extends Viaje{
    /**
     * Cantidad de integrantes de la familia
     */
    private int familia;

    public ViajeFamiliar(String origen, String destino, Date fechaSalida, Date fechaLlegada) {
        super(origen, destino, fechaSalida, fechaLlegada);
    }


    //Constructor getters and setters
    @Override
    public String descripcion() {
        return "Viaje para disfrutar con toda tu familia";
    }
    @Override
    public int calcularCosto() {
        if (origen=="Cali" && destino=="Pasto"){
            costo=300000*familia;
        }
        else if (origen=="Cali" && destino=="Medellin"){
            costo=150000*familia;
        }
        else if (origen=="Pasto" && destino=="Bogota"){
            costo=200000*familia;
        }
        return costo;
    }
    public ViajeFamiliar(String origen, String destino, Date fechaSalida, Date fechaLlegada, int familia) {
        super(origen, destino, fechaSalida, fechaLlegada);
        this.familia=familia;
    }
}
