package DragosT;

public class StaticVsInstance {
  public static int count;

  public static void count1() {
    count++;
  }

  public void count2() {
    count++;
  }

  public void announceCounts() {
    count1();
    count2();
  }

  public static void announceCountsToEveryone() {
    count1();
    // count2(); // DOES NOT COMPILE a static method is calling an instance method
  }

  public static int total;
  // public static average = total / count; // DOES NOT COMPILE a static variable is
  // calling an instance variable

}
