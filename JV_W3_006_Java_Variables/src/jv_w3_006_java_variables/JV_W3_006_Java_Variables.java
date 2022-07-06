/*
Java Variables
Las variables son contenedores para almacenar valores de datos.

En Java, hay diferentes tipos de variables, por ejemplo:

String - almacena texto, como "Hola". Los valores de cadena están rodeados de comillas dobles
int - almacena enteros (números enteros), sin decimales, como 123 o -123
float - almacena números de coma flotante, con decimales, como 19.99 o -19.99
char - almacena caracteres individuales, como 'a' o 'B'. Los valores char están rodeados de comillas simples
boolean - almacena valores con dos estados: true o false
Declarar (crear) variables
Para crear una variable, debe especificar el tipo y asignarle un valor:

Sintaxis
type variableName = value;
Donde type es uno de los tipos de Java (como o ), y variableName es el nombre de la variable (como x o name). El signo igual se utiliza para asignar valores a la variable.intString

Para crear una variable que debería almacenar texto, vea el siguiente ejemplo:

Ejemplo
Cree una variable llamada nombre de tipo y asígnele el valor "John":String

String name = "John";
System.out.println(name);

Para crear una variable que debería almacenar un número, vea el siguiente ejemplo:

Ejemplo
Cree una variable llamada myNum de tipo y asígnele el valor 15:int

int myNum = 15;
System.out.println(myNum);

También puede declarar una variable sin asignar el valor y asignar el valor más adelante:

Ejemplo
int myNum;
myNum = 15;
System.out.println(myNum);

Tenga en cuenta que si asigna un nuevo valor a una variable existente, sobrescribirá el valor anterior:

Ejemplo
Cambie el valor de de a :myNum1520

int myNum = 15;
myNum = 20;  // myNum is now 20
System.out.println(myNum);

Variables finales
Si no desea que otros (o usted mismo) sobrescriban los valores existentes, use la palabra clave (esto declarará la variable como "final" o "constante", lo que significa inmutable y de solo lectura):final

Ejemplo
final int myNum = 15;
myNum = 20;  // will generate an error: cannot assign a value to a final variable

Otros tipos
Una demostración de cómo declarar variables de otros tipos:

Ejemplo
int myNum = 5;
float myFloatNum = 5.99f;
char myLetter = 'D';
boolean myBool = true;
String myText = "Hello";
Obtendrá más información sobre los tipos de datos en la siguiente sección.

Pruébese a sí mismo con ejercicios
Ejercicio:
Cree una variable con nombre y asígnele el valor.carNameVolvo

 
 = 
;

Comience el ejercicio

*/
