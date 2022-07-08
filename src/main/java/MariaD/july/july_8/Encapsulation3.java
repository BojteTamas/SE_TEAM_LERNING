package MariaD.july.july_8;

import java.util.*;

/*
benefits
The fields of a class can be made read-only or write-only.

A class can have total control over what is stored in its fields.
 */
// encapsulation only in reading
/*
putem folosi metoda getter doar pentru a citi valorile variabilelor private.
nu putem seta valorile variabilei private, deoarece nu am setat si metoda setter
 */

class Account {
  // declaram variabila private
  private int account = 962153;

  public int getAccount() {
    return account;
  }
}

public class Encapsulation3 {
  public static void main(String... args) {
    Account cont = new Account();
    System.out.println("Account number" + " " + cont.getAccount()); // Account number 962153
  }
}
