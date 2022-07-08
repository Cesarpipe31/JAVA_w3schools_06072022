/*
Java Classes and Objects
Java Classes/Objects
Java is an object-oriented programming language.

Everything in Java is associated with classes and objects, along with its attributes and methods. For example: in real life, a car is an object. The car has attributes, such as weight and color, and methods, such as drive and brake.

A Class is like an object constructor, or a "blueprint" for creating objects.

Create a Class
To create a class, use the keyword :class

Main.java
Create a class named "" with a variable x:Main

public class Main {
  int x = 5;
}
Remember from the Java Syntax chapter that a class should always start with an uppercase first letter, and that the name of the java file should match the class name.

Create an Object
In Java, an object is created from a class. We have already created the class named , so now we can use this to create objects. Main

To create an object of , specify the class name, followed by the object name, and use the keyword :Mainnew

Example
Create an object called "" and print the value of x:myObj

public class Main {
  int x = 5;

  public static void main(String[] args) {
    Main myObj = new Main();
    System.out.println(myObj.x);
  }
}
 

Multiple Objects
You can create multiple objects of one class:

Example
Create two objects of :Main

public class Main {
  int x = 5;

  public static void main(String[] args) {
    Main myObj1 = new Main();  // Object 1
    Main myObj2 = new Main();  // Object 2
    System.out.println(myObj1.x);
    System.out.println(myObj2.x);
  }
}
 
 

Using Multiple Classes
You can also create an object of a class and access it in another class. This is often used for better organization of classes (one class has all the attributes and methods, while the other class holds the method (code to be executed)). main()

Remember that the name of the java file should match the class name. In this example, we have created two files in the same directory/folder:

Main.java
Second.java
Main.java
public class Main {
  int x = 5;
}
Second.java
class Second {
  public static void main(String[] args) {
    Main myObj = new Main();
    System.out.println(myObj.x);
  }
}
When both files have been compiled:

C:\Users\Your Name>javac Main.java
C:\Users\Your Name>javac Second.java
Run the Second.java file:

C:\Users\Your Name>java Second
And the output will be:

5
You will learn much more about classes and objects in the next chapters.

Test Yourself With Exercises
Exercise:
Create an object of called .MyClassmyObj

 
 = new 
();

Start the Exercise


*/

