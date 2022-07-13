package MariaD.july.july_13;

import java.util.*;

// q1 C, corect answer b & c
// q2 A, C, D , corect answer only A, D
// q3 B, D, corect a, c, d
// Q4 a, b, CORECT: A, B, G
// Q5 B - INCORECT, CORECT: D, G
// Q6 --CORRECT ANSWER D "You can use access modifiers to allow read access to all methods, but not
// any instance variables."
// Q7 ---din cauza liniei 16, nu ruleaza codul, cum apare mai jos merge si ruleaza
class Test2 {
  private int roomNumber;

  protected String teacherName;
  static int globalKey = 54321;
  public int floor = 3;
  //  Test1  {
  //  {
  //    (int r, String t)
  //   roomNumber = r;
  // teacherName = t;
  // }
}
//  }

public class Test1 {
  public static void main(String[] args) {

    System.out.println(Test2.globalKey); // 54321

    Test2 room = new Test2();
    // System.out.println(room.roomNumber);
    //        System.out.println(room.floor);//3
    System.out.println(room.teacherName); // null
  }
}

// Q8: C, E, correct answer: B,C,E
// Q9: public void setCanSwim(boolean b) { canSwim = b;}, CORRECT E & C. public int getNumWings() {
// return numberWings;}
