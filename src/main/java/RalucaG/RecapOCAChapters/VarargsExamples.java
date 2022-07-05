package RalucaG.RecapOCAChapters;

public class VarargsExamples {
  // return_type_method_name(data_type... variableName){} => syntax of varargs
  static void display(String... diverse) {
    System.out.println("display method is called here");
  }

  static void displayAnother(String... divers) {
    System.out.println("display method is called here_2");
    for (String s : divers) {
      System.out.println(s); // using the for to list the params
    }
  }

  static void displaySomething(int... x) {
    System.out.println("Number of params: " + x.length);
    // list each element of x
    for (int element : x) {
      System.out.println(element);
    }
  }

  public static void main(String[] args) {
    display();
    display("diverse1", "diverse2", "diverse3"); // we can give multiple params to method
    displayAnother();
    displayAnother("divers Another"); // one param
    displayAnother(
        "diversAnother1", "diversAnother2", "DiversAnother3"); // multiple params to method
    // takes the variable name of parameters;it can only take integer values
    displaySomething(24); // 1 param
    displaySomething(1, 24, 20, 8, 5); // 5 param
    displaySomething(); // no param
  }
}
