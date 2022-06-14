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
 * climbb() from playy method because static cannot call upon instance; 14th ofJUne: Q12: C ->
 * correct answer D; Q13: E -> correct; cannot change final variables after init; Q14: B -> correct;
 * this will import everything in collections Q15: F ->correct answer E; it was intObjectObject Q16:
 * B ->correct;we only print out value which is 9; Q17: B + D + E ->correct; s1=a,s2=s2b cuz it
 * appends b in work and s3 = a because work returns a; Q18: C + F -> correct answer: C + G; Q19: A
 * + C ->correct; the constructor must always match the class name! Q20: E ->correct; this(2) =>
 * this.numberBags = numberBags; Q21: C ->correct; this.numspots =numspots; similar to Q20; Q22: C
 * ->correct answer: E; Q23: A ->correct answer; s is initialized but not used, don't know what's
 * going on there; Q24: B + C + E ->correct; static and instance variables; Q25: A + E ->correct; it
 * prints out 2-2,3-3,4-4 if you comment each constructor because it looks for the next available
 * one; Q26: A->correct; this is lambda example and it matches because age 1 < age 5; Q27:
 * C->correct; isTooHigh has only 2 params , on line 7 it gives 3 -- error; Q28: A + D -->correct
 * answer: A + D + F; Q29: A ->correct answer: A + F;
 *
 * <p>Total: 17/29
 */
