package RalucaG.ClassDesignOCAChapter5;

public class MickyAndMinnie extends Mousse {
  protected int tailLength = 10;

  public void getMickyAndMinnieDetails() {
    System.out.println("[tail=" + tailLength + ",parentTail=" + super.tailLength + "]");
  }

  public static void main(String[] args) {
    Mousse mousse = new Mousse();
    mousse.getMousseDetails();
    //   mousse.getMickyAndMinnieDetails();

  }
}
