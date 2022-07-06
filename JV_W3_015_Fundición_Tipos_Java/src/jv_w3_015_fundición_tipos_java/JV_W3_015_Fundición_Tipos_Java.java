/*
Fundición de tipos Java
La conversión de tipos es cuando se asigna un valor de un tipo de datos primitivo a otro tipo.

En Java, hay dos tipos de casting:

Ampliación de la conversión (automáticamente): conversión de un tipo más pequeño a un tamaño de tipo más grande
byte -> short -> char -> int -> long -> float -> double

Fundición de estrechamiento (manualmente): conversión de un tipo más grande a un tipo de tamaño más pequeño
double -> float -> long -> int -> char -> short -> byte
Fundición de ensanchamiento
La ampliación de la fundición se realiza automáticamente al pasar un tipo de tamaño más pequeño a un tipo de tamaño más grande:

Ejemplo
public class Main {
  public static void main(String[] args) {
    int myInt = 9;
    double myDouble = myInt; // Automatic casting: int to double

    System.out.println(myInt);      // Outputs 9
    System.out.println(myDouble);   // Outputs 9.0
  }
}

Fundición de estrechamiento
La fundición de estrechamiento debe hacerse manualmente colocando el tipo entre paréntesis delante del valor:

Ejemplo
public class Main {
  public static void main(String[] args) {
    double myDouble = 9.78d;
    int myInt = (int) myDouble; // Manual casting: double to int

    System.out.println(myDouble);   // Outputs 9.78
    System.out.println(myInt);      // Outputs 9
  }
}
*/

package jv_w3_015_fundición_tipos_java;

public class JV_W3_015_Fundición_Tipos_Java{
    public static void main(String[] args){
        
        System.out.println("Fundición de Ensanchamiento");
        
        int myInt = 9;
        double myDouble = myInt;
        
        System.out.println(myInt);
        System.out.println(myDouble);
        
        System.out.println("--------------------");
        
        System.out.println("Fundición de Estrechamiento");
        double myDouble1 = 9.78d;
        int myInt1 = (int) myDouble1;
        
        System.out.println(myDouble1);
        System.out.println(myInt1);
        
    }
}