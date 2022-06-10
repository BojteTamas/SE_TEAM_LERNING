package DragosT;

import java.time.*;

public class May30Dragos {
  // date time
  public static void main(String[] args) {
    System.out.println(LocalDate.now()); // y-m-h
    System.out.println(LocalTime.now()); // h:m:s.ms
    System.out.println(LocalDateTime.now()); // y-m-hh:m:s.ms

    LocalDate date = LocalDate.of(2014, Month.JANUARY, 20);
    System.out.println(date); // 2014-01-20
    date = date.plusDays(2);
    System.out.println(date); // 2014-01-22
    date = date.plusWeeks(1);
    System.out.println(date); // 2014-01-29
    date = date.plusMonths(1);
    System.out.println(date); // 2014-02-28
    date = date.plusYears(5);
    System.out.println(date); // 2019-02-28
    // sami with minus minusYears(1) will produce 2019-02-28
  }
}
