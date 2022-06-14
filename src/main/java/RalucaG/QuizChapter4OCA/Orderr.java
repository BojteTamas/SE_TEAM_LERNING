package RalucaG.QuizChapter4OCA;

public class Orderr {
  String value = "t";

  {
    value += "a";
  }

  {
    value += "c";
  }

  public Orderr() {
    value += "b";
  }

  public Orderr(String s) {
    value += s;
  }

  public static void main(String[] args) {
    Orderr orderr = new Orderr("f");
    orderr = new Orderr();
    System.out.println(orderr.value);
  }
}
