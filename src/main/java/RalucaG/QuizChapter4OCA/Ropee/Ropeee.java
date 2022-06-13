package RalucaG.QuizChapter4OCA.Ropee;

public class Ropeee {
  public static void swingg() {
    System.out.println("swing ");
  }

  public void climbb() {
    System.out.println("climb ");
  }

  public static void playy() {
    swingg();
    // climbb(); --this is the line that has to be removed because it's an instance method and
    // static cannot call this;
  }

  public static void main(String[] args) {
    Ropeee ropeee = new Ropeee();
    ropeee.playy();
    Ropeee ropeee1 = null;
    ropeee1.playy();
  }
}
