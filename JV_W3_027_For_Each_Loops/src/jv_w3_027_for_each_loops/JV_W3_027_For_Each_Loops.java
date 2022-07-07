/*
Java para cada bucle
Para cada bucle
También hay un bucle "para cada uno", que se utiliza exclusivamente para recorrer elementos en una matriz:

Sintaxis
for (type variableName : arrayName) {
  // code block to be executed
}
En el ejemplo siguiente se generan todos los elementos de la matriz de coches, utilizando un bucle "para cada uno":

Ejemplo
String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
for (String i : cars) {
  System.out.println(i);
}

Nota: No te preocupes si no entiendes el ejemplo anterior. Aprenderá más sobre Arrays en el capítulo Java Arrays.



*/
package jv_w3_027_for_each_loops;

public class JV_W3_027_For_Each_Loops{
    public static void main(String[] args){
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        for (String i: cars){
            System.out.println(i);
        }
    }
}