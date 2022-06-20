package DragosT;

public class StaticVariablesAndInitialisation {
  private static int counter = 0; // counters can be modified
  private static final int NUM_CONSTANT = 54; // constants  have final before type and are
  // wrtitten in captial with _ instead of spaces and can't be modified
  private static final int NUM_SECONDS_PER_HOUR;
  private static final int eight = 8;
  // the delcaration of NUM_SECONDS_PER_HOUR const is done without initialisation
  // it is initialised below under the static {} keyword and will be run the first time
  // the class is used, assigning the values
  static {
    int numSecondsPerMinute = 60;
    int numMinutesPerHour = 60;
    NUM_SECONDS_PER_HOUR = numSecondsPerMinute * numMinutesPerHour;
    // eight = 4; will not compile as it was already assigned a val for the variable eight
    // if it is final it will remain like that
  }

  public static void main(String[] args) {
    counter++; // is correct
    System.out.println(counter);
    // NUM_CONSTANT = 51; // this will not be compiled
    System.out.println(NUM_CONSTANT);
    System.out.println(NUM_SECONDS_PER_HOUR);
    System.out.println(eight);
  }
}
