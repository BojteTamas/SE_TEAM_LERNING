package CarmenH.classdesignCh5;

public class Gorilla extends Animal {

  public Gorilla(int age) {
    super(age, "Gorilla");
    System.out.println(age);
  }

  public Gorilla() {
    super(5);
  }

  public static void main(String[] args) {
    Gorilla goriluta = new Gorilla(8);
  }
}
