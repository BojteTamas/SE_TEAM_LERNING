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
  }

  public static void newNumber(int num) {
    num = 10; // not the same as num in main
  }

  public static void speak(String name) {
    name = "Azorel";
  }
}
