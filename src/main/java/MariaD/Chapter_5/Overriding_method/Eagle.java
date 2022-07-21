package MariaD.Chapter_5.Overriding_method;

import java.util.*;

class Bird {
  public void fly() {
    System.out.println(("bird is flying"));
  }

  public void eat(int food) {
    System.out.println("bird is eating " + food + " unit of foods");
  }
}

public class Eagle {
  public int fly(int height) {
    System.out.println("bird is flying at " + height + " meters");
    return height;
  }

  public static void main(String[] args) {
    // System.out.println(new Bird().eat());
    System.out.println(new Eagle().fly(8)); // bird is flying at 8 meters  8
  }
}
