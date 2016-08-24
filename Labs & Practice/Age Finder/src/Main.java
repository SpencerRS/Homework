import sun.util.calendar.BaseCalendar;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * Created by SpizzyRich on 8/24/16.
 */
public class Main {
    public static void main(String[] args) {
        int test1 = getAge(11,1992);
        int test2 = getAge(1, 2000);
    }
    public static int getAge(int month, int year){
        int currentYear = Calendar.getInstance().get(Calendar.YEAR)+1;
        int currentMonth = Calendar.getInstance().get(Calendar.MONTH)+1;
        int ageYears = currentYear-year;
        int yearMonths = ageYears*12;
        int ageMonths = currentMonth-month;
        return yearMonths + ageMonths;
    }
}

