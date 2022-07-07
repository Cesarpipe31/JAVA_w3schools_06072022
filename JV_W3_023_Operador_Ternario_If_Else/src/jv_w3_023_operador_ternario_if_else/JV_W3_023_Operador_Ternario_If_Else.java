/*
Java Short Hand If...Else (Ternary Operator)
Short Hand If...Else
There is also a short-hand if else, which is known as the ternary operator because it consists of three operands.

It can be used to replace multiple lines of code with a single line, and is most often used to replace simple if else statements:

Syntax
variable = (condition) ? expressionTrue :  expressionFalse;
Instead of writing:

Example
int time = 20;
if (time < 18) {
  System.out.println("Good day.");
} else {
  System.out.println("Good evening.");
}

You can simply write:

Example
int time = 20;
String result = (time < 18) ? "Good day." : "Good evening.";
System.out.println(result);

Test Yourself With Exercises
Exercise:
Insert the missing parts to complete the following "short hand if...else" statement:

int time = 20;
String result = 
time < 18
 
 "Good day." 
 "Good evening.";
System.out.println(result); 

Start the Exercise
*/
package jv_w3_023_operador_ternario_if_else;

public class JV_W3_023_Operador_Ternario_If_Else{
    public static void main(String[] args){
        int time =20;
        String result = (time < 18) ? "Good day." : "Good evening.";
        System.out.println(result);        
    }
}