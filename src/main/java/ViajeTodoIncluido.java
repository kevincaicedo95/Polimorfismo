import java.util.Date;

public class ViajeTodoIncluido extends Viaje{

    public ViajeTodoIncluido(String origen, String destino, Date fechaSalida, Date fechaLlegada) {
        super(origen, destino, fechaSalida, fechaLlegada);
    }

    @Override
    public String descripcion() {
        return "Disfruta tu viaje todo incluido";
    }

    @Override
    public int calcularCosto() {
        if (origen == "Cali" && destino == "Pasto") {
            costo = 300000 * 2;
        } else if (origen == "Cali" && destino == "Medellin") {
            costo = 150000 * 2;
        } else if (origen == "Pasto" && destino == "Bogota") {
            costo = 200000 * 2;
        }
        return costo;
    }
}
