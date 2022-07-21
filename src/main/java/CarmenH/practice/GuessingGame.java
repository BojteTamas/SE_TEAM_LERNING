package CarmenH.practice;

import javax.swing.*; // for JOptionPane - JOptionPane makes it easy to pop up a standard dialog box

// that prompts users for a value or informs them of something.

public class GuessingGame {
  // main method
  public static void main(String[] args) {
    int computerNumber = (int) (Math.random() * 100 + 1); // generate random num
    /** MAth.random() - generates a double between 0 and 1 we add 1 to exclude 0 */
    int userAnswer = 0; // initialize
    // log correct answer to console for verification
    System.out.println(
        "The correct guess would be " + computerNumber); // here is set the number to guess
    int count = 1; // initialize the number of guesses
    // Display input dialog until the user guesses the correct number
    while (userAnswer != computerNumber) // while the answer is different than the set number
    {
      String response =
          JOptionPane.showInputDialog(
              null,
              "Enter a guess between 1 and 100",
              "Guessing Game",
              3); // display initial input dialog to user
      userAnswer =
          Integer.parseInt(response); // convert string to int for use in check method below
      // pass userAnswer and the Compter gen number along with guess count to method
      JOptionPane.showMessageDialog(null, "" + determineGuess(userAnswer, computerNumber, count));
      count++; // increment number of tries for each attempt
    }
  }

  // Determine guess function to check how close number is to generated number and display try count
  public static String determineGuess(int userAnswer, int computerNumber, int count) {
    if (userAnswer <= 0 || userAnswer > 100) {
      return "Your guess is invalid";
    } else if (userAnswer == computerNumber) {
      return "Correct!\nTotal Guesses: " + count;
    } else if (userAnswer > computerNumber) {
      return "Your guess is too high, try again.\nTry Number: " + count;
    } else if (userAnswer < computerNumber) {
      return "Your guess is too low, try again.\nTry Number: " + count;
    } else {
      return "Your guess is incorrect\nTry Number: " + count;
    }
  }
}
