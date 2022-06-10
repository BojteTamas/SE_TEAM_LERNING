package CarmenH.pond.goose;

import CarmenH.pond.duck.DuckTeacher;

public class LostDuckling {

  public static void swim() {
    DuckTeacher teacher = new DuckTeacher();
    teacher.swim();
    System.out.println("Thanks" + teacher.name);
  }

  public static void main(
      String[]
          args) { // this main was added by me to print the swim method. also added static to all
    swim();
  }
}
