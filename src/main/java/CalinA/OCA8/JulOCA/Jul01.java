package CalinA.OCA8.JulOCA;

public class Jul01 {
  private String name;
  private int age;

  public Jul01 setName(String name) {
    this.name = name;
    return this;
  }

  public Jul01 setAge(int age) {
    this.age = age;
    return this;
  }

  public void introduce() {
    System.out.println("My name is " + name + " and my age is " + age + " years old.");
  }

  public static void main(String[] args) {
    Jul01 person = new Jul01();
    person.setName("Calin").setAge(32).introduce();
  }
}

// Read from OCA
//        Method Chaining
