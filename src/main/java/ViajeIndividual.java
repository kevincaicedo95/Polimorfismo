import java.util.Date;

public class ViajeIndividual extends Viaje{


    public ViajeIndividual(String origen, String destino, Date fechaSalida, Date fechaLlegada) {
        super(origen, destino, fechaSalida, fechaLlegada);
    }

    @Override
    public String descripcion() {
        return null;
    }


}
