package CarmenH.June.june02;

public class Glider2 {

  public static String glide(String s) {
    return "1";
  }

  public static String glide(String... s) {
    return "2";
  }

  public static String glide(Object o) {
    return "3";
  }

  public static String glide(String s, String t) {
    return "4";
  }

  public static void main(String[] args) {
    System.out.println(glide("a")); // 1
    System.out.println(glide("a", "b")); // 4
    System.out.println(glide("a", "b", "c")); // 2
  }
}
