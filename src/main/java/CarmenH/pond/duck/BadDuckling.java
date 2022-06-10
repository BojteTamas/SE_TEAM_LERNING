package CarmenH.pond.duck;

public class BadDuckling {
  public void makeNoise() {
    FatherDuck duck = new FatherDuck();
    duck.quack(); // quack() is private in FatherDuck class so it is not visible here
    System.out.println(
        duck.noise); // noise is private in FatherDuck class so it is not visible here
  }
}
