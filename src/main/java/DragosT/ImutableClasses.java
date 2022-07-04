package DragosT;

public class ImutableClasses {
  private int numberEggs;

  public ImutableClasses(int numberEggs) {
    this.numberEggs = numberEggs;
  }

  public int getNumberEggs() {
    return numberEggs;
  }

  private StringBuilder builder;

  public void NotImmutable1(StringBuilder b) {
    builder = b;
  }

  public StringBuilder getBuilder() {
    return builder; // this can be reached same stringbuilder
  }

  public StringBuilder getBuilder1() {
    return new StringBuilder(builder); // this is the correct imutable
  }
}
