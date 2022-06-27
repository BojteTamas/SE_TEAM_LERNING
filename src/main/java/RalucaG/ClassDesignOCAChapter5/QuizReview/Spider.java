package RalucaG.ClassDesignOCAChapter5.QuizReview;

public class Spider extends Arthropodd {
  public void printName(int input) {
    System.out.println("Spider");
  }

  public static void main(String[] args) {
    Spider spider = new Spider();
    spider.printName(4);
    spider.printName(9.0);
  }
}
