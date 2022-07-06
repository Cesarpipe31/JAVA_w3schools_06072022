/*
Caracteres especiales
Debido a que las cadenas deben escribirse entre comillas, Java malinterpretará esta cadena y generará un error:

String txt = "We are the so-called "Vikings" from the north.";
La solución para evitar este problema, es utilizar el carácter de escape de barra invertida.

El carácter de escape de barra diagonal inversa () convierte los caracteres especiales en caracteres de cadena:\

Escape character	Result	Description
\'	'	Single quote
\"	"	Double quote
\\	\	Backslash
La secuencia inserta una comillas dobles en una cadena:\"

Ejemplo
String txt = "We are the so-called \"Vikings\" from the north.";

La secuencia inserta una sola comilla en una cadena:\'

Ejemplo
String txt = "It\'s alright.";

La secuencia inserta una sola barra diagonal inversa en una cadena:\\

Ejemplo
String txt = "The character \\ is called backslash.";

Otras secuencias de escape comunes que son válidas en Java son:

Code	Result	Try it
\n	New Line	
\r	Carriage Return	
\t	Tab	
\b	Backspace	
\f	Form Feed	
*/