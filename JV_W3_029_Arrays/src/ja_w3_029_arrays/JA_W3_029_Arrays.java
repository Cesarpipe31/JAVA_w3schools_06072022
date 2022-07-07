/*
 Java
Matrices Java
Las matrices se utilizan para almacenar varios valores en una sola variable, en lugar de declarar variables separadas para cada valor.

Para declarar una matriz, defina el tipo de variable entre corchetes:

String[] cars;
Ahora hemos declarado una variable que contiene una matriz de cadenas. Para insertarle valores, podemos usar un literal de matriz: coloque los valores en una lista separada por comas, dentro de llaves rizadas:

String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
Para crear una matriz de enteros, puede escribir:

int[] myNum = {10, 20, 30, 40};
Acceso a los elementos de un arreglo de discos
Para acceder a un elemento de matriz, haga referencia al número de índice.

Esta declaración accede al valor del primer elemento en los automóviles:

Ejemplo
String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
System.out.println(cars[0]);
// Outputs Volvo

Nota: Los índices de matriz comienzan con 0: [0] es el primer elemento. [1] es el segundo elemento, etc.

Cambiar un elemento array
To change the value of a specific element, refer to the index number:

Example
cars[0] = "Opel";
Example
String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
cars[0] = "Opel";
System.out.println(cars[0]);
// Now outputs Opel instead of Volvo

Array Length
To find out how many elements an array has, use the property:length

Example
String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
System.out.println(cars.length);
// Outputs 4

Test Yourself With Exercises
Exercise:
Create an array of type called .Stringcars

 
 = {"Volvo", "BMW", "Ford"};

Start the Exercise
*/
