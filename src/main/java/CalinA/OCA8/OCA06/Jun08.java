package CalinA.OCA8.OCA06;

public class Jun08 {

  public static void main(String[] args) {
    int a = 5;
    int b = 10;
    int c = 15;

    c = a + b;
    System.out.println("c = a+b =" + c);
    c += a;
    System.out.println("c += a = " + c);
    c -= a;
    System.out.println("c -= a = " + c);
    c *= a;
    System.out.println("c -= a = " + c);
    a = 20;
    c = 30;
    c /= a;
    System.out.println("c /= a = " + c);
    a = 10;
    c = 15;
    c %= a;
    c >>= 1;
    System.out.println("c >>= 1 = " + c);
    c <<= 11;
    System.out.println("c <<= 11 = " + c);
  }
}

// Read from OCA
//        Compound Assignment Operators
//        Relational Operators
