/*
Instrucciones de Java Switch
Utilice la instrucción para seleccionar uno de los muchos bloques de código que se van a ejecutar.switch

Sintaxis
switch(expression) {
  case x:
    // code block
    break;
  case y:
    // code block
    break;
  default:
    // code block
}
Así es como funciona:

La expresión se evalúa una vez.switch
El valor de la expresión se compara con los valores de cada .case
Si hay una coincidencia, se ejecuta el bloque de código asociado.
Las palabras clave y las palabras clave son opcionales, y se describirán más adelante en este capítulo.breakdefault
En el ejemplo siguiente se utiliza el número de día de la semana para calcular el nombre del día de la semana:

Ejemplo
int day = 4;
switch (day) {
  case 1:
    System.out.println("Monday");
    break;
  case 2:
    System.out.println("Tuesday");
    break;
  case 3:
    System.out.println("Wednesday");
    break;
  case 4:
    System.out.println("Thursday");
    break;
  case 5:
    System.out.println("Friday");
    break;
  case 6:
    System.out.println("Saturday");
    break;
  case 7:
    System.out.println("Sunday");
    break;
}
// Outputs "Thursday" (day 4)

La palabra clave break
Cuando Java alcanza una palabra clave, sale del bloque de conmutación.break

Esto detendrá la ejecución de más pruebas de código y casos dentro del bloque.

Cuando se encuentra una coincidencia y el trabajo está hecho, es hora de un descanso. No hay necesidad de más pruebas.

Una interrupción puede ahorrar mucho tiempo de ejecución porque "ignora" la ejecución de todo el resto del código en el bloque del conmutador.

La palabra clave predeterminada
La palabra clave especifica algún código que se ejecutará si no hay coincidencia de mayúsculas y minúsculas:default

Ejemplo
int day = 4;
switch (day) {
  case 6:
    System.out.println("Today is Saturday");
    break;
  case 7:
    System.out.println("Today is Sunday");
    break;
  default:
    System.out.println("Looking forward to the Weekend");
}
// Outputs "Looking forward to the Weekend"
 

Tenga en cuenta que si la instrucción se utiliza como la última instrucción en un bloque de conmutación, no necesita un interrupción.default

Pruébese a sí mismo con ejercicios
Ejercicio:
Inserte las partes que faltan para completar la siguiente instrucción.switch

int day = 2;
switch (
) {
  
 1:
    System.out.println("Saturday");
    break;
  
 2:
    System.out.println("Sunday");
    
;
}

Comience el ejercicio


*/

package jv_w3_024_switch;

public class JV_W3_024_Switch{
    public static void main(String[] args){
        int day = 1;
        switch(day){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Lookin forward to the Weekend");
        }
        
    }
}

