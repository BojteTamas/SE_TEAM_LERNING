package RalucaG.ClassDesignOCAChapter5;

public class TalentShow implements Singing, Dancing {
  public void print() {
    System.out.println(
        "All contestants must dance and sing for the qualification in the talent show!");
  }

  public static void main(String[] args) {
    TalentShow talentShow = new TalentShow();
    talentShow.print();
  }
}
