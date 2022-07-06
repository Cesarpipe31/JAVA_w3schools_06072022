/*
Java Mano corta si... Else (Operador Ternario)
Mano corta si... Más
También hay una abreviatura si no, que se conoce como el operador ternario porque consta de tres operandos.

Se puede usar para reemplazar varias líneas de código con una sola línea, y se usa con mayor frecuencia para reemplazar instrucciones simples si más:

Sintaxis
variable = (condition) ? expressionTrue :  expressionFalse;
En lugar de escribir:

Ejemplo
int time = 20;
if (time < 18) {
  System.out.println("Good day.");
} else {
  System.out.println("Good evening.");
}

Simplemente puedes escribir:

Ejemplo
int time = 20;
String result = (time < 18) ? "Good day." : "Good evening.";
System.out.println(result);

Pruébese a sí mismo con ejercicios
Ejercicio:
Inserte las partes que faltan para completar la siguiente "mano corta si... else" declaración:

int time = 20;
String result = 
time < 18
 
 "Good day." 
 "Good evening.";
System.out.println(result); 

Comience el ejercicio
*/

package jv_w3_023_operador_ternario_if_else;

public class JV_W3_023_Operador_Ternario_If_Else{
    public static void main(String[] args){
        int time =20;
        String result = (time < 18) ? "Good day." : "Good evening.";
        System.out.println(result);        
    }
}