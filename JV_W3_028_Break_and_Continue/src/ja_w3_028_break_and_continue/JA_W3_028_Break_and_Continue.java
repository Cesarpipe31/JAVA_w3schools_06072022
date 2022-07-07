/*
Java Break and Continue
Java Break
You have already seen the break statement used in an earlier chapter of this tutorial. It was used to "jump out" of a switch statement.

The break statement can also be used to jump out of a loop.

This example stops the loop when i is equal to 4:

Example
for (int i = 0; i < 10; i++) {
  if (i == 4) {
    break;
  }
  System.out.println(i);
}
 

Java Continue
The continue statement breaks one iteration (in the loop), if a specified condition occurs, and continues with the next iteration in the loop.

This example skips the value of 4:

Example
for (int i = 0; i < 10; i++) {
  if (i == 4) {
    continue;
  }
  System.out.println(i);
}
 

Break and Continue in While Loop
You can also use break and continue in while loops:

Break Example
int i = 0;
while (i < 10) {
  System.out.println(i);
  i++;
  if (i == 4) {
    break;
  }
}
 

Continue Example
int i = 0;
while (i < 10) {
  if (i == 4) {
    i++;
    continue;
  }
  System.out.println(i);
  i++;
}
 

Test Yourself With Exercises
Exercise:
Stop the loop if i is 5.

for (int i = 0; i < 10; i++) {
  if (i == 5) {   
    
;
  }
  System.out.println(i);
}

Start the Exercise


*/

package ja_w3_028_break_and_continue;

public class JA_W3_028_Break_and_Continue{
    public static void main(String[] args){
    System.out.println("-------- \" Break \" -----------");
    for (int i = 0; i < 10; i++) {
        if (i == 4){
            break;
        }
        System.out.println(i);
    }
    
    System.out.println("-------- \" Continue \" -----------");
    
    for (int j = 0; j < 10; j++){
        if(j == 4){
            continue;
        }
        System.out.println(j);
    }

 System.out.println("-------- \" Break and Continue \" -----------");
 int m = 0;
 while (m < 10) {
     System.out.println(m);
     m++;
     if (m == 4){
         break;
     }
 }
 
 System.out.println("-------- \" Continue Example \" -----------");
 
 int n = 0;
 while (n < 10){
     if (n== 4){
         n++;
         continue;
     }
     System.out.println(n);
     n++;
 }
}
}