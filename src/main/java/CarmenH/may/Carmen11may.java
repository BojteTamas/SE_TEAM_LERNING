package CarmenH.may;

import java.time.*;

public class Carmen11may {
  public static void main(String[] args) {

    // Formatting Dates and Times
    LocalDate date = LocalDate.of(2020, Month.JANUARY, 20);
    System.out.println(date.getDayOfWeek()); // MONDAY
    System.out.println(date.getMonth()); // JANUARY
    System.out.println(date.getYear()); // 2020
    System.out.println(date.getDayOfYear()); // 20
  }
}

   /*
   // working with periods

    LocalDate date = LocalDate.of(2015, 1, 20);
    LocalTime time = LocalTime.of(6, 15);
    LocalDateTime dateTime = LocalDateTime.of(date, time);
    Period period = Period.ofMonths(1);
    System.out.println(date.plus(period)); // 2015-02-20
    System.out.println(dateTime.plus(period)); // 2015-02-20T06:15
   // System.out.println(time.plus(period)); // UnsupportedTemporalTypeException --Unsupported unit: Months
   */
        /*
        //Period wrong = Period.ofYears(1).ofWeeks(1); //P7D
        Period wrong = Period.ofYears(1);
        wrong = Period.ofWeeks(7);
        System.out.println(wrong); //P49D

         */
    /*
        LocalDate start = LocalDate.of(2015, Month.JANUARY, 1);
        //LocalDate end = LocalDate.of(2015, Month.MARCH, 30);
       LocalDate end = LocalDate.of(2017, Month.MARCH, 30);
       // LocalDate end = LocalDate.of(2015, Month.MARCH, 30);
        Period period = Period.ofMonths(1); // create a period
       // performAnimalEnrichment(start, end, period);
        Period annually = Period.ofYears(1); // every 1 year
        //performAnimalEnrichment(start, end, annually);
        Period quarterly = Period.ofMonths(3); // every 3 months
        //performAnimalEnrichment(start, end, quarterly);
        Period everyThreeWeeks = Period.ofWeeks(3); // every 3 weeks
       // performAnimalEnrichment(start, end, everyThreeWeeks);
        Period everyOtherDay = Period.ofDays(2); // every 2 days
       // performAnimalEnrichment(start, end, everyOtherDay);
        Period everyYearAndAWeek = Period.of(1, 0, 7); // every year and 7 days
        performAnimalEnrichment(start, end, everyYearAndAWeek);


    private static void performAnimalEnrichment(LocalDate start, LocalDate end,
                                                Period period) { // uses the generic period
        LocalDate upTo = start;
        while (upTo.isBefore(end)) {
            System.out.println("give new toy: " + upTo);
            upTo = upTo.plus(period); // adds the period }}


        }
    }

     */

/*
   LocalDate start = LocalDate.of(2015, Month.JANUARY, 1);
       LocalDate end = LocalDate.of(2015, Month.MARCH, 30);
 performAnimalEnrichment(start, end);
private static void performAnimalEnrichment(LocalDate start, LocalDate end) {
       LocalDate upTo = start;
       while (upTo.isBefore(end)) { // check if still before end
           System.out.println("give new toy: " + upTo);
           upTo = upTo.plusMonths(1); // add a month }}

       }
   }
*/
