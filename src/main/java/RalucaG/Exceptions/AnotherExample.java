package RalucaG.Exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class AnotherExample {
  public static void main(String[] args) {
    boolean doctorShown;
    doctorShown = true;
    boolean patientShown;
    patientShown = false;
    try {
      int keptAppointment = 0; // yes = 0 and no =1;
      if (doctorShown && patientShown) {
        keptAppointment++;
        System.out.println("Patient didn't show up for appointmnet");
      } else if (doctorShown && patientShown) {
        keptAppointment = 0;
        System.out.println("Doctor didn't show up for appointment");
      }
    } catch (Exception e) {
      System.out.println("Doctor and patient both didn't show up -- no refund necessary!");
    }
    boolean appointmentValidation = false;
    //  boolean appointment = false;
    do {
      try {
        System.out.print("Did you manage to keep you appointment");
        Scanner scanner = new Scanner(System.in);
        boolean appointment = scanner.nextBoolean();
        if (appointment == true) {
          System.out.println("Patient kept appointment");
        } else if (appointment == false) {
          System.out.println("Patient didn't keep appointment");
        }

      } catch (InputMismatchException e) {
        System.out.println("Invalid input!");
      }
    } while (appointmentValidation == true);
  }
}
