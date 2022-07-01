package MariaD.may_june.june_30.june_22;

// The private access modifier is accessible only within the class.
/*class A {
  private int data = 20;

  private void mesaj() {
    System.out.println("buna!!!!");
  }
}

public class Private_modifier {
  public static void main(String[] args) {
    A obiect = new A();
    System.out.println(obiect.data); // /ERROR!!!java: data has private access in MariaD.may_june.june_30.june_22.A
    /// clasa A contine private data member si private method
    // accesam metodele din afara clasei
  }
}
 */

/// A class cannot be private or protected except nested class.
/*class A {
  private A() {} // //PRIVATE CONSTRUCTOR

  void message() {
    System.out.println("bunaaa");
  }
}

public class Private_modifier {
  public static void main(String[] args) {
    A obiect = new A(); // /java: A() has private access in MariaD.may_june.june_30.june_22.A
  }
}
 */

/// asa e corect!
public class Private_modifier {
  public static void main(String[] args) {
    A obiect = new A();
    System.out.println(obiect.data); // 20
  }

  static class A {
    private int data = 20;

    private void mesaj() {
      System.out.println("buna!!!!");
    }
  }
}
