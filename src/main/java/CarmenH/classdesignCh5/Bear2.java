package CarmenH.classdesignCh5;

public class Bear2 implements Herbivore, Omnivore {
  public void eatMeat() {
    System.out.println("Eating meat");
  }

  public void eatPlants() { // duplicate of methods, both are implemented with only this one
    System.out.println("Eating plants");
  }

  // we add the implement for the new method with parameter
  public int eatPlants(int quantity) {

    System.out.println("Eating plants: " + quantity);
    return quantity;
  }

  public static void main(String[] args) {
    Bear2 ursuletul = new Bear2();
    ursuletul.eatPlants();
    ursuletul.eatPlants(6);
  }

  /**
   * public void eatPlants() public int eatPlants() we couldn't have these 2 in 2 different
   * interfaces and implement in the same class
   */
}
