package RalucaG.QuizChapter4OCA;

public class Creation {
  Creation() {
    System.out.println("1");
  }

  Creation(int num) {
    System.out.println("2 ");
  }

  Creation(Integer num) {
    System.out.println("3 ");
  }

  Creation(Object num) {
    System.out.println("4 ");
  }

  Creation(int... nums) {
    System.out.println("5 ");
  }

  public static void main(String[] args) {
    new Creation(100);
    new Creation(1000);
  }
}
