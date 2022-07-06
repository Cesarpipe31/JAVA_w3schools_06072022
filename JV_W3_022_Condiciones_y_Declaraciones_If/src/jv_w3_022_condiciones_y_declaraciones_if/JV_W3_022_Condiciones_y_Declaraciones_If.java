/*
Condiciones de Java y declaraciones If
Java soporta las condiciones lógicas habituales de las matemáticas:

Menos que: a < b
Menor o igual que: a <= b
Mayor que: a > b
Mayor o igual que: a >= b
Igual a a == b
No es igual a: a != b
Puede utilizar estas condiciones para realizar diferentes acciones para diferentes decisiones.

Java tiene las siguientes instrucciones condicionales:

Se utiliza para especificar un bloque de código que se va a ejecutar, si se cumple una condición especificadaif
Se utiliza para especificar un bloque de código que se va a ejecutar, si la misma condición es falseelse
Se usa para especificar una nueva condición para probar, si la primera condición es falsaelse if
Se utiliza para especificar muchos bloques de código alternativos que se van a ejecutarswitch
La declaración if
Utilice la instrucción para especificar un bloque de código Java que se ejecutará si una condición es .iftrue

Sintaxis
if (condition) {
  // block of code to be executed if the condition is true
}
Tenga en cuenta que está en minúsculas. Las letras mayúsculas (If o IF) generarán un error.if

En el siguiente ejemplo, probamos dos valores para averiguar si 20 es mayor que 18. Si la condición es , imprima algún texto:true

Ejemplo
if (20 > 18) {
  System.out.println("20 is greater than 18");
}

We can also test variables:

Example
int x = 20;
int y = 18;
if (x > y) {
  System.out.println("x is greater than y");
}

Example explained
In the example above we use two variables, x and y, to test whether x is greater than y (using the operator). As x is 20, and y is 18, and we know that 20 is greater than 18, we print to the screen that "x is greater than y".>

The else Statement
Use the statement to specify a block of code to be executed if the condition is .elsefalse

Syntax
if (condition) {
  // block of code to be executed if the condition is true
} else {
  // block of code to be executed if the condition is false
}
Example
int time = 20;
if (time < 18) {
  System.out.println("Good day.");
} else {
  System.out.println("Good evening.");
}
// Outputs "Good evening."
 

Example explained
In the example above, time (20) is greater than 18, so the condition is . Because of this, we move on to the condition and print to the screen "Good evening". If the time was less than 18, the program would print "Good day".falseelse

The else if Statement
Use the statement to specify a new condition if the first condition is .else iffalse

Syntax
if (condition1) {
  // block of code to be executed if condition1 is true
} else if (condition2) {
  // block of code to be executed if the condition1 is false and condition2 is true
} else {
  // block of code to be executed if the condition1 is false and condition2 is false
}
Example
int time = 22;
if (time < 10) {
  System.out.println("Good morning.");
} else if (time < 20) {
  System.out.println("Good day.");
} else {
  System.out.println("Good evening.");
}
// Outputs "Good evening."
 

Example explained
In the example above, time (22) is greater than 10, so the first condition is . The next condition, in the statement, is also , so we move on to the condition since condition1 and condition2 is both - and print to the screen "Good evening".falseelse iffalseelsefalse

However, if the time was 14, our program would print "Good day."

Test Yourself With Exercises
Exercise:
Imprima "Hello World" si es mayor que .xy

int x = 50;
int y = 10;
 (x 
 y) {
  System.out.println("Hello World");
}

Comience el ejercicio
*/
package jv_w3_022_condiciones_y_declaraciones_if;
        
public class JV_W3_022_Condiciones_y_Declaraciones_If{
    public static void main (String[] args){
        int x = 50;
        int y = 10;
        if(x > y) {
            System.out.println("Hello Wordl");
            }
            else 
            {
               System.out.println("Todo bien, todo bien!");
            }
        }
    
}
