package CalinA.OCA8.JulOCA;

public class Jul04 {
  public static void main(String[] args) {
    StringBuilder str = new StringBuilder();
    str.append("123");
    System.out.println("String = " + str.toString());

    StringBuilder str1 = new StringBuilder("10,11,12,13");
    System.out.println("String1 = " + str1.toString());

    StringBuilder str2 = new StringBuilder(5);
    System.out.println("String2 Capacity = " + str2.capacity());

    StringBuilder str3 = new StringBuilder(str1.toString());
    System.out.println("String3 = " + str3.toString());
  }
}
// Readm From OCA:
//        Using the StringBuilder Class
