package CarmenH.may;

import java.time.*;

public class Carmen10may {
  public static void main(String[] args) {

    // working with periods

    // manipulating dates and times

    /*
    LocalDate date = LocalDate.of(2020, Month.JANUARY, 20);
    date.plusDays(1);
    System.out.println(date); //2020-01-20
    System.out.println(date.plusDays(1)); //2020-01-21
    //date = date.plusMinutes(1); // does not compile

     */
    /*
         LocalDate date = LocalDate.of(2020, Month.JANUARY, 20);
         LocalTime time = LocalTime.of(5,15);
         LocalDateTime dateTime = LocalDateTime.of( date, time).minusDays(1).minusHours(10).minusSeconds(30);
         System.out.println(dateTime); //2020-01-18T19:14:30
    */
    /*
       LocalDate date = LocalDate.of(2020, Month.JANUARY, 20);
       LocalTime time = LocalTime.of(5,15);
       LocalDateTime dateTime = LocalDateTime.of( date, time);
       System.out.println(dateTime); //2020-01-20T05:15
       dateTime = dateTime.minusDays(1);
       System.out.println(dateTime); //2020-01-19T05:15
       dateTime = dateTime.minusHours(10);
       System.out.println(dateTime); //2020-01-18T19:15
       dateTime = dateTime.minusSeconds(30);
       System.out.println(dateTime); //2020-01-18T19:14:30
    */
    /*
           LocalDate date = LocalDate.of(2014, Month.JANUARY, 20);
           System.out.println(date); //2014-01-20
           date = date.plusDays(2);
           System.out.println(date); //2014-01-22
           date = date.plusWeeks(1);
           System.out.println(date); //2014-01-29
           date = date.plusMonths(1);
           System.out.println(date); //2014-02-28
           date = date.plusYears(5);
           System.out.println(date); //2019-02-28
    */
  }
}
