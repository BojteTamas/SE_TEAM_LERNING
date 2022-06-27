package DragosT;

public class OverloadingConstructors {
  private String color;
  private int weight;
  private String genre;

  public OverloadingConstructors(int weight) {
    this.weight = weight;
    color = "brown";
  }
  // this second constructors is valid but duplicates the first but is valid to show overloading
  public OverloadingConstructors(int weight, String color, String genre) {
    this.weight = weight;
    this.color = color;
    this.genre = genre;
  }
  // We can build it like this (Not working ask about)
  //    public OverloadingConstructors(int weight) {
  //        this(weight,"brown",genre);
  //    }
}
