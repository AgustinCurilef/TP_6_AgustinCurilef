package ejercicio2;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Formatter;

public class FechaFormatoLargo implements FormateoFecha {
    @Override
    public String formatearFecha(LocalDate fechaNacimiento) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d 'de' MMMM 'de' yyyy");
        String fechaFormateada = fechaNacimiento.format(formatter);
        return fechaFormateada;
    }
}
