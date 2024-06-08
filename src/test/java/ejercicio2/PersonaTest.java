package ejercicio2;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

public class PersonaTest {
    @Test
    public void fechaFormatoLargo() {
        Persona persona= new Persona("Jose","Perez", LocalDate.of(2024, 1, 1),TipoDeFormato.LARGO);
        Assert.assertEquals("1 de enero de 2024",persona.fechaNacimiento());
    }
    @Test
    public void fechaFormatoCorto() {
        Persona persona= new Persona("Jose","Perez", LocalDate.of(2024, 1, 1),TipoDeFormato.CORTO);
        Assert.assertEquals("1-01-2024",persona.fechaNacimiento());
    }
}
