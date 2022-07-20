package MariaD.Chapter_5.Compiller_Enhacement;

import java.util.*;

class Fish {
  protected int size;
  private int age;

  public Fish(int age) {
    this.age = age;
  }

  public int getAge() {
    return age;
  }
}

class FishFish extends Fish {
  // public static void main(String[] args) {
  private int noOfFish = 8;

  public FishFish(int age) {
    super(age);
    this.size = 4;
  }

  public void displaySharkDetails() {
    System.out.println("shark with age " + this.getAge()); // shark with age 5
    System.out.print(" and " + this.size + " meters long"); // and 4 meters long with 8 fins
    System.out.print(" with " + this.noOfFish + " fins"); // with 8 fins
  }
}

public class Shark {
  public static void main(String... args) {
    FishFish fish = new FishFish(5);
    fish.displaySharkDetails();
  }
}
