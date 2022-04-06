import org.junit.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import static org.junit.Assert.assertEquals;

public class TestViajeTodoIncluido {
    @Test
    public void testcosto() throws ParseException {
        Viaje viajeTodoIncluido= new ViajeTodoIncluido("Pasto", "Bogota", new
                SimpleDateFormat("dd/MM/yyyy").parse("03/06/2019"), new
                SimpleDateFormat("dd/MM/yyyy").parse("09/06/2019"));
        assertEquals(400000,viajeTodoIncluido.calcularCosto());
    }
}
