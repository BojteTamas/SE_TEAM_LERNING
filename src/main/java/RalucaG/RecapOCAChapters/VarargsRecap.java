package RalucaG.RecapOCAChapters;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class VarargsRecap {
  public static <E> void addAll(List<E> list, E... array) {
    for (E element : array) {
      list.add(element);
    }
  }
  /**
   * static List<String> countingStars(){ List numbers = new ArrayList<>(); numbers.add(2);
   * List<String> strings = numbers; strings.add(""); return strings; }
   */
  static void countingLegume(List<String>... stringsList) {
    Object[] array = stringsList;
    List<Integer> numbersList = Arrays.asList(24, 28, 5, 9);
    array[0] = numbersList;
    String string = stringsList[0].get(0); // this is short eg from codegym
  }

  public static void run(int... nums) {
    System.out.println(nums[1]);
  }

  public int countingStars(int... args) {
    System.out.println("cate stele avem: " + args.length);
    int suma = 0;
    for (int x : args) {
      suma += x;
    }
    return suma;
  }

  public static void main(String[] args) {
    addAll(new ArrayList<String>(), "Legume", "Fructe", "Lactate", "Carne");
    // List<String> stringsWithCountingStars = countingStars();
    // System.out.println(stringsWithCountingStars.get(0)); => a generic variable of type
    // List<String> that points to a generic collection of type ArrayList<Number> ->Not ok!
    List<String> legume1 = Arrays.asList("Castraveti", "Ceapa", "Ardei");
    List<String> legume2 = Arrays.asList("Rosii", "Vinete", "Fasole pastai");
    // countingLegume(legume1,legume2);//-->ClassCastException , when we try to read a string from
    // the array
    run(11, 22); // ->array of size 2, index 0 is 11, index 1 is 22->print 22;
    VarargsRecap ex = new VarargsRecap();
    int suma1 = ex.countingStars(23567889, 12092383);
    System.out.println("suma1 de stele: " + suma1);
    int suma2 = ex.countingStars(53564343, 134234343, 77645454);
    System.out.println("suma2 de stele: " + suma2);
    int suma3 = ex.countingStars(837373737, 25362, 987372, 323232);
    System.out.println("suma3 de stele: " + suma3);
  }
}
