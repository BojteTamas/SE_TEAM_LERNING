package RalucaG.QuizChapter4OCA;

public class howMany {
  public static int howwMany(boolean b, boolean... b2) {
    return b2.length;
  }

  public static void main(String[] args) {
    howMany.howwMany(true, true, true);
    howMany.howwMany(true, new boolean[2]);
  }
}
/**
 * Q1: B ->correct answer B + C; Q2: A + C-> correct answer A +D ; Q3:A +C + D -> correct; Q4:A + B
 * + G -> correct; Q5: D + G ->correct; it compiles both ways; Q6: A + D->correct answer D; Q7: B +
 * C + D+ F ->correct; Q8:B + C + E ->correct; Q9: C + E ->correct; Q10: B ->correct; swing swing 10
 * - we changed the value of lengh to 10; Q11: B + E ->correct; it prints swing swing, we remove
 * climbb() from playy method because static cannot call upon instance; Q12:
 */
