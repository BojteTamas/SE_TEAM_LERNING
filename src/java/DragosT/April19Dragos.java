public class April19Dragos {

//  2. Adding Multiple Terms to the for Statement
int x = 0;
    for(long y = 0, z = 4; x < 5 && y < 10; x++, y++) { System.out.print(y + " ");
} System.out.print(x);

//  3. Redeclaring a Variable in the Initialization Block
int x = 0;
for(long y = 0, x = 4; x < 5 && y < 10; x++, y++) {
        System.out.print(x + " "); }
//does not work becouse of a double initialization of varible x


int x = 0;
long y = 10;
for(y = 0, x = 4; x < 5 && y < 10; x++, y++) {
    System.out.print(x + " "); }
//will work

//4. Using Incompatible Data Types in the Initialization Block
for(long y = 0, int x = 4; x < 5 && y<10; x++, y++) {
// DOES NOT COMPILE System.out.print(x + " ");
// variables in the initialization block must all be of the same type
}

//5. Using Loop Variables Outside the Loop
for(long y = 0, x = 4; x < 5 && y < 10; x++, y++) {
    System.out.print(y + " ");
}
System.out.print(x); // DOES NOT COMPILE out of scope

}