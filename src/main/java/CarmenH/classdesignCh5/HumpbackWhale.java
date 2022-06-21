package CarmenH.classdesignCh5;

public class HumpbackWhale extends Whale {

  private void sing() { // this is a new method, not the one from parent class
    System.out.println("Humpback whale is singing");
  }

  public static void main(String[] args) {
    HumpbackWhale balenacucocoasa = new HumpbackWhale();
    balenacucocoasa.sing();
  }
}
