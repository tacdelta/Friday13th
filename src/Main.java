import java.text.DateFormatSymbols;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.Scanner;

    /**
     * The user inputs a year and the program outputs dates of Friday the 13th in given year
     */

    public class Main {
        public static void main(String[] args) {
            System.out.print ( "Enter the year: " );

            Scanner sc = new Scanner ( System.in );
            int year = sc.nextInt ();
            Calendar cal = new GregorianCalendar ( year, 0, 13 );
            for (int i = 0; i < 12; i++) {
                int check = cal.get ( Calendar.DAY_OF_WEEK );
                if (check == 6) {
                    int tem = cal.get ( Calendar.MONTH );
                    System.out.print ( formatMonth ( tem, Locale.ENGLISH ) + "\t" );
                    System.out.println ( cal.get ( Calendar.DAY_OF_MONTH ) +"th" );
                }
                cal.add ( Calendar.MONTH, 1 );
            }
        }

        public static String formatMonth(int month, Locale locale) {
            DateFormatSymbols symbols = new DateFormatSymbols ( locale );
            String[] monthNames = symbols.getMonths ();
            return monthNames[month];
        }
    }
