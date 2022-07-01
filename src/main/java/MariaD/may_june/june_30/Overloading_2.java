package MariaD.may_june.june_30;

class Overloading {
  public void display(char c) {
    System.out.println(c);
  }

  public void display(int c) {
    System.out.println(c);
  }

  public void display(String c) {
    System.out.println(c);
  }

  public boolean display(boolean c) {
    return true;
  }
}

public class Overloading_2 {
  public static void main(String[] args) {
    Overloading obiect = new Overloading();
    obiect.display('a'); // a
    obiect.display(1000); // 1000
    obiect.display("vine vacanta"); // vine vacanta
    obiect.display(true);
  }
}
