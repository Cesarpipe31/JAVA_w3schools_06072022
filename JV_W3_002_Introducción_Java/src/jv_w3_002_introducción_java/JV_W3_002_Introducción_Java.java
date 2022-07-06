/*
Introducción a Java
¿Qué es Java?
Java es un lenguaje de programación popular, creado en 1995.

Es propiedad de Oracle, y más de 3 mil millones de dispositivos ejecutan Java.

Se utiliza para:

Aplicaciones móviles (especialmente aplicaciones Android)
Aplicaciones de escritorio
Aplicaciones web
Servidores web y servidores de aplicaciones
Juegos
Conexión de base de datos
¡Y mucho, mucho más!
¿Por qué usar Java?
Java funciona en diferentes plataformas (Windows, Mac, Linux, Raspberry Pi, etc.)
Es uno de los lenguajes de programación más populares del mundo
Es fácil de aprender y fácil de usar
Es de código abierto y gratuito
Es seguro, rápido y potente
Tiene un gran apoyo de la comunidad (decenas de millones de desarrolladores)
Java es un lenguaje orientado a objetos que da una estructura clara a los programas y permite reutilizar el código, reduciendo los costos de desarrollo.
Como Java está cerca de C ++ y C #, hace que sea fácil para los programadores cambiar a Java o viceversa
Comenzar
No es necesario tener ninguna experiencia previa en programación.

Instalación de Java
Es posible que algunos equipos ya tengan Instalado Java.

Para comprobar si tiene Java instalado en un PC con Windows, busque Java en la barra de inicio o escriba lo siguiente en el símbolo del sistema (cmd.exe):

C:\Users\Your Name>java -version
Si Java está instalado, verá algo como esto (dependiendo de la versión):

java version "11.0.1" 2018-10-16 LTS
Java(TM) SE Runtime Environment 18.9 (build 11.0.1+13-LTS)
Java HotSpot(TM) 64-Bit Server VM 18.9 (build 11.0.1+13-LTS, mixed mode)
Si no tienes Java instalado en tu ordenador, puedes descargarlo de forma gratuita en oracle.com.

Nota: En este tutorial, escribiremos código Java en un editor de texto. Sin embargo, es posible escribir Java en un entorno de desarrollo integrado, como IntelliJ IDEA, Netbeans o Eclipse, que son particularmente útiles cuando se gestionan colecciones más grandes de archivos Java.

Configuración para Windows
Para instalar Java en Windows:

Vaya a "Propiedades del sistema" (se puede encontrar en el Panel de control > Sistema y seguridad > Sistema > Configuración avanzada del sistema)
Haga clic en el botón "Variables de entorno" en la pestaña "Avanzado"
Luego, seleccione la variable "Ruta" en Variables del sistema y haga clic en el botón "Editar"
Haga clic en el botón "Nuevo" y agregue la ruta donde está instalado Java, seguido de \bin. De forma predeterminada, Java se instala en C:\Archivos de programa\Java\jdk-11.0.1 (si no se especificó nada más al instalarlo). En ese caso, tendrá que agregar una nueva ruta con: C: \ Archivos de programa \ Java \ jdk-11.0.1 \ bin
Luego, haga clic en "Aceptar" y guarde la configuración
Por último, abra el símbolo del sistema (cmd.exe) y escriba java -version para ver si Java se está ejecutando en su máquina
Inicio rápido de Java
En Java, cada aplicación comienza con un nombre de clase, y esa clase debe coincidir con el nombre de archivo.

Vamos a crear nuestro primer archivo Java, llamado Main.java, que se puede hacer en cualquier editor de texto (como el Bloc de notas).

El archivo debe contener un mensaje "Hello World", que está escrito con el siguiente código:

Principal.java

public class Main {
  public static void main(String[] args) {
    System.out.println("Hello World");
  }
}

No se preocupe si no entiende el código anterior, lo discutiremos en detalle en capítulos posteriores. Por ahora, concéntrese en cómo ejecutar el código anterior.

Guarde el código en el Bloc de notas como "Principal.java". Abra el símbolo del sistema (cmd.exe), navegue hasta el directorio donde guardó el archivo y escriba "javac Main.java":

C:\Users\Your Name>javac Main.java
Esto compilará su código. Si no hay errores en el código, el símbolo del sistema lo llevará a la siguiente línea. Ahora, escriba "java Main" para ejecutar el archivo:

C:\Users\Your Name>java Main
El resultado debe decir:

Hello World
¡Felicidades! Has escrito y ejecutado tu primer programa Java.
*/

package jv_w3_002_introducción_java;
        
public class JV_W3_002_Introducción_Java
{
       
    public static void main (String[] args) 
    {
        System.out.println("hello Wordl");

    }
}

