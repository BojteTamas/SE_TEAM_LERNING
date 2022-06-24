package CarmenH.classdesignCh5;

public class ZooWorker {

  public static void feed(Reptilee reptile) {
    System.out.println("Feeding reptile " + reptile.getName());
  }

  /** this method handles Alligator and Crocodile because these are subclasses of Reptilee */
  public static void main(String[] args) {
    feed(new Alligator());
    feed(new Crocodile());
    feed(new Reptilee());
  }
}
