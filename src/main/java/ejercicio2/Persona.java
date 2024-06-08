package ejercicio2;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

public class Persona implements FechaImportante {
    private String nombre;
    private String apellido;
    private LocalDate fechaNacimiento;
    private TipoDeFormato tipoDeFormato;
    Map<String,FormateoFecha> formateoFecha = new HashMap<>();

    public Persona(String nombre, String apellido, LocalDate fechaNacimiento,TipoDeFormato tipoDeFormato) {
        this.tipoDeFormato = tipoDeFormato;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNacimiento = fechaNacimiento;
        this.formateoFecha.put(TipoDeFormato.LARGO.name(), new FechaFormatoLargo());
        this.formateoFecha.put(TipoDeFormato.CORTO.name(), new FechaFormatoCorto());
    }
    @Override
    public String fechaNacimiento() {
        return this.formateoFecha.get(this.tipoDeFormato.name()).formatearFecha(this.fechaNacimiento);
    }
}
