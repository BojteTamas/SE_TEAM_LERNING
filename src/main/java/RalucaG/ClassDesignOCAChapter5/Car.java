package RalucaG.ClassDesignOCAChapter5;

public class Car {
  // this is the parent class
  public int gear;
  public int speed;

  public Car(int gear, int speed) {
    this.gear = gear;
    this.speed = speed;
  }

  public void hitTheBrakes(int desc) {
    speed -= desc;
  }

  public void speedUp(int cresc) {
    speed += cresc;
  }

  public String toString() {
    return ("The car is in the " + gear + "th gear" + "  " + "and the speed is: " + speed + "km/h");
  }
}
