package RalucaG.ClassDesignOCAChapter5;

public class ClassParent {
  int ageix;

  ClassParent(int ageix) {
    this.ageix = ageix;
  }

  public void getAge() {
    System.out.println("this displays the value of the variable ageix: " + ageix);
  }
}
