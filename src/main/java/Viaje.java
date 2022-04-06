import java.util.Date;

public abstract class Viaje {
    protected String origen;
    protected String destino;
    protected int costo;
    protected Date fechaSalida;
    protected Date fechaLlegada;


    // Constructores, getters y setters
    public abstract String descripcion();
    public String generarCodigoVuelo(){
        String codigo=origen+destino+(int)(Math.random()*(0-100+1)+100);
        return codigo;
    }
    public int calcularCosto() {
        if (origen=="Cali" && destino=="Pasto"){
            costo=300000;
        }
        else if (origen=="Cali" && destino=="Medellin"){
            costo=150000;
        }
        else if (origen=="Pasto" && destino=="Bogota"){
            costo=200000;
        }
        return costo;
    }

    public String getOrigen(){
        return origen;
    }


    public String getDestino(){
        return destino;
    }


    public Date getFechaLlegada() {
        return fechaLlegada;
    }


    public Date getFechaSalida() {
        return fechaSalida;
    }


    public Viaje(String origen, String destino, Date fechaSalida, Date fechaLlegada){
        this.origen=origen;
        this.destino=destino;
        this.fechaLlegada=fechaLlegada;
        this.fechaSalida=fechaSalida;
    }
}

