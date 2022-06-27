package RalucaG.ClassDesignOCAChapter5.QuizReview;

public class Owwl implements Nocturnall {
  @Override
  public boolean isBlind() {
    //        return Nocturnall.super.isBlind();
    return false;
  }

  public static void main(String[] args) {
    Nocturnall nocturnall = (Nocturnall) new Owwl();
    System.out.println(nocturnall.isBlind());
  }
}
