package RalucaG.QuizChapter4OCA;

public class BirdsSeeed {
  private int numberBags;
  boolean call;

  public BirdsSeeed() {
    this(2);
    call = false;
  }

  public BirdsSeeed(int numberBags) {
    this.numberBags = numberBags;
  }

  public static void main(String[] args) {
    BirdsSeeed seeed = new BirdsSeeed();
    System.out.println(seeed.numberBags);
  }
}
