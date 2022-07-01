package RalucaG.RecapOCAChapters;

public class JavaStringMethods {
  public static void main(String[] args) {
    String s = "Java string methods";
    char ch = s.charAt(5); // returns the char value for the 5th index
    System.out.println(ch);
    String string = "First and last character in java string";
    int stringLength = string.length();
    System.out.println("Character from position 0 is: " + string.charAt(0));
    System.out.println("Character from the last position is " + string.charAt(stringLength - 1));
    System.out.println(string.indexOf("h"));
    System.out.println(string.indexOf("st", 4));
    System.out.println(string.substring(3, 7));
  }
}
