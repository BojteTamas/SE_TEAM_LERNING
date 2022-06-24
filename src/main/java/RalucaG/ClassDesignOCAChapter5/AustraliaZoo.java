package RalucaG.ClassDesignOCAChapter5;

public class AustraliaZoo extends Reptiless {
  public static void feed(Reptiless reptiless) {
    System.out.println("Feeding the reptile " + reptiless.getName());
  }

  public static void main(String[] args) {
    feed(new Snakes());
    feed(new KomodoDragon());
    feed(new Reptiless());
  }
}
