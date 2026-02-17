package Tema_10_Fechas;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.format.TextStyle;
import java.time.temporal.ChronoUnit;
import java.util.Locale;

public class DateExercises {

    public void show() {
        LocalDate fecha = LocalDate.of(2024, 3, 15);
        System.out.println(getDayOfWeek(fecha));
        System.out.println(daySinceStartOfYear(11, 4));
        System.out.println(isValidDate("2003-11-04"));
        System.out.println(isLeapYear(2020));
        System.out.println(calculateAge(LocalDate.of(2003, 11, 04)));
        showCurrentMoment();
        
    }
    
    //1. Realiza un método que reciba una fecha y devuelva el día de la semana que corresponde.
    public String getDayOfWeek(LocalDate date) {
        return date.getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.of("es", "ES"));
    }

    //2. Realiza un método que reciba dos enteros correspondientes a un mes y un día de este año y 
    // devuelva el número de días que han pasado desde el 1 de Enero de este año hasta dicho día.
    public long daySinceStartOfYear(int month, int day) {
        LocalDate today = LocalDate.now();
        LocalDate target = LocalDate.of(today.getYear(), month, day);
        LocalDate start = LocalDate.of(today.getYear(), 1, 1);
        return ChronoUnit.DAYS.between(start, target);
    }

    //3. Realiza un método que reciba una cadena con una fecha y devuelva si dicha fecha es correcta.
    public boolean isValidDate(String dateStr) {
        try {
            LocalDate.parse(dateStr);
            return true;
        } catch (DateTimeParseException e) {
            return false;
        }
    }

    //4. Realiza un método que reciba un año y devuelva si es bisiesto o no. No se puede usar el método isLeap().
    public boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    //5. Realiza un método que reciba una fecha de nacimiento y devuelva la edad.
    public int calculateAge(LocalDate birthdate) {
        return Period.between(birthdate, LocalDate.now()).getYears();
    }

    //6. Realiza un método que muestre el momento actual de la siguiente manera:  
    public void showCurrentMoment() {
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("'Hoy es' EEEE dd-MMMM-yyyy 'a las' HH:mm:ss", Locale.of("es", "ES"));
        System.out.println(now.format(formatter));
    }


    public static void main(String[] args) {
        DateExercises ejercicio = new DateExercises();
        ejercicio.show();
    }

    
}

    //7. Realiza una clase DateConverter que tenga los siguientes métodos:
    //String spanishToAmerican(String): recibe una fecha en formato español (día/mes/año) y la devuelve en formato americano (mes/día/año).
    //String americanToSpanish(String): recibe una fecha en formato americano (mes/día/año) y la devuelve en formato español (día/mes/año).
class DateConverter {
    public String spanishToAmerican(String date) {
        DateTimeFormatter spanishFormat = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter americanFormat = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        LocalDate parseDate = LocalDate.parse(date, spanishFormat);
        return parseDate.format(americanFormat);
    }
    public String americanToSpanish(String date) {
        DateTimeFormatter americanFormat = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        DateTimeFormatter spanishFormat = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate parseDate = LocalDate.parse(date, americanFormat);
        return parseDate.format(spanishFormat);
    }
}

