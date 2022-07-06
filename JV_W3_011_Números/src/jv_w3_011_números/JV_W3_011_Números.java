/*
Números Java
Números
Los tipos de números primitivos se dividen en dos grupos:

Los tipos enteros almacenan números enteros, positivos o negativos (como 123 o -456), sin decimales. Los tipos válidos son , , y . El tipo que debe utilizar depende del valor numérico.byteshortintlong

Los tipos de coma flotante representan números con una parte fraccionaria, que contiene uno o más decimales. Hay dos tipos: y .floatdouble

A pesar de que hay muchos tipos numéricos en Java, los más utilizados para los números son (para números enteros) y (para números de coma flotante). Sin embargo, los describiremos todos a medida que continúe leyendo.intdouble

Tipos de enteros
Byte
El tipo de datos puede almacenar números enteros de -128 a 127. Esto se puede usar en lugar de u otros tipos enteros para ahorrar memoria cuando esté seguro de que el valor estará dentro de -128 y 127:byteint

Ejemplo
byte myNum = 100;
System.out.println(myNum);

Corto
El tipo de datos puede almacenar números enteros de -32768 a 32767:short

Ejemplo
short myNum = 5000;
System.out.println(myNum);

Int
El tipo de datos puede almacenar números enteros de -2147483648 a 2147483647. En general, y en nuestro tutorial, el tipo de datos es el tipo de datos preferido cuando creamos variables con un valor numérico.intint

Ejemplo
int myNum = 100000;
System.out.println(myNum);

Largo
El tipo de datos puede almacenar números enteros de -9223372036854775808 a 9223372036854775807. Esto se utiliza cuando int no es lo suficientemente grande como para almacenar el valor. Tenga en cuenta que debe terminar el valor con una "L":long

Ejemplo
long myNum = 15000000000L;
System.out.println(myNum);

Tipos de coma flotante
Debe utilizar un tipo de coma flotante siempre que necesite un número con un decimal, como 9.99 o 3.14515.

Los tipos y los datos pueden almacenar números fraccionarios. Tenga en cuenta que debe terminar el valor con una "f" para flotadores y "d" para dobles:floatdouble

Ejemplo de flotador
float myNum = 5.75f;
System.out.println(myNum);

Ejemplo doble
double myNum = 19.99d;
System.out.println(myNum);

Uso o ?floatdouble

La precisión de un valor de coma flotante indica cuántos dígitos puede tener el valor después del punto decimal. La precisión de es de solo seis o siete dígitos decimales, mientras que las variables tienen una precisión de aproximadamente 15 dígitos. Por lo tanto, es más seguro de usar para la mayoría de los cálculos.floatdoubledouble

Números científicos
Un número de coma flotante también puede ser un número científico con una "e" para indicar la potencia de 10:

Ejemplo
float f1 = 35e3f;
double d1 = 12E4d;
System.out.println(f1);
System.out.println(d1);

*/