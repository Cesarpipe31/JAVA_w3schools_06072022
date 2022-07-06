/*
Matemáticas Java
La clase Java Math tiene muchos métodos que le permiten realizar tareas matemáticas en números.

Matemáticas.max(x,y)
El método se puede utilizar para encontrar el valor más alto de x e y:Math.max(x,y)

Ejemplo
Math.max(5, 10);

Math.min(x,y)
El método se puede utilizar para encontrar el valor más bajo de x e y:Math.min(x,y)

Ejemplo
Math.min(5, 10);

Math.sqrt(x)
El método devuelve la raíz cuadrada de x:Math.sqrt(x)

Ejemplo
Math.sqrt(64);

Math.abs(x)
El método devuelve el valor absoluto (positivo) de x:Math.abs(x)

Ejemplo
Math.abs(-4.7);

Números aleatorios
Math.random() devuelve un número aleatorio entre 0,0 (inclusive) y 1,0 (exclusivo):

Ejemplo
Math.random();

Para obtener más control sobre el número aleatorio, por ejemplo, solo desea un número aleatorio entre 0 y 100, puede usar la siguiente fórmula:

Ejemplo
int randomNum = (int)(Math.random() * 101);  // 0 to 100

Referencia matemática completa
Para obtener una referencia completa de los métodos matemáticos, vaya a nuestra Referencia de métodos matemáticos de Java.

Pruébese a sí mismo con ejercicios
Ejercicio:
Utilice el método correcto para encontrar el valor más alto de y .xy

int x = 5;
int y = 10;
Math.
(x, y);

Comience el ejercicio




La clase Java Math tiene muchos métodos que le permiten realizar tareas matemáticas en números.

Todos los métodos matemáticos
Una lista de todos los métodos matemáticos se puede encontrar en la siguiente tabla:

Method	Description	Return Type
abs(x)	Returns the absolute value of x	double|float|int|long
acos(x)	Returns the arccosine of x, in radians	double
asin(x)	Returns the arcsine of x, in radians	double
atan(x)	Returns the arctangent of x as a numeric value between -PI/2 and PI/2 radians	double
atan2(y,x)	Returns the angle theta from the conversion of rectangular coordinates (x, y) to polar coordinates (r, theta).	double
cbrt(x)	Returns the cube root of x	double
ceil(x)	Returns the value of x rounded up to its nearest integer	double
copySign(x, y)	Returns the first floating point x with the sign of the second floating point y	double
cos(x)	Returns the cosine of x (x is in radians)	double
cosh(x)	Returns the hyperbolic cosine of a double value	double
exp(x)	Returns the value of Ex	double
expm1(x)	Returns ex -1	double
floor(x)	Returns the value of x rounded down to its nearest integer	double
getExponent(x)	Returns the unbiased exponent used in x	int
hypot(x, y)	Returns sqrt(x2 +y2) without intermediate overflow or underflow	double
IEEEremainder(x, y)	Computes the remainder operation on x and y as prescribed by the IEEE 754 standard	double
log(x)	Returns the natural logarithm (base E) of x	double
log10(x)	Returns the base 10 logarithm of x	double
log1p(x)	Returns the natural logarithm (base E) of the sum of x and 1	double
max(x, y)	Returns the number with the highest value	double|float|int|long
min(x, y)	Returns the number with the lowest value	double|float|int|long
nextAfter(x, y)	Returns the floating point number adjacent to x in the direction of y	double|float
nextUp(x)	Returns the floating point value adjacent to x in the direction of positive infinity	double|float
pow(x, y)	Returns the value of x to the power of y	double
random()	Returns a random number between 0 and 1	double
round(x)	Returns the value of x rounded to its nearest integer	int
rint(x)	Returns the double value that is closest to x and equal to a mathematical integer	double
signum(x)	Returns the sign of x	double
sin(x)	Returns the sine of x (x is in radians)	double
sinh(x)	Returns the hyperbolic sine of a double value	double
sqrt(x)	Returns the square root of x	double
tan(x)	Returns the tangent of an angle	double
tanh(x)	Returns the hyperbolic tangent of a double value	double
toDegrees(x)	Converts an angle measured in radians to an approx. equivalent angle measured in degrees	double
toRadians(x)	Converts an angle measured in degrees to an approx. angle measured in radians	double
ulp(x)	Returns the size of the unit of least precision (ulp) of x	double|float
Nota: Todos los métodos matemáticos son .static

*/