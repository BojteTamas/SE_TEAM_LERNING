package RalucaG.ClassDesignOCAChapter5;

public class Hyundai extends Car {
  // this is a subclass(child class) of the parent Car with its own methods and constructors
  public int nrOfDoors;

  public Hyundai(int gear, int speed, int nrOfDoors1) {
    super(gear, speed);
    /**
     * Things cool to remember: super() -> method used to call superclass methods(parent methods),
     * and to access the superclass constructor(parent class constructor). super() acts as immediate
     * parent class constructor and should be first line in child class constructor. this() acts as
     * current class constructor and can be used in parametrized constructors keyword used for
     * inheritance is extends.
     */
    nrOfDoors = nrOfDoors1;
  }

  public void setNrOfDoors(int nrDoors) {
    nrOfDoors = nrDoors;
  }

  @Override
  public String toString() {
    return super.toString() + "  and the number of doors is: " + nrOfDoors;
  }
}
