package MariaD.may_june.june_30.june_15;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class Formatare_Data {
  public static void main(String[] args) {
    LocalDate data = LocalDate.now();
    System.out.println(data.getDayOfWeek()); // WEDNESDAY
    System.out.println(data.getMonth()); // JUNE
    System.out.println(data.getYear()); // 2022
    System.out.println(data.getDayOfYear()); // 166

    //// ISO is a standard for dates.
    LocalDate dataa = LocalDate.of(2022, Month.JUNE, 15);
    LocalTime ora = LocalTime.now();
    LocalDateTime data_ora = LocalDateTime.of(dataa, ora);
    System.out.println(dataa.format(DateTimeFormatter.ISO_LOCAL_DATE)); // 2022-06-15
    System.out.println(ora.format(DateTimeFormatter.ISO_LOCAL_TIME)); // 23:02:51.543
    System.out.println(
        data_ora.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME)); // 2022-06-15T23:02:51.543

    DateTimeFormatter formatare_scurta = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
    DateTimeFormatter formatare_completa = DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL);
    DateTimeFormatter formatare_medie = DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM);
    DateTimeFormatter formatare_lunga = DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG);
    System.out.println(formatare_scurta.format(data_ora)); // /6/15/22
    System.out.println(formatare_completa.format(data_ora)); // Wednesday, June 15, 2022
    System.out.println(formatare_medie.format(data_ora)); // Jun 15, 2022
    System.out.println(formatare_lunga.format(data_ora)); // June 15, 2022

    /// MMM = MONTH, DD= DAY, YYYY= YEAR, HH= HOUR, MM= MINUTES
    // parsarea date/orei
    // crearea noi patternuri de formatare
    DateTimeFormatter model_nou = DateTimeFormatter.ofPattern("MMMM dd, yyyy, hh:mm");
    DateTimeFormatter alt_model = DateTimeFormatter.ofPattern("MM dd yyyy");
    LocalDate data2 = LocalDate.parse("07 15 2022", alt_model);
    LocalTime ora_2 = LocalTime.parse("11:19");
    System.out.println(data_ora.format(model_nou)); // /June 15, 2022, 11:12
    System.out.println(data_ora.format(alt_model)); // /06/ 15/ 22, 11:16
    System.out.println(data2); // 2022-07-15
    System.out.println(ora_2); // 11:19
  }
}
