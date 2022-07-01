package MariaD.may_june.june_30.june_13;

import java.util.ArrayList;

// add(), remove()
/*public class ArrayList_methods {
  public static void main(String[] args) {
    ArrayList scoala = new ArrayList<>();
    scoala.add("penar");
    scoala.add("pix");
    scoala.add(1, "computer");
    System.out.println(scoala); // [penar,computer,pix
    System.out.println(scoala.remove("pix")); // prints true, tries to remove an existing element
    System.out.println(scoala.remove(0)); // prints penar, removes the element at index 0
  }
}
 */

// set(),
// isEmpty() and size() --look at how many of the slots are in use
//// boolean isEmpty()
//// int size()
// clear--discards/ deletes all the elements in the ArrayList
// contains()--checks if a certain value is in the ArrayList
// equals()- we can compare 2 lists to see if they contain the same elements in the same order

public class ArrayList_methods {
  public static void main(String[] args) {
    ArrayList<String> students = new ArrayList<>();
    students.add("Ines");
    System.out.println(students); // [Ines]
    System.out.println(students.size()); // 1
    students.set(0, "john");
    // students.set(1,"maria");
    // System.out.println(students);/// exception: Index: 1, Size: 1
    System.out.println(students); // [john]
    System.out.println(students.size()); // 1
    System.out.println(students.isEmpty()); // false
    System.out.println(students.size()); // 1
    students.add("Vlad");
    students.add("Carmen");
    System.out.println(students.size()); // 3
    students.clear(); // empties the ArrayList
    System.out.println(students.isEmpty()); // /true
    System.out.println(students.size()); // 0
    students.add("Cristian");
    students.add("Harry");
    students.add("Ron");
    System.out.println(students.contains("Ron")); // /true
    System.out.println(students.contains("Herminone")); // /false
    ArrayList<String> basket = new ArrayList<>();
    ArrayList<String> football = new ArrayList<>();
    basket.add("minge");
    football.add("minge");
    System.out.println(basket.equals(football)); // true
    basket.add("cos");
    football.add("gol");
    System.out.println(basket.equals(football)); // flase
  }
}
