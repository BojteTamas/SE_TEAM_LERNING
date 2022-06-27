package RalucaG.ClassDesignOCAChapter5.QuizReview;

public class SsnakeHandler {
  private Ssnake ssnake;

  public void setSsnake(Ssnake ssnake) {
    this.ssnake = ssnake;
  }

  public static void main(String[] args) {
    new SsnakeHandler().setSsnake(new Cobrra()); // this works;
    // new SsnakeHandler().setSsnake(new GardenSsnake());//this doesn;t work;
    new SsnakeHandler().setSsnake(new Ssnake()); // this works;
    // new SsnakeHandler().setSsnake(new Object()); //this doesn;t work;
    // new SsnakeHandler().setSsnake(new String("Snake")); //this doesn';t work;
    new SsnakeHandler().setSsnake(null);

    System.out.println("Answer is: A + C + F");
  }
}
