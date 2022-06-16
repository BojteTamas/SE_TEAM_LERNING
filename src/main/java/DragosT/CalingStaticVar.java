package DragosT;

public class CalingStaticVar {
  public static void main(String[] args) {
    StaticMethodsAndFields.main(new String[0]); // call the main form other class / will print 0
    System.out.println(
        StaticMethodsAndFields.count); // call the variable form other class / will print 0
    StaticMethodsAndFields.count = 5;
    System.out.println(StaticMethodsAndFields.count); // will print 5
    // and is the same instance of the count from the other class

  }
}
