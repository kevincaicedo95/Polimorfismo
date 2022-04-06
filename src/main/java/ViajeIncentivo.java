import java.util.Date;

public class ViajeIncentivo extends Viaje{

    private String empresa;
    private int bono;

    @Override
    public String descripcion() {
        return "Viaje incentivo que te envia la empresa " + empresa;
    }

    @Override
    public int calcularCosto(){
        if (origen=="Cali" && destino=="Pasto"){
            costo=300000-bono;
        }
        else if (origen=="Cali" && destino=="Medellin"){
            costo=150000-bono;
        }
        else if (origen=="Pasto" && destino=="Bogota"){
            costo=200000-bono;
        }
        return costo;
    }

    public ViajeIncentivo(String origen, String destino, Date fechaSalida, Date fechaLlegada, String empresa, int bono) {
        super(origen,destino,fechaSalida,fechaLlegada);
        this.bono=bono;
        this.empresa=empresa;
    }
}
