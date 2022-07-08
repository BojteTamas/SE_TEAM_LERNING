package MariaD.july.july_8;

import java.util.*;

/*
encapsulation only in writing
se foloseste doar setter, nu si getter
se poate seta valoarea, dar nu se poate citi
 */
class AccountNo {
  // setam variabila private
  private int account;

  /* public int getAccountNo(){
      return account;
  }
  */
  public void setAccountNo(int numar) {
    this.account = numar;
  }
}

public class Encapsulation4 {
  public static void main(String... args) {
    AccountNo a = new AccountNo();
    a.setAccountNo(23467);
    /*System.out.println(a.getAccountNo());//la print da eroare, pentru ca nu avem getaccount no.,
    sa putem citi
    */
  }
}
