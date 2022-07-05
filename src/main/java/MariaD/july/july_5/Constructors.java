package MariaD.july.july_5;

import java.util.*;

/*
A constructor in Java is a special method that is used to initialize objects.
The constructor is called when an object of a class is created.
It can be used to set initial values for object attributes:
Note that the constructor name must match the class name, and it cannot have a return type (like void).

Also note that the constructor is called when the object is created.

All classes have constructors by default: if you do not create a class constructor yourself, Java creates one for you.
However, then you are not able to set initial values for object attributes.
 */

class Vapor {
  public Vapor() {
    System.out.println("vaporul merge pe mare");
  }
}

class Mare {
  public Mare() {
    int x = 74403;
    System.out.println(x);
  }
}

class Bolean {
  public Bolean(boolean buly) {}
}

public class Constructors {
  int x; // /create a class attribute
  int year;
  String name;

  public Constructors() { // /numele constructorului
    x = 5; // set the initial value for the class attribute
    year = 1992;
    name = "Mercedes";
  }

  public static void main(String[] args) {
    Vapor v = new Vapor(); // vaporul merge pe mare
    Mare moarta = new Mare(); // 74403
    Bolean b = new Bolean(true);
    Constructors obiect = new Constructors();
    System.out.println(obiect.x + " " + obiect.year + " " + obiect.name); // 5 1992 Mercedes
    // System.out.println(v); // MariaD.july.july_5.Vapor@5cad8086
    // System.out.println(moarta); // MariaD.july.july_5.Mare@6e0be858
  }
}
