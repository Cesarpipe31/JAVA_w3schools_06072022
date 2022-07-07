/*
 MYPAGE
Java For Each Loop
For-Each Loop
There is also a "for-each" loop, which is used exclusively to loop through elements in an array:

Syntax
for (type variableName : arrayName) {
  // code block to be executed
}
The following example outputs all elements in the cars array, using a "for-each" loop:

Example
String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
for (String i : cars) {
  System.out.println(i);
}

Note: Don't worry if you don't understand the example above. You will learn more about Arrays in the Java Arrays chapter.

*/


package jv_w3_027_for_each_loops;

public class JV_W3_027_For_Each_Loops{
    public static void main(String[] args){
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        for (String i: cars){
            System.out.println(i);
        }
    }
}
