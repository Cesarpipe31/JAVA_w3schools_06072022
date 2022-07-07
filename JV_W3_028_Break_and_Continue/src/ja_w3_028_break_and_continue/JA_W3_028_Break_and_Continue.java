/*
Java Romper y continuar
Salto de Java
Ya ha visto la declaración utilizada en un capítulo anterior de este tutorial. Se usaba para "saltar" de una declaración.breakswitch

La instrucción también se puede usar para saltar fuera de un bucle.break

En este ejemplo se detiene el bucle cuando i es igual a 4:

Ejemplo
for (int i = 0; i < 10; i++) {
  if (i == 4) {
    break;
  }
  System.out.println(i);
}
 

Java Continuar
La instrucción interrumpe una iteración (en el bucle), si se produce una condición especificada, y continúa con la siguiente iteración en el bucle.continue

En este ejemplo se omite el valor de 4:

Ejemplo
for (int i = 0; i < 10; i++) {
  if (i == 4) {
    continue;
  }
  System.out.println(i);
}
 

Romper y continuar en While Loop
También puede usar y en bucles mientras:breakcontinue

Ejemplo de ruptura
int i = 0;
while (i < 10) {
  System.out.println(i);
  i++;
  if (i == 4) {
    break;
  }
}
 

Ejemplo de continue
int i = 0;
while (i < 10) {
  if (i == 4) {
    i++;
    continue;
  }
  System.out.println(i);
  i++;
}
 

Pruébese a sí mismo con ejercicios
Ejercicio:
Detenga el bucle si es 5.i

for (int i = 0; i < 10; i++) {
  if (i == 5) {   
    
;
  }
  System.out.println(i);
}

Comience el ejercicio
*/

package ja_w3_028_break_and_continue;

public class JA_W3_028_Break_and_Continue{
    public static void main(String[] args){
    System.out.println("-------- \" Break \" -----------");
    for (int i = 0; i < 10; i++) {
        if (i == 4){
            break;
        }
        System.out.println(i);
    }
    
    System.out.println("-------- \" Continue \" -----------");
    
    for (int j = 0; j < 10; j++){
        if(j == 4){
            continue;
        }
        System.out.println(j);
    }

 System.out.println("-------- \" Break and Continue \" -----------");
 int m = 0;
 while (m < 10) {
     System.out.println(m);
     m++;
     if (m == 4){
         break;
     }
 }
 
 System.out.println("-------- \" Continue Example \" -----------");
 
 int n = 0;
 while (n < 10){
     if (n== 4){
         n++;
         continue;
     }
     System.out.println(n);
     n++;
 }
}
}