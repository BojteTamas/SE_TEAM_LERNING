package RalucaG.ClassDesignOCAChapter5;

public class Hyundai extends Car {
  // this is a subclass(child class) of the parent Car with its own methods and constructors
  public int nrOfDoors;

  public Hyundai(int gear, int speed, int nrOfDoors1) {
    super(gear, speed);
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
