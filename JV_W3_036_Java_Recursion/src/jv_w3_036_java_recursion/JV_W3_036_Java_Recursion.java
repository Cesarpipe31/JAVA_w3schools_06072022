/*
Java Recursion
Java Recursion
Recursion is the technique of making a function call itself. This technique provides a way to break complicated problems down into simple problems which are easier to solve.

Recursion may be a bit difficult to understand. The best way to figure out how it works is to experiment with it.

Recursion Example
Adding two numbers together is easy to do, but adding a range of numbers is more complicated. In the following example, recursion is used to add a range of numbers together by breaking it down into the simple task of adding two numbers:

Example
Use recursion to add all of the numbers up to 10.

public class Main {
  public static void main(String[] args) {
    int result = sum(10);
    System.out.println(result);
  }
  public static int sum(int k) {
    if (k > 0) {
      return k + sum(k - 1);
    } else {
      return 0;
    }
  }
}

Example Explained
When the function is called, it adds parameter to the sum of all numbers smaller than and returns the result. When k becomes 0, the function just returns 0. When running, the program follows these steps:sum()kk

10 + sum(9)
10 + ( 9 + sum(8) )
10 + ( 9 + ( 8 + sum(7) ) )
...
10 + 9 + 8 + 7 + 6 + 5 + 4 + 3 + 2 + 1 + sum(0)
10 + 9 + 8 + 7 + 6 + 5 + 4 + 3 + 2 + 1 + 0
Since the function does not call itself when is 0, the program stops there and returns the result.k

Halting Condition
Just as loops can run into the problem of infinite looping, recursive functions can run into the problem of infinite recursion. Infinite recursion is when the function never stops calling itself. Every recursive function should have a halting condition, which is the condition where the function stops calling itself. In the previous example, the halting condition is when the parameter becomes 0.k

It is helpful to see a variety of different examples to better understand the concept. In this example, the function adds a range of numbers between a start and an end. The halting condition for this recursive function is when end is not greater than start:

Example
Use recursion to add all of the numbers between 5 to 10.

public class Main {
  public static void main(String[] args) {
    int result = sum(5, 10);
    System.out.println(result);
  }
  public static int sum(int start, int end) {
    if (end > start) {
      return end + sum(start, end - 1);
    } else {
      return end;
    }
  }
}

The developer should be very careful with recursion as it can be quite easy to slip into writing a function which never terminates, or one that uses excess amounts of memory or processor power. However, when written correctly recursion can be a very efficient and mathematically-elegant approach to programming.

*/

package jv_w3_036_java_recursion;

public class JV_W3_036_Java_Recursion{
    public static void main(String[] args){
        int result = sum(10);
        System.out.println("--- Suma de 1 a 10, con recursión ---");
        System.out.println(result);
        System.out.println("--- Suma de 5 a 10, con recursión ---");
        int result1 = sum1(5, 10);
        System.out.println(result1);
    }
    
    public static int sum(int k) {
        if(k > 0){
            return k + sum(k - 1);
        } else {
            return 0;
        }
    }
    
    public static int sum1(int start, int end){
        if(end > start){
            return end + sum1(start, end - 1);
        } else {
            return end;
        }
    }
    
}
