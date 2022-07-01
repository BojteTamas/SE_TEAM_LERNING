package RalucaG.RecapOCAChapters;

public class StringImmutable {
  public static void main(String[] args) {
    String s = "Stranger Things";
    s.concat(" Season 4 Vol 2");
    System.out.println(s); // prints only Stranger Things because it's immutable;
    s = s.concat(" Season 4 Vol 2 - July 1st");
    System.out.println(s);
    /**
     * If one reference variable changes the value of the object, it will be affected by all the
     * reference variables. That is why String objects are immutable in Java.
     */
  }
}
