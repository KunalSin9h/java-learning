package datetime;

// DateFormat is an Abstract Class parent of SimpleDateFormat
// And it is in java.text
import java.text.DateFormat;

import java.util.Date;
import java.util.Locale;
import java.util.Calendar;
// also in java.sql.Date

public class DateTime {
    public static void main(String[] args) {
        cal();
        formatting();

        Date myDOB = new Date(2019, 5, 29);
        System.out.println(myDOB.toString());
        long milliSec = System.currentTimeMillis();
        Date today = new Date(milliSec);
        System.out.println(today.toString());
    }

    public static void formatting() {
        /**
         * 2 class for formatting
         * DateFormat and SimpleDateFormat
         */

        DateFormat df = DateFormat.getDateInstance(DateFormat.DEFAULT, Locale.UK);
        System.out.println(df.format(new Date()));
    }

    /**
     * Calendar is an abstract class for processing Date.
     * like adding dates
     */
    public static void cal() {
        // Now - time of action
        Calendar cal = Calendar.getInstance();
        // The Plan is Business, which is available for 2 Years
        cal.add(Calendar.YEAR, 2);
        cal.add(Calendar.DATE, 1);

        System.out.println(cal.getTime());
    }
}
