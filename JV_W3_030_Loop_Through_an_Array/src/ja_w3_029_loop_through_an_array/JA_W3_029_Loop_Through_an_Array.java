/*
Java Arrays Loop
Loop Through an Array
You can loop through the array elements with the loop, and use the property to specify how many times the loop should run.forlength

The following example outputs all elements in the cars array:

Example
String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
for (int i = 0; i < cars.length; i++) {
  System.out.println(cars[i]);
}

Loop Through an Array with For-Each
There is also a "for-each" loop, which is used exclusively to loop through elements in arrays:

Syntax
for (type variable : arrayname) {
  ...
}
The following example outputs all elements in the cars array, using a "for-each" loop:

Example
String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
for (String i : cars) {
  System.out.println(i);
}

The example above can be read like this: for each element (called i - as in index) in cars, print out the value of i.String

If you compare the loop and for-each loop, you will see that the for-each method is easier to write, it does not require a counter (using the length property), and it is more readable.for

Test Yourself With Exercises
Exercise:
Loop through the items in the array.cars

String[] cars = {"Volvo", "BMW", "Ford"};
 (String i : 
) {
  System.out.println(i);
}

Start the Exercise


*/
