package MariaD.may_june.june_30.june_23;

/*class Angajat {
    {
        System.out.println("Angajatul e INITIALIZER");
    }
}
public class Initializare {
    public static void main(String[] args){
        Angajat E = new Angajat();
        System.out.println(E);/////Angajatul e INITIALIZER
    }
}
 */

class Angajat_din_nou {
  Angajat_din_nou() {
    System.out.println("Angajat: CONSTRUCTOR");
    System.out.println("Angajat din nou : INITIALIZARE");
  }
}

class Initializare {
  public static void main(String[] args) {
    Angajat_din_nou E =
        new Angajat_din_nou(); //// Angajat: CONSTRUCTOR   Angajat din nou : INITIALIZARE
  }
}
