package RalucaG.MethodsAndEncapsulation;
// another example of initialization to follow the order of the init
// constructors -- static -- blocks

/**
 * Instance Initialization Blocks : used to initialize instance variables, executed before
 * constructors. They run each time when an object of the class is created.
 *
 * <p>Initializer block : the code that is always executed whenever an instance is created. It is
 * used to declare/initialize the common part of various constructors of a class.
 *
 * <p>Constructors : are used to initialize the object’s state. Like methods, a constructor also
 * contains collection of statements(i.e. instructions) that are executed at time of Object
 * creation.
 */
public class AnotherInitialization {
  AnotherInitialization(int x) {
    System.out.println("We declare an int here and we print out text");
  }

  AnotherInitialization() {
    System.out.println("We don't declare anything here but we print text.");
  }

  static {
    System.out.println("This should be a static init");
  }

  {
    System.out.println("Will this be an instance init");
  }

  {
    System.out.println("This is also an instance init");
  }

  static {
    System.out.println("This is also a static init");
  }

  public static void main(String[] args) {
    new AnotherInitialization();
    new AnotherInitialization(4);
  }
}
