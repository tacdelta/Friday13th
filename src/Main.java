import java.text.SimpleDateFormat;
import java.util.*;

/**
 * The user inputs a year and the program outputs dates of Friday the 13th in given year
 */

public class Main {
    public static void main(String[] args) {
        SimpleDateFormat sdf = new SimpleDateFormat ( "MMM dd yyyy" );
        System.out.println ( "Please input the start date.(mm/dd/yyyy)" );

        UserDate startYear = new UserDate ();
        int[] year1 = startYear.getDate ();


        System.out.println ( "Please input the end date.(mm/dd/yyyy)" );
        UserDate endYear = new UserDate ();
        int[] year2 = endYear.getDate ();
        System.out.println ( "Here's the list of dates of all Fridays 13th between your two dates: " );

        Calendar cal = new GregorianCalendar ( year2[2], year2[0], year2[1] );
        Calendar cal2 = new GregorianCalendar ( year1[2], year1[0], year1[1] );
        Calendar cs; //calendar start
        Calendar ce; //calendar end

        if (cal.compareTo ( cal2 ) != 1) {
            cs = cal;
            ce = cal2;
        } else {  //If date2 < year 1, dates change the places;
            cs = cal2;
            ce = cal;

        }
        if (cs.get ( Calendar.DAY_OF_MONTH ) > 13)   //going to next month if day is > 13, else just changing the date
        {
            cs.add ( Calendar.MONTH, 1 );
            if (cs.get ( Calendar.MONTH ) > 11) {
                cs.set ( Calendar.MONTH, 0 );
                cs.add ( Calendar.YEAR, 1 );
            }
        }
        cs.set ( Calendar.DAY_OF_MONTH, 13 ); // setting 13th
        do {
            if (cs.get ( Calendar.DAY_OF_WEEK ) == 6) {
                System.out.println ( sdf.format ( cs.getTime () ) );
            }
            cs.add ( Calendar.MONTH, 1 );
            if (cs.get ( Calendar.MONTH ) > 11) {
                cs.set ( Calendar.MONTH, 0 );
                cs.add ( Calendar.YEAR, 1 );
            }
        } while (cs.compareTo ( ce ) != 1);
    }
}
