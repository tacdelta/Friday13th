import java.text.DateFormatSymbols;
import java.util.Locale;
import java.util.Scanner;

public class UserDate {

    static void getDate() {
        Scanner sc = new Scanner ( System.in );
        System.out.print ( "Enter the month: " );
        String month = sc.next ();
        int m = -1;
        int d = -1;
        int y = 0;
        do {
            do {
                if (!isInteger ( month )) {
                    System.out.println ( "Please enter a number." );
                    month = sc.next ();
                } else {
                    m = Integer.parseInt ( month );
                    if (m > 11 || m < 0) {
                        {
                            System.out.print ( "Incorrect month number.Please enter the correct one(from 0 to 11): " );
                            month = sc.next ();
                        }
                    }
                }
            }
            while (m > 11 || m < 0);
        } while ((!isInteger ( month )));


        System.out.print ( "Enter the day: " );
        String day = sc.next ();
        do {
            do {
                if (!isInteger ( day )) {
                    System.out.println ( "Please enter a number." );
                    day = sc.next ();
                } else {
                    d = Integer.parseInt ( day );
                    if (d > 31 || d < 1) {
                        {
                            System.out.print ( "Incorrect day number.Please enter the correct one(from 1 to 31): " );
                            day = sc.next ();
                        }
                    }
                }
            }
            while (d > 31 || d < 1);
        } while ((!isInteger ( day )));


        System.out.print ( "Enter the year: " );
        String year = sc.next ();
        do {
            do {
                if (!isInteger (year )) {
                    System.out.println ( "Please enter a number." );
                    year = sc.next ();
                } else {
                    y = Integer.parseInt ( year );
                    if (y > 3017 || y < 1) {
                        {
                            System.out.print ( "Incorrect year number.Please enter the correct one(from 1 to 3017): " );
                            year = sc.next ();
                        }
                    }
                }
            }
            while (m > 3017 || m < 1);
        } while ((!isInteger ( month )));
        System.out.println ("Your date is " +  formatMonth (m, Locale.ENGLISH)  + " " + d + " " + y );
    }

    static boolean isInteger(String s) {
        try {
            Integer.parseInt ( s );
        } catch (NumberFormatException e) {
            return false;
        }
        return true;
    }
    public static String formatMonth(int month, Locale locale) {
        DateFormatSymbols symbols = new DateFormatSymbols ( locale );
        String[] monthNames = symbols.getMonths ();
        return monthNames[month];
    }
}
