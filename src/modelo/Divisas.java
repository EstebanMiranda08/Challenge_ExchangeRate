package modelo;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Divisas {

    private final String base;
    private final String target;
    private final double montoConvertido;
    private final double monto;
    private final LocalDateTime timestamp;


    public Divisas(DivisasApi rate, double monto) {
        this.base = rate.base_code();
        this.target = rate.target_code();
        this.montoConvertido = monto * rate.conversion_rate();
        this.monto=monto;
        this.timestamp = LocalDateTime.now();
    }

    public String toString() {
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        return "El valor del monto ingresado: "+monto+" "+base+ " corresponde al valor final de --> "+montoConvertido+" " +target+"\nConversion realizada --> ["+ timestamp.format(formato)+"]";
    }

}
