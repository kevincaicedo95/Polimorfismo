import org.junit.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class TestViajeIndividual {
    @Test
    public void testcosto() throws ParseException {
        Viaje viajeIndividual = new ViajeIndividual("Pasto", "Bogota", new
                SimpleDateFormat("dd/MM/yyyy").parse("03/06/2019"), new
                SimpleDateFormat("dd/MM/yyyy").parse("09/06/2019"));
        assertEquals(200000,viajeIndividual.calcularCosto());
    }

    @Test
    public void testGenerarCodigoVuelo() throws ParseException {
        String esperado="CartajenaCaracas";
        Viaje viajeIndividual= new ViajeIndividual("Cartajena", "Caracas", new
                SimpleDateFormat("dd/MM/yyyy").parse("03/06/2019"), new
                SimpleDateFormat("dd/MM/yyyy").parse("09/06/2019"));
        String codigo=viajeIndividual.generarCodigoVuelo();
        assertTrue(codigo.contains(esperado));
    }
}
