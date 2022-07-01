package MariaD.may_june.june_30.june_14;

import java.time.*;

public class Date_and_Time {
  public static void main(String[] args) {

    LocalDate luna = LocalDate.of(2022, Month.JUNE, 14);
    luna = luna.plusDays(3);
    System.out.println(luna); // //2022-06-17

    LocalDate data = LocalDate.of(2022, Month.JUNE, 14);
    LocalTime ora = LocalTime.of(3, 10);
    LocalDateTime data_si_ora =
        LocalDateTime.of(data, ora).minusDays(1).minusHours(3).minusSeconds(30);
    System.out.println(data_si_ora); // 2022-06-13T00:09:30

    LocalDate data1 = LocalDate.of(2022, Month.JUNE, 14);
    LocalDate data2 = LocalDate.of(2022, 6, 14);
    System.out.println(data1); // 2022-06-14
    System.out.println(data2); // 2022-06-14
    System.out.println(LocalDate.now()); // /2022-06-14
    System.out.println(LocalTime.now()); // 15:03:04.192
    System.out.println(LocalDateTime.now()); // 2022-06-14T15:03;04.193
  }
}
