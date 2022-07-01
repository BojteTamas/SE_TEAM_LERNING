package MariaD.may_june.june_30;

/*
Method overloading - different method signatures with the same name but different type parameters.
it means there can be different access modifiers, specifiers (like static), return types, and exception lists.
 */

public class Overloading_method {
  public void fluture(int fluturas) {
    fluturas = 6;
    System.out.println(fluturas);
  }

  public void fluture(short aripi) {
    aripi = 10000;
    System.out.println(aripi);
  }

  public boolean fluture() {
    return true;
  }

  void fluture(int fluturas, short aripi) {}

  public static void main(String[] args) {
    Overloading_method metoda = new Overloading_method();
    metoda.fluture('a'); // 6
    metoda.fluture(
        'b'); // 6///de ce a printat tot 6 si nu a printat 100000, si de ce nu pot sa pun aripi, imi
    // da tot fluture?
  }
}
