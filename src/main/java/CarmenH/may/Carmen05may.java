package CarmenH.may;

import java.util.*;

public class Carmen05may {

  public static void main(String[] args) {
    List<String> list1 = new ArrayList<>();
    list1.add(new String("Harry"));
    list1.add(new String("Jack"));
    list1.remove(new String("Jack"));
    System.out.println(list1); // prints [Harry]
    List<StringBuilder> list2 = new ArrayList<>();
    //  StringBuilder jack = new StringBuilder("Jack");
    list2.add(new StringBuilder("Harry"));
    list2.add(new StringBuilder("Jack"));
    StringBuilder jack2 = new StringBuilder("Jack");
    System.out.println(list2.contains(jack2)); // false - because is a reference comparison
    System.out.println(list2.indexOf(jack2)); // -1
    list2.remove(new StringBuilder("Jack"));
    System.out.println(list2); // prints [Harry, Jack]

    List<StringBuilder> list3 = new ArrayList<>();
    StringBuilder jack = new StringBuilder("Jack");
    list3.add(new StringBuilder("Harry"));
    list3.add(jack); // same reference
    list3.remove(jack);
    System.out.println(list3); // prints [Harry]
  }
}
