import org.junit.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class TestViajeFamiliar {
    @Test
    public void testcosto() throws ParseException {
        Viaje viajeFamiliar = new ViajeFamiliar("Pasto", "Bogota", new
                SimpleDateFormat("dd/MM/yyyy").parse("03/06/2019"), new
                SimpleDateFormat("dd/MM/yyyy").parse("09/06/2019"),3);
        assertEquals(600000,viajeFamiliar.calcularCosto());
    }

    @Test
    public void testGenerarCodigoVuelo() throws ParseException {
        String esperado="PastoBogota";
        Viaje viajeFamiliar = new ViajeFamiliar("Pasto", "Bogota", new
                SimpleDateFormat("dd/MM/yyyy").parse("03/06/2019"), new
                SimpleDateFormat("dd/MM/yyyy").parse("09/06/2019"),3);
        String codigo=viajeFamiliar.generarCodigoVuelo();
        assertTrue(codigo.contains(esperado));
    }



}
