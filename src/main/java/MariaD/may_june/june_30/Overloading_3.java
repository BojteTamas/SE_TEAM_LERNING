package MariaD.may_june.june_30;

class Overloading1 {
  public void display(char litere, int number) {
    System.out.println("prima metoda overloading");
  }

  public void display(int number, char c) {
    System.out.println("a doua metoda overloading");
  }
}

public class Overloading_3 {
  public static void main(String[] args) {
    Overloading1 metoda = new Overloading1();
    metoda.display('a', 2); // prima metoda overloading
    metoda.display(3, 'b'); // a doua metoda overloading
  }
}
