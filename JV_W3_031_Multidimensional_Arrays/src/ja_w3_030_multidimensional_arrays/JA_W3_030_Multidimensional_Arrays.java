/*
Java Multi-Dimensional Arrays
Multidimensional Arrays
A multidimensional array is an array of arrays.

To create a two-dimensional array, add each array within its own set of curly braces:

Example
int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };
myNumbers is now an array with two arrays as its elements.

To access the elements of the myNumbers array, specify two indexes: one for the array, and one for the element inside that array. This example accesses the third element (2) in the second array (1) of myNumbers:

Example
int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };
int x = myNumbers[1][2];
System.out.println(x); // Outputs 7

We can also use a inside another to get the elements of a two-dimensional array (we still have to point to the two indexes):for loopfor loop

Example
public class Main {
  public static void main(String[] args) {
    int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };
    for (int i = 0; i < myNumbers.length; ++i) {
      for(int j = 0; j < myNumbers[i].length; ++j) {
        System.out.println(myNumbers[i][j]);
      }
    }
  }
}

Test Yourself With Exercises
Exercise:
Insert the missing part to create a two-dimensional array.

 myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };

Start the Exercise
*/

package ja_w3_030_multidimensional_arrays;

public class JA_W3_030_Multidimensional_Arrays

/*{
  public static void main(String[] args) {
    int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };
    for (int i = 0; i < myNumbers.length; ++i) {
      for(int j = 0; j < myNumbers[i].length; ++j) {
        System.out.println(myNumbers[i][j]);
      }
    }
  }
}*/

{
    public static void main(String[]args){
        int[][] myNumbers = {{1,2,3,4}, {5,6,7}};
        for (int i=0; i < myNumbers.length; ++i) {
            for (int j=0; j < myNumbers[i].length; ++j){
                System.out.println(myNumbers[i][j]);
            }
        }
    }
}