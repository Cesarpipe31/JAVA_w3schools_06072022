/*
Concatenación de cadenas
El operador se puede utilizar entre cadenas para combinarlas. Esto se llama concatenación:+

Ejemplo
String firstName = "John";
String lastName = "Doe";
System.out.println(firstName + " " + lastName);

Tenga en cuenta que hemos agregado un texto vacío (" ") para crear un espacio entre firstName y lastName en la impresión.

También puede utilizar el método para concatenar dos cadenas:concat()

Ejemplo
String firstName = "John ";
String lastName = "Doe";
System.out.println(firstName.concat(lastName));


*/

package jv_w3_017_concatenación_cadenas;
        
public class JV_W3_017_Concatenación_Cadenas{
    public static void main(String[] args){
        String firstName = "John";
        String lastName = "Doe";
        System.out.println(firstName + " " + lastName);
        System.out.println("------ Otra forma con concat ------------------");
        System.out.println(firstName.concat(lastName));                    
    }
}