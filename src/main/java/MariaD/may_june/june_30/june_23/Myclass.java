package MariaD.may_june.june_30.june_23;

public class Myclass {
  // method parameters double & int
  double calcul(double nr1, int nr2) {
    return (nr1 + nr2) / 2.0;
  }
  // method parameters int & double
  /*{
      double calcul ( int nr1, double nr2){ ////this code does nor compile
      return (nr1 + nr2) / 2.0;
       }
  }
   */
  // compiler can't determine wich overloade method calcul should be called
  public static void main(String[] args) {
    Myclass myclass = new Myclass();
    myclass.calcul(2, 3);
    System.out.println(myclass); // /
  }
}
