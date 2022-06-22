package CarmenH.classdesignCh5;

public class Cat implements Walk, Run {

  public int getSpeed() { // without implementing this method the code will not compile.
    return 1;
  }
  // the other 2 methods from Run and Walk have different return and the compiler doesn't know which
  // to choose

  public static void main(String[] args) {
    System.out.println(new Cat().getSpeed());
  }
}
