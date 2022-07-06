/*

Salida Java
Aprendió del capítulo anterior que puede usar el método para generar valores o imprimir texto en Java:println()

Ejemplo
System.out.println("Hello World!");

Puede agregar tantos métodos como desee. Tenga en cuenta que agregará una nueva línea para cada método:println()

Ejemplo
System.out.println("Hello World!");
System.out.println("I am learning Java.");
System.out.println("It is awesome!");

También puede generar números y realizar cálculos matemáticos:

Ejemplo
System.out.println(3 + 3);

Tenga en cuenta que no usamos comillas dobles () dentro de los números de salida.""println()

El método Print()
También hay un método, que es similar a .print()println()

La única diferencia es que no inserta una nueva línea al final de la salida:

Ejemplo
System.out.print("Hello World! ");
System.out.print("I will print on the same line.");

Tenga en cuenta que agregamos un espacio adicional (después de "¡Hola mundo!" en el ejemplo anterior), para una mejor legibilidad.

En este tutorial, solo lo usaremos ya que facilita la lectura de la salida del código.println()

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
    
    