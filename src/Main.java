import java.text.DateFormatSymbols;
import java.util.*;
import java.util.Locale;

/**
 * The user inputs a year and the program outputs dates of Friday the 13th in given year
 */

public class Main {
    public static void main(String[] args) {
        System.out.println ( "Please input the start date.(mm/dd/yyyy)" );
        UserDate startYear = new UserDate ();
        startYear.getDate ();

        System.out.println ( "Please input the end date.(mm/dd/yyyy)" );
        UserDate endYear = new UserDate ();
        endYear.getDate ();

//        Calendar cal = new GregorianCalendar ( endYear.getDate(), 0, 13 );
  //      Calendar cal = new GregorianCalendar ( year, 0, 13 );

        //занесение в ДАТЕ


    /*

            Calendar cal = new GregorianCalendar ( year, 0, 13 );
            for (int i = 0; i < 12; i++) {
                int check = cal.get ( Calendar.DAY_OF_WEEK );
                if (check == 6) {
                    int tem = cal.get ( Calendar.MONTH );
                    System.out.print ( formatMonth ( tem, Locale.ENGLISH ) + "\t" );
                    System.out.println ( cal.get ( Calendar.DAY_OF_MONTH ) );
                }
                cal.add ( Calendar.MONTH, 1 );
            }
        }

                */
    }
}
