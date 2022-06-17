package RalucaG.ClassDesignOCAChapter5;

public class CardioDoctor extends Doctors {
  String mainSpecialty = "Cardiology";

  public static void main(String[] args) {
    CardioDoctor obj = new CardioDoctor();
    System.out.println(obj.jobTitle);
    System.out.println(obj.hospital);
    System.out.println(obj.mainSpecialty);

    obj.does();
  }
}
