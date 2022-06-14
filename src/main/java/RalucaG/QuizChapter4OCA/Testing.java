package RalucaG.QuizChapter4OCA;

public class Testing {
  public void print(byte x) {
    System.out.println("byte");
  }

  public void print(int x) {
    System.out.println("int");
  }

  public void print(float x) {
    System.out.println("float");
  }

  public void print(Object x) {
    System.out.println("Object");
  }

  public static void main(String[] args) {
    Testing testing = new Testing();
    short ss = 123;
    testing.print(ss);
    testing.print(true);
    testing.print(6.789);
  }
}
