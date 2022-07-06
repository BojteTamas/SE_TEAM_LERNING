package CalinA.OCA8.JulOCA.StringBuilderMethods;

public class Jul06CharAtIndexOflenghtsubstring {
  public static void main(String[] args) {
    StringBuilder sb = new StringBuilder("StringBuilder.");
    String sub = sb.substring(sb.indexOf("S"), sb.indexOf("ui"));
    int len = sb.length();
    char ch = sb.charAt(9);
    System.out.println(sub + "" + len + "" + ch);
  }
}
// Read from OCA
// charAt(), indexOf(), length(), and substring()
// Creating a StringBuilder
//        Important StringBuilder Methods
