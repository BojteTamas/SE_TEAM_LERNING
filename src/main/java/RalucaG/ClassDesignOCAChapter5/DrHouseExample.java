package RalucaG.ClassDesignOCAChapter5;

public class DrHouseExample extends DoctorHouse {
  String specialty = "double specialty in infectious disease and nephrology.";

  public static void main(String[] args) {
    DrHouseExample object = new DrHouseExample();
    System.out.println(object.getJobTitle());
    System.out.println(object.getHospital());
    System.out.println(object.specialty);
    object.does();
  }
}
