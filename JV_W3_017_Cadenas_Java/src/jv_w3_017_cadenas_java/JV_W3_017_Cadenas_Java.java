/*
Cadenas Java
Las cadenas se utilizan para almacenar texto.

Una variable contiene una colección de caracteres rodeados de comillas dobles:String

Ejemplo
Cree una variable de tipo y asígnele un valor:String

String greeting = "Hello";

Longitud de la cadena
Una cadena en Java es en realidad un objeto, que contiene métodos que pueden realizar ciertas operaciones en cadenas. Por ejemplo, la longitud de una cadena se puede encontrar con el método:length()

Ejemplo
String txt = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
System.out.println("The length of the txt string is: " + txt.length());

Más métodos de cadena
Hay muchos métodos de cadena disponibles, por ejemplo, y :toUpperCase()toLowerCase()

Ejemplo
String txt = "Hello World";
System.out.println(txt.toUpperCase());   // Outputs "HELLO WORLD"
System.out.println(txt.toLowerCase());   // Outputs "hello world"

Búsqueda de un carácter en una cadena
El método devuelve el índice (la posición) de la primera aparición de un texto especificado en una cadena (incluido el espacio en blanco):indexOf()

Ejemplo
String txt = "Please locate where 'locate' occurs!";
System.out.println(txt.indexOf("locate")); // Outputs 7

Java cuenta las posiciones desde cero.
0 es la primera posición en una cadena, 1 es la segunda, 2 es la tercera...

Referencia de cadena completa
Para obtener una referencia completa de los métodos String, vaya a nuestra Referencia de métodos de cadena Java.

La referencia contiene descripciones y ejemplos de todos los métodos de cadena.

Pruébese a sí mismo con ejercicios
Ejercicio:
Rellene la pieza que falta para crear una variable de tipo y asígnele el valor .greetingStringHello

 greeting = 
;

Comience el ejercicio


Todos los métodos string
La clase String tiene un conjunto de métodos integrados que puede utilizar en cadenas.

Method	Description	Return Type
charAt()	Returns the character at the specified index (position)	char
codePointAt()	Returns the Unicode of the character at the specified index	int
codePointBefore()	Returns the Unicode of the character before the specified index	int
codePointCount()	Returns the number of Unicode values found in a string.	int
compareTo()	Compares two strings lexicographically	int
compareToIgnoreCase()	Compares two strings lexicographically, ignoring case differences	int
concat()	Appends a string to the end of another string	String
contains()	Checks whether a string contains a sequence of characters	boolean
contentEquals()	Checks whether a string contains the exact same sequence of characters of the specified CharSequence or StringBuffer	boolean
copyValueOf()	Returns a String that represents the characters of the character array	String
endsWith()	Checks whether a string ends with the specified character(s)	boolean
equals()	Compares two strings. Returns true if the strings are equal, and false if not	boolean
equalsIgnoreCase()	Compares two strings, ignoring case considerations	boolean
format()	Returns a formatted string using the specified locale, format string, and arguments	String
getBytes()	Encodes this String into a sequence of bytes using the named charset, storing the result into a new byte array	byte[]
getChars()	Copies characters from a string to an array of chars	void
hashCode()	Returns the hash code of a string	int
indexOf()	Returns the position of the first found occurrence of specified characters in a string	int
intern()	Returns the canonical representation for the string object	String
isEmpty()	Checks whether a string is empty or not	boolean
lastIndexOf()	Returns the position of the last found occurrence of specified characters in a string	int
length()	Returns the length of a specified string	int
matches()	Searches a string for a match against a regular expression, and returns the matches	boolean
offsetByCodePoints()	Returns the index within this String that is offset from the given index by codePointOffset code points	int
regionMatches()	Tests if two string regions are equal	boolean
replace()	Searches a string for a specified value, and returns a new string where the specified values are replaced	String
replaceFirst()	Replaces the first occurrence of a substring that matches the given regular expression with the given replacement	String
replaceAll()	Replaces each substring of this string that matches the given regular expression with the given replacement	String
split()	Splits a string into an array of substrings	String[]
startsWith()	Checks whether a string starts with specified characters	boolean
subSequence()	Returns a new character sequence that is a subsequence of this sequence	CharSequence
substring()	Returns a new string which is the substring of a specified string	String
toCharArray()	Converts this string to a new character array	char[]
toLowerCase()	Converts a string to lower case letters	String
toString()	Returns the value of a String object	String
toUpperCase()	Converts a string to upper case letters	String
trim()	Removes whitespace from both ends of a string	String
valueOf()	Returns the string representation of the specified value	String
*/

package jv_w3_017_cadenas_java;

public class JV_W3_017_Cadenas_Java{
    public static void main(String[] args){
    String txt = "Please locate where 'locate' occurs!";
    System.out.println(txt.indexOf("locate"));
    
}
}