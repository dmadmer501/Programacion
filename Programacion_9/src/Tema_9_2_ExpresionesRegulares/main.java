package Tema_9_2_ExpresionesRegulares;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class main {
    public static void main(String[] args) {

        //1. Dada una cadena que contiene código en Java, reemplazar los int por byte y los double por float. 
        String code = """
        package ejemplo;
        //Este es el comentario
        import java.util.regex.Pattern

        public class Test {
            int a = 5;
            double b = 3.5;
        }

        while(x > 5)

        """;

        code = code.replaceAll("\\bint\\b", "byte");
        code = code.replaceAll("\\bdouble\\b", "float");
        System.out.println(code);

        //2. Dada una cadena que contiene código en Java, mostrar el nombre del paquete.
        Pattern pattern = Pattern.compile("package\\s+([\\w\\.]+)");
        Matcher matcher = pattern.matcher(code);
        while (matcher.find()) {
            System.out.println("Paquete: " + matcher.group(1));
        }

        //3. Dada una cadena que contiene código en Java, mostrar las clases que se importan con sus rutas de paquetes. Ejemplo: java.util.regex.Pattern.
        Pattern pattern2 = Pattern.compile("import\\s+([\\w\\.]+)");
        Matcher matcher2 = pattern2.matcher(code);
        while (matcher2.find()) {
            System.out.println("Import: " + matcher2.group(1));
        }

        //4. Dada una cadena que contiene código en Java, mostrar los comentarios de una línea.
        Pattern pattern3 = Pattern.compile("//+[\\s\\w]+");
        Matcher matcher3 = pattern3.matcher(code);
        while (matcher3.find()) {
            System.out.println("Comentario: " + matcher3.group());
        }

        //5. Dada una cadena que contiene código en Java, mostrar las condiciones de los while.
        Pattern pattern4 = Pattern.compile("while\\s*\\((.*?)\\)");
        Matcher matcher4 = pattern4.matcher(code);
        while (matcher4.find()) {
            System.out.println("Condicional: " + matcher4.group());
        }
        //6. Realiza un programa que dado un texto que contiene ecuaciones de primer grado, las encuentre y las resuelva. 
        // Utilizar expresiones regulares y las clases Pattern y Matcher. 
        // Hay que modularizar el código y en la salida a consola se tienen que mostrar todas las ecuaciones que se han encontrado junto con su solución. 
        /* Las ecuaciones que hay que buscar tienen las siguientes características:
            - Solamente tienen una incógnita, que es x. 
            - Las operaciones que pueden aparecer son sumas(+) y restas(-).
            - No tiene por qué aparecer la incógnita en las dos partes de la ecuación. Ejemplo:x=3+13
            - No hay espacios en la ecuación. 
        */
       
    }

}
