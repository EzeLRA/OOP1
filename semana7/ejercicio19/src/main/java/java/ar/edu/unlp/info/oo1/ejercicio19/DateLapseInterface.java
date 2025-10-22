package java.ar.edu.unlp.info.oo1.ejercicio19;

import java.time.LocalDate;

public interface DateLapseInterface {
    int sizeInDays();
    boolean includesDate(LocalDate other);
    boolean overlaps(DateLapse other); //sugerencia para el analisis de periodos que coinciden
}
