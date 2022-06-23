package DragosT;

public class PassDataToMathods {
  public static void main(String[] args) {
    int num = 4;
    newNumber(5);
    System.out.println(num); // num will be unchanged because newNuber is not instantiated
    String name = "Webby";
    speak(
        name); // variable assignment is only to the method parameter and doesn’t affect the caller
    System.out.println(name);
    StringBuilder nameString = new StringBuilder();
    speak2(nameString); // it will call a method on the parameter it does not reassign nameString
    // to a different object so it will work, the following print will print Rex
    System.out.println(nameString);
  }

  public static void newNumber(int num) {
    num = 10; // not the same as num in main
  }

  public static void speak(String name) {
    name = "Azorel";
  }

  public static void speak2(StringBuilder s) {
    s.append("Rex");
  }
}
