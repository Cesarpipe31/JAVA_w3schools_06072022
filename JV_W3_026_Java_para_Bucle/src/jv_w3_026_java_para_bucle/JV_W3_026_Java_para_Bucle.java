/*
Java para bucle
Java para bucle
Cuando sepa exactamente cuántas veces desea atravesar un bloque de código, use el bucle en lugar de un bucle:forwhile

Sintaxis
for (statement 1; statement 2; statement 3) {
  // code block to be executed
}
La instrucción 1 se ejecuta (una vez) antes de la ejecución del bloque de código.

La instrucción 2 define la condición para ejecutar el bloque de código.

La instrucción 3 se ejecuta (cada vez) después de que se haya ejecutado el bloque de código.

El siguiente ejemplo imprimirá los números del 0 al 4:

Ejemplo
for (int i = 0; i < 5; i++) {
  System.out.println(i);
}

Ejemplo explicado
La instrucción 1 establece una variable antes de que comience el bucle (int i = 0).

La instrucción 2 define la condición para que el bucle se ejecute (i debe ser menor que 5). Si la condición es true, el bucle comenzará de nuevo, si es false, el bucle terminará.

La instrucción 3 aumenta un valor (i++) cada vez que se ha ejecutado el bloque de código en el bucle.

Otro ejemplo
En este ejemplo solo se imprimirán valores pares entre 0 y 10:

Ejemplo
for (int i = 0; i <= 10; i = i + 2) {
  System.out.println(i);
}

Pruébese a sí mismo con ejercicios
Ejercicio:
Use un bucle para imprimir "Sí" 5 veces.for

 (int i = 0; i < 5; 
) {
  System.out.println(
);
}

Comience el ejercicio
*/
package jv_w3_026_java_para_bucle;

public class JV_W3_026_Java_para_Bucle{
    public static void main(String[] args){
        for (int i = 0; i < 5; i++){
            System.out.println(i+1 + ". Yes");            
        }
    }
}
