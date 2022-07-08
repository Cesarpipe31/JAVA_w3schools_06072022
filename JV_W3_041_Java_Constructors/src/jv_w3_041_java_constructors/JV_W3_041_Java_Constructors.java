/*
Java Constructors
Java Constructors
A constructor in Java is a special method that is used to initialize objects. The constructor is called when an object of a class is created. It can be used to set initial values for object attributes:

Example
Create a constructor:

// Create a Main class
public class Main {
  int x;  // Create a class attribute

  // Create a class constructor for the Main class
  public Main() {
    x = 5;  // Set the initial value for the class attribute x
  }

  public static void main(String[] args) {
    Main myObj = new Main(); // Create an object of class Main (This will call the constructor)
    System.out.println(myObj.x); // Print the value of x
  }
}

// Outputs 5
 

Note that the constructor name must match the class name, and it cannot have a return type (like ). void

Also note that the constructor is called when the object is created.

All classes have constructors by default: if you do not create a class constructor yourself, Java creates one for you. However, then you are not able to set initial values for object attributes.

Constructor Parameters
Constructors can also take parameters, which is used to initialize attributes.

The following example adds an parameter to the constructor. Inside the constructor we set x to y (x=y). When we call the constructor, we pass a parameter to the constructor (5), which will set the value of x to 5:int y

Example
public class Main {
  int x;

  public Main(int y) {
    x = y;
  }

  public static void main(String[] args) {
    Main myObj = new Main(5);
    System.out.println(myObj.x);
  }
}

// Outputs 5
 

You can have as many parameters as you want:

Example
public class Main {
  int modelYear;
  String modelName;

  public Main(int year, String name) {
    modelYear = year;
    modelName = name;
  }

  public static void main(String[] args) {
    Main myCar = new Main(1969, "Mustang");
    System.out.println(myCar.modelYear + " " + myCar.modelName);
  }
}

// Outputs 1969 Mustang
*/

package jv_w3_041_java_constructors;

// Create a JV_W3_041_Java_Constructors Class

public class JV_W3_041_Java_Constructors{
    int x;  //Create a class attribute
    
    // Create a class constructor for the Main Class
    public JV_W3_041_Java_Constructors() {
        x = 5;  // Set the initial value for the class attribute x
    }
    
    public statis void main(String[] args){
        JV_W3_041_Java_Constructors my Obj = new JV_W3_041_Java_Constructors(); // Create an object of class Main (This will call the constructor)
        System.out.println(myObj.x); // Print the value of x
    }
}