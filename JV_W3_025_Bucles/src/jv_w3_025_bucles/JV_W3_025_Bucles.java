/*
Bucles
Los bucles pueden ejecutar un bloque de código siempre que se alcance una condición especificada.

Los bucles son útiles porque ahorran tiempo, reducen los errores y hacen que el código sea más legible.

Java While Loop
El bucle recorre un bloque de código siempre que una condición especificada sea:whiletrue

Sintaxis
while (condition) {
  // code block to be executed
}
En el siguiente ejemplo, el código del bucle se ejecutará, una y otra vez, siempre que una variable (i) sea inferior a 5:

Ejemplo
int i = 0;
while (i < 5) {
  System.out.println(i);
  i++;
}

Nota: No olvide aumentar la variable utilizada en la condición, de lo contrario, ¡el bucle nunca terminará!

El bucle Do/While
El bucle es una variante del bucle. Este bucle ejecutará el bloque de código una vez, antes de verificar si la condición es verdadera, luego repetirá el bucle siempre que la condición sea verdadera.do/whilewhile

Sintaxis
do {
  // code block to be executed
}
while (condition);
En el ejemplo siguiente se utiliza un bucle. El bucle siempre se ejecutará al menos una vez, incluso si la condición es falsa, porque el bloque de código se ejecuta antes de que se pruebe la condición:do/while

Ejemplo
int i = 0;
do {
  System.out.println(i);
  i++;
}
while (i < 5);

No olvide aumentar la variable utilizada en la condición, de lo contrario, ¡el bucle nunca terminará!

Pruébese a sí mismo con ejercicios
Ejercicio:
Imprima siempre que sea inferior a 6.ii

int i = 1;
 (i < 6) {
  System.out.println(i); 
  
;
}

Comience el ejercicio
*/

package jv_w3_025_bucles;

public class JV_W3_025_Bucles{
    public static void main(String[] args){
        int i = 0;
                System.out.println("------ While -------------");
        while (i < 5){
            System.out.println(i);
            i++;
        }
        System.out.println("----- do -  while --------------");
        int a = 0;
        do  {
            System.out.println(a);
            a++;
            }
        while (a < 5);        
        }
    }

