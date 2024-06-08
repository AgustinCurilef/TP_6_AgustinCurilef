package ejercicio2;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class FechaFormatoCorto implements FormateoFecha {
    @Override
    public String formatearFecha(LocalDate fechaNacimiento) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d-MM-yyyy");
        String fechaFormateada = fechaNacimiento.format(formatter);
        return fechaFormateada;
    }
}
