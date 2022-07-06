/*
Operadores Java
Los operadores se utilizan para realizar operaciones sobre variables y valores.

En el siguiente ejemplo, usamos el operador para sumar dos valores:+

Ejemplo
int x = 100 + 50;

Aunque el operador se usa a menudo para sumar dos valores, como en el ejemplo anterior, también se puede usar para sumar una variable y un valor, o una variable y otra variable:+

Ejemplo
int sum1 = 100 + 50;        // 150 (100 + 50)
int sum2 = sum1 + 250;      // 400 (150 + 250)
int sum3 = sum2 + sum2;     // 800 (400 + 400)

Java divide los operadores en los siguientes grupos:

Operadores aritméticos
Operadores de asignación
Operadores de comparación
Operadores lógicos
Operadores bitwise
Operadores aritméticos
Los operadores aritméticos se utilizan para realizar operaciones matemáticas comunes.

Operator	Name	Description	Example	Try it
+	Addition	Adds together two values	x + y	
-	Subtraction	Subtracts one value from another	x - y	
*	Multiplication	Multiplies two values	x * y	
/	Division	Divides one value by another	x / y	
%	Modulus	Returns the division remainder	x % y	
++	Increment	Increases the value of a variable by 1	++x	
--	Decrement	Decreases the value of a variable by 1	--x	
Java Assignment Operators
Assignment operators are used to assign values to variables.

In the example below, we use the assignment operator () to assign the value 10 to a variable called x:=

Example
int x = 10;

El operador de asignación de adición () agrega un valor a una variable:+=

Ejemplo
int x = 10;
x += 5;

Una lista de todos los operadores de asignación:

Operator	Example	Same As	Try it
=	x = 5	x = 5	
+=	x += 3	x = x + 3	
-=	x -= 3	x = x - 3	
*=	x *= 3	x = x * 3	
/=	x /= 3	x = x / 3	
%=	x %= 3	x = x % 3	
&=	x &= 3	x = x & 3	
|=	x |= 3	x = x | 3	
^=	x ^= 3	x = x ^ 3	
>>=	x >>= 3	x = x >> 3	
<<=	x <<= 3	x = x << 3	
Operadores de comparación Java
Los operadores de comparación se utilizan para comparar dos valores:

Operator	Name	Example	Try it
==	Equal to	x == y	
!=	Not equal	x != y	
>	Greater than	x > y	
<	Less than	x < y	
>=	Greater than or equal to	x >= y	
<=	Less than or equal to	x <= y	
Operadores lógicos Java
Los operadores lógicos se utilizan para determinar la lógica entre variables o valores:

Operator	Name	Description	Example	Try it
&& 	Logical and	Returns true if both statements are true	x < 5 &&  x < 10	
|| 	Logical or	Returns true if one of the statements is true	x < 5 || x < 4	
!	Logical not	Reverse the result, returns false if the result is true	!(x < 5 && x < 10)	
Pruébese a sí mismo con ejercicios
Ejercicio:
Multiplicar por , e imprimir el resultado.105

System.out.println(10 
 5);

Comience el ejercicio

*/