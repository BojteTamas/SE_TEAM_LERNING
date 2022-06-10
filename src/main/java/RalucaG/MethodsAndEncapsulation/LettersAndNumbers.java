package RalucaG.MethodsAndEncapsulation;

public class LettersAndNumbers {

  public static void main(String[] args) {
    int no = 24;
    String letters = "This is an example of how ...";
    no(no);
    letters = letters(letters);
    System.out.println(no + letters); // 24This is an example of how..... things should be working
    letters = letters + " Is this a conjoint statement?";
    no = no + 1345;

    System.out.println(
        no + "  " + letters); // 1369 This is an example of how...things should be working Is this a
    // conjoint statement?

    letters = "Rewritting the initial value of letters?"; // letters now has this value
    no = 24045; // no now has this value

    System.out.println(no + " " + letters);
  }

  private static int no(int no) {
    no++;
    return no;
  }

  public static String letters(String letters) {
    letters += "...things should be working";
    return letters;
  }
}
