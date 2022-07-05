package RalucaG.RecapOCAChapters;

public class AccessModifiers {
  private String name;

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void display() {
    System.out.println("Display method called here");
  }

  private int number = 24;

  private void displayMessage() {
    System.out.println("Display message written here");
  }

  public static void main(String[] args) {
    AccessModifiers accessModifiers = new AccessModifiers();
    accessModifiers.setName("AccessModifier-setter");
    System.out.println(accessModifiers.getName());

    AccessModifiers obj = new AccessModifiers();
    obj.display();
    // System.out.println(obj.number);// this will not compile because we try to access private data

  }
}
