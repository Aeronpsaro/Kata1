package kata01_42;

import java.time.LocalDate;
import java.time.Month;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Main {

    public static void main(String[] args) {
        LocalDate birthdate = LocalDate.of(1980, Month.JANUARY, 1);
        Person person = new Person("Antonio", birthdate);
        
        System.out.println(person.getName() + " tiene " + person.getAge() + " años.");
    }
    
}
