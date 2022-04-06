import org.junit.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class TestViajeIncentivo {
    @Test
    public void testcosto() throws ParseException {
        Viaje viajeIncentivo = new ViajeIncentivo("Pasto", "Bogota", new
                SimpleDateFormat("dd/MM/yyyy").parse("03/06/2019"), new
                SimpleDateFormat("dd/MM/yyyy").parse("09/06/2019"),"Inovatec",100000);
        assertEquals(100000,viajeIncentivo.calcularCosto());
    }

    @Test
    public void testGenerarCodigoVuelo() throws ParseException {
        String esperado = "QuitoAcapulco";
        Viaje viajeIncentivo = new ViajeIncentivo("Quito", "Acapulco", new
                SimpleDateFormat("dd/MM/yyyy").parse("03/06/2019"), new
                SimpleDateFormat("dd/MM/yyyy").parse("09/06/2019"),"Inovatec",100000);
        String codigo = viajeIncentivo.generarCodigoVuelo();
        assertTrue(codigo.contains(esperado));
    }

    @Test
    public void testDescripcion() throws ParseException {
        String esperado = "Viaje incentivo que te envia la empresa Inovatec";
        Viaje viajeIncentivo = new ViajeIncentivo("Quito", "Acapulco", new
                SimpleDateFormat("dd/MM/yyyy").parse("03/06/2019"), new
                SimpleDateFormat("dd/MM/yyyy").parse("09/06/2019"),"Inovatec",100000);
        String descripcion = viajeIncentivo.descripcion();
        assertEquals(esperado,descripcion);
    }
}
