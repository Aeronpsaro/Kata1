package kata01_42;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Person {
    private final String name;
    private final Calendar birthdate;

    public Person(String name, Calendar birthdate) {
        this.name = name;
        this.birthdate = birthdate;
    }

    public String getName() {
        return name;
    }

    long getAge() {
        long Milliseconds_per_Year = (long) (365.25*24*60*60*1000);
        Calendar now = GregorianCalendar.getInstance();
        return (now.getTimeInMillis()-birthdate.getTimeInMillis())/Milliseconds_per_Year;
    }
    
    
    
    
}
