package RalucaG.MethodsAndEncapsulation;

public class StaticVariables {

  static int counter = 0;

  public void increment() {
    counter++;
  }

  public static void main(String args[]) {
    StaticVariables obj1 = new StaticVariables();
    StaticVariables obj2 = new StaticVariables();
    obj1.increment(); // initial it was 2
    obj2.increment(); // initial it was 2
    StaticVariables obj3 = new StaticVariables();
    obj3.equals(obj2);
    obj2.increment(); // here it gets to 4, initial it was 2, then 3
    obj3.increment(); // here it gets to 4

    System.out.println("Obj1: count is= " + obj1.counter);
    System.out.println("Obj2: count is= " + obj2.counter);
    System.out.println("Obj3: count is= " + obj3.counter);
  }
}
