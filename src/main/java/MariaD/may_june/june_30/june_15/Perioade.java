package MariaD.may_june.june_30.june_15;

import java.time.*;

public class Perioade {
  public static void main(String[] args) {
    LocalDate data_start = LocalDate.of(2022, Month.JANUARY, 1);
    LocalDate data_final = LocalDate.now();
    Period luni = Period.ofMonths(1); // creaza o perioada
    Period anual = Period.ofYears(2);
    Period trimestrial = Period.ofMonths(3);
    situatie(
        data_start, data_final, luni); // ///huge output!!!!!!!!cat dureaza perioada+683007-04-01
  }

  private static void situatie(LocalDate data_start, LocalDate data_final, Period perioada) {
    LocalDate upTo = data_start;
    while (data_start.isBefore(data_final)) {
      System.out.println("cat dureaza perioada" + upTo);
      upTo = upTo.plus(perioada);
    }
  }
}
