package CarmenH.may;

import java.time.*;
import java.time.format.*;

public class Carmen12may {
  public static void main(String[] args) {

    // Parsing Dates and Times
    DateTimeFormatter f = DateTimeFormatter.ofPattern("MM dd yyyy");
    LocalDate date = LocalDate.parse("01 02 2015", f);
    LocalTime time = LocalTime.parse("11:22");
    System.out.println(date); // 2015-01-02
    System.out.println(time); // 11:22
    /*
            //Formatting Dates and Times - continue

            LocalDate date = LocalDate.of(2020, Month.JANUARY, 20);
            LocalTime time = LocalTime.of(11, 12, 34);
            LocalDateTime dateTime = LocalDateTime.of(date, time);
            DateTimeFormatter f = DateTimeFormatter.ofPattern("hh:mm");
            f.format(dateTime); //works
            //f.format(date); //error Unsupported field: ClockHourOfAmPm
            f.format(time); //works
    */

    /*
    LocalDate date = LocalDate.of(2020, Month.JANUARY, 20);
    LocalTime time = LocalTime.of(11, 12, 34);
    LocalDateTime dateTime = LocalDateTime.of(date, time);
    DateTimeFormatter f = DateTimeFormatter.ofPattern("MMMM dd, yyyy, hh:mm");
    System.out.println(dateTime.format(f));// January 20, 2020, 11:12
     */
    /*
    MMMM M represents the month. The more Ms you have, the more verbose the Java output.
    For example, M outputs 1, MM outputs 01, MMM outputs Jan, and MMMM outputs January.
    dd d represents the date in the month. As with month, the more ds you have, the more verbose the Java output.
     dd means to include the leading zero for a single-digit month.
    , Use , if you want to output a comma (this also appears after the year).
    yyyy y represents the year. yy outputs a two-digit year and yyyy outputs a four-digit year.
    hh h represents the hour. Use hh to include the leading zero if you’re outputting a single- digit hour.
    : Use : if you want to output a colon.
    mm m represents the minute.
     */

    /*
      LocalDate date = LocalDate.of(2020, Month.JANUARY, 20);
      LocalTime time = LocalTime.of(11, 12, 34);
      LocalDateTime dateTime = LocalDateTime.of(date, time);

      DateTimeFormatter shortF = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT);
      DateTimeFormatter mediumF = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM);

      System.out.println(shortF.format(dateTime)); // 1/20/20 11:12 AM
      System.out.println(mediumF.format(dateTime));  // Jan 20, 2020 11:12:34 AM


    */
    /*
      LocalDate date = LocalDate.of(2020, Month.JANUARY, 20);
      LocalTime time = LocalTime.of(11, 12, 34);

      LocalDateTime dateTime = LocalDateTime.of(date, time);

     // System.out.println(date .format(DateTimeFormatter.ISO_LOCAL_DATE)); //2020-01-20
     // System.out.println(time.format(DateTimeFormatter.ISO_LOCAL_TIME)); //11:12:34
    //  System.out.println(dateTime.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME)); //2020-01-20T11:12:34


    //  DateTimeFormatter shortDateTime = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
     // System.out.println(shortDateTime.format(dateTime)); //1/20/20
     // System.out.println(shortDateTime.format(date)); //1/20/20
      // System.out.println(shortDateTime.format(time));  // UnsupportedTemporalTypeException -- time cannot be formatted as a date

      DateTimeFormatter shortDateTime = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
      System.out.println(dateTime.format(shortDateTime)); //1/20/20
      System.out.println(date.format(shortDateTime)); //1/20/20
     // System.out.println(time.format(shortDateTime)); -- time cannot be formatted as a date

      */

  }
}
