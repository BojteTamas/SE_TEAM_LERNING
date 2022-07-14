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
// q10 correct answer B swing swing 10
// q11 corect answers are: B & E
// Q12 : correct answer B
// Q13 : corect 4, eu am gasit 2, mai am de lucru
// Q14: B
// Q15: E
// Q16: B 9
// Q17: B, D, E.
// Q18: Correct C & G, I choosed only G
// q19: corect A & G, eu am ales doar A
// Q 20: corect E
// Q21: corect c
// Q22 :corect E (u u ucrcr), dar la rulare mie codul mi-a rulat ur ur urcc, vezi OrderDriver Class
// Q23:
