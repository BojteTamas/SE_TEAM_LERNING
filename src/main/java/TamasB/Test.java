package TamasB;

public class Test {

  public static void main(String[] args) {
    String unu = "";

    unu = apendAllStrings("unu", "lasdfsa", "sadsadsa");
    System.out.println(unu);
  }

  public static String apendAllStrings(String... strings) { // => String[] strings
    String initial = "";
    for (String string : strings) {
      initial = initial + string;
    }

    return initial;
  }
}
