package CalinA.OCA8.JulOCA.Reverse;

public class Jul12reverse2 {
  public static void main(String[] args) {
    String rev = "Rain", rev1 = "";
    char ch;
    System.out.print("First word: ");
    System.out.println("Rain");
    for (int x = 0; x < rev.length(); x++) {
      ch = rev.charAt(x);
      rev1 = ch + rev1;
    }
    System.out.println("Reversed word: " + rev1);
  }
}
