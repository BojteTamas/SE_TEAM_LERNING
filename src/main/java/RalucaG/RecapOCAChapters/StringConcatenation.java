package RalucaG.RecapOCAChapters;

public class StringConcatenation {
  public static void main(String[] args) {
    String s = "Raluca " + "Oana " + "Gal";
    System.out.println(s);

    String ss = 24 + 1991 + "Raluca Oana Gal" + 01 + 24;
    System.out.println(ss);

    String s1 = "Something";
    String s2 = "else and then some";
    String s3 = s1.concat(s2);
    System.out.println(s3);

    // string builder
    StringBuilder ss1 = new StringBuilder("Stranger Things ");
    StringBuilder ss2 = new StringBuilder("Season 4 Vol 2");
    StringBuilder ss3 = ss1.append(ss2);
    System.out.println(ss3.toString());
  }
}
