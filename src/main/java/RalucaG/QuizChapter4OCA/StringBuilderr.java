package RalucaG.QuizChapter4OCA;

public class StringBuilderr {
  public static StringBuilder working(StringBuilder a, StringBuilder b) {
    a = new StringBuilder("a");
    b.append("b");
    return a;
  }

  public static void main(String[] args) {
    StringBuilder s1 = new StringBuilder("s1");
    StringBuilder s2 = new StringBuilder("s2");
    StringBuilder s3 = working(s1, s2);
    System.out.println("s1 = " + s1);
    System.out.println("s2 = " + s2);
    System.out.println("s3 = " + s3);
  }
}
