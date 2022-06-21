package MariaD.test_ch_3;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

// q33

public class Test_4 {
  public static void main(String[] args) {
    LocalDateTime d = LocalDateTime.of(2015, 5, 10, 11, 22, 33);
    Period p = Period.ofDays(1).ofYears(2);
    d = d.minus(p);
    DateTimeFormatter f = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT);
    System.out.println(f.format(d)); // /5/10/13 11:22 AM
  }
}

// q32
/*public class Test_4 {
  public static void main(String[] args) {
    LocalDateTime d = LocalDateTime.of(2015, 5, 10, 11, 22, 33);
    Period p = Period.of(1, 2, 3);
    d = d.minus(p);
    DateTimeFormatter f = DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT);
    System.out.println(d.format(f)); // 11:22 AM
  }
}
 */

// Q31
/*public class Test_4 {
  public static void main(String[] args) {
    LocalDate date = LocalDate.of(2018, Month.APRIL, 30);
    date.plusDays(2);
    date.plusYears(3);
    System.out.println(
        date.getYear() + " " + date.getMonth() + " " + date.getDayOfMonth()); // /2018 APRIL 30
  }
}
 */

// Q30
/*public class Test_4 {
  public static void main(String[] args) {
    LocalDate date = LocalDate.of(2018, Month.APRIL, 40);
    System.out.println(
        date.getYear()
            + " "
            + date.getMonth()
            + " "
            + date.getDayOfMonth()); // //Invalid value for DayOfMonth (valid values 1 - 28/31): 40
  }
}
 */

// Q29
/*public class Test_4 {
  public static void main(String[] args) {
    LocalDate date = LocalDate.parse("2018-04-30", DateTimeFormatter.ISO_LOCAL_DATE);
    date.plusDays(2);
    date.plusHours(3); // /+ date.getDayOfMonth()); not found
    System.out.println(date.getYear() + " " + date.getDayOfMonth() + "" + +date.getDayOfMonth());
  }
}
 */

// Q28 //corect: D & F
/*public class Test_4 {
  public static void main(String[] args) {
    LocalDate date = LocalDate.of(2014, 6, 21);
    LocalDate date2 = LocalDate.of(2014, Month.JUNE, 21);
    ;
    System.out.println(date2);
    System.out.println(date);
  }
}
 */

// Q27 -> OUTPUT "B"
/*public class Test_4 {
  public static void main(String[] args) {
    List<String> one = new ArrayList<String>();
    one.add("abc");
    List<String> two = new ArrayList<>();
    two.add("abc");
    if (one == two) System.out.println("A");
    else if (one.equals(two)) System.out.println("B");//////CORECT ANSER
    else System.out.println("C");
  }
}
 */

// Q26///B. The code throws a runtime exception.
/*public class Test_4 {
  public static void main(String[] args) {
    List<Integer> ages = new ArrayList<>();
    ages.add(Integer.parseInt("5"));
    ages.add(Integer.valueOf("6"));
    ages.add(7);
    ages.add(null);
    for (int age : ages) System.out.print(age);////"main" java.lang.NullPointerException
  }
}
 */

// q25 -> D 2 1 -3
/*public class Test_4 {
  public static void main(String[] args) {
    List<String> hex = Arrays.asList("30", "8", "3A", "FF");
    Collections.sort(hex);
    int x = Collections.binarySearch(hex, "8");
    int y = Collections.binarySearch(hex, "3A");
    int z = Collections.binarySearch(hex, "4F");
    System.out.println(x + " " + y + " " + z); // 2 1 -3
  }
}
 */

// q24
/*public class Test_4 {
  public static void main(String[] args) {
    String[] names = {"Tom", "Dick", "Harry"};
    List<String> list = names.asList(); // /CANNOT RESOLVE ASLIST IN STRING
    list.set(0, "Sue");
    System.out.println(names(0));
  }
}
 */

// Q23-> a.-1
/*public class Test_4 {
  public static void main(String[] args) {
    List<Integer> list = Arrays.asList(10, 4, -1, 5);
    Collections.sort(list);
    System.out.println(list); // [-1, 4, 5, 10]
    Integer array[] = list.toArray(new Integer[4]);
    System.out.println(array[0]); // -1
  }
}
 */

// q22 -> A.2
/*public class Test_4 {
  public static void main(String[] args) {
    int[] random = {6, -4, 12, 0, -10};
    int x = 12;
    int y = Arrays.binarySearch(random, x);
    System.out.println(y); // /2
  }
}
 */
