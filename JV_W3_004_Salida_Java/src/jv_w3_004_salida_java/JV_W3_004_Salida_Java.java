/*
Java Output
Java Output
You learned from the previous chapter that you can use the println() method to output values or print text in Java:

Example
System.out.println("Hello World!");

You can add as many println() methods as you want. Note that it will add a new line for each method:

Example
System.out.println("Hello World!");
System.out.println("I am learning Java.");
System.out.println("It is awesome!");

You can also output numbers, and perform mathematical calculations:

Example
System.out.println(3 + 3);

Note that we don't use double quotes ("") inside println() to output numbers.

The Print() Method
There is also a print() method, which is similar to println().

The only difference is that it does not insert a new line at the end of the output:

Example
System.out.print("Hello World! ");
System.out.print("I will print on the same line.");

Note that we add an extra space (after "Hello World!" in the example above), for better readability.

In this tutorial, we will only use println() as it makes it easier to read the output of code.
*/

package jv_w3_004_salida_java;

public class JV_W3_004_Salida_Java{
    public static void main (String[] arg){
        System.out.println ("Hello World");
        System.out.println ("I am learning Java.");
        System.out.println("It is awesome!");
        System.out.println(3+3);                        
    }
}
    
    