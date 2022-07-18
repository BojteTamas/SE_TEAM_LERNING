package RalucaG.RecapOCAChapters;

public class SlipknotFan {
  public boolean goesToConcert;
  public String name;

  public SlipknotFan(boolean goesToConcert, String name) {
    this.goesToConcert = goesToConcert;
    this.name = name;
  }

  public void goes() {
    System.out.println("Will a Slipknot fan go to the band's concert at Romexpo?" + goesToConcert);
  }

  public void displayFanName() {
    System.out.println("Name of the Slipknot Fan is: " + name);
  }
}
