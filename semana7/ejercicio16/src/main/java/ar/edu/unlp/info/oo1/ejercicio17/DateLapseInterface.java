package ar.edu.unlp.info.oo1.ejercicio17;

import java.time.LocalDate;

public interface DateLapseInterface {
    int sizeInDays();
    boolean includesDate(LocalDate other);
}
