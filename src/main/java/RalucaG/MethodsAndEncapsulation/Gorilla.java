package RalucaG.MethodsAndEncapsulation;

public class Gorilla {

  public static int counting;

  public static void addGorilla() {
    counting++;
  }

  public void babyGorilla() {
    counting++;
  }

  public void announceBabies() {
    addGorilla();
    babyGorilla();
  }

  public static void announceBabiesToEveryone() {
    addGorilla();
    //  babyGorilla(); // does not compile -- cannot be called from here --need to make it static so
    // it works
  }

  public int total;
  //  public static average = total/counting ; // does not compile

}
