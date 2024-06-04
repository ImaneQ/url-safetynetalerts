package urlsafetynetalerts.utils;

import java.text.*;
import java.time.*;
import java.time.format.*;
import java.util.*;

public class DateUtils {

    public static int calculateAge(String birthdate, String format) throws ParseException {
        LocalDate dateDuJour = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(format);
        LocalDate localDate = LocalDate.parse(birthdate, formatter);
        System.out.println("dateDuJour " + dateDuJour);
        System.out.println("localDate " + localDate);

        /*public static void main(String[] args) {

            LocalDate birthDate = LocalDate.of(1970, 5, 17);
            LocalDate currentDate = LocalDate.now();
            int age = Period.between(birthDate, currentDate).getYears();

            System.out.println("Age is: " + age);
        }*/

       return 0;
    }

    public static void main(String[] args) throws ParseException {
        calculateAge("20/07/1997", "dd/MM/yyyy");

    }
}
