package MariaD.june_14;

import java.time.*;

public class Periods {
  public static void main(String[] args) {
    LocalDate data_inceput = LocalDate.of(2022, Month.JUNE, 1);
    LocalDate data_final = LocalDate.of(2022, Month.AUGUST, 30);
    concediu(data_inceput, data_final);
  }

  public static void concediu(LocalDate data_inceput, LocalDate data_final) {
    LocalDate PanaLa = data_inceput;
    while (PanaLa.isBefore(data_final)) {
      System.out.println(
          "zile pana la concediu:" + PanaLa); // /verifica,  OUTPUT zile pana la concediu:2022-06-01
      PanaLa =
          PanaLa.plusMonths(2); // //adaua nr de luni   OUTPUT: zile pana la concediu:2022-08-01
    }
  }
}
