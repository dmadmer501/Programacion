package Tema_9_1_MetodoMatches;

public class main {
    public main(String[] args) {
        //1. que la cadena sea exactamente “lunes”.
        System.out.println("lunes".matches("lunes"));
        //2. que la cadena sea de tres letras, mayúsculas o minúsculas.
        System.out.println("aaa".matches("[a-zA-Z]{3}"));
        //3. que la cadena contenga 5 o más caracteres que no sean la ñ, la z ni la x.
        System.out.println("Casas".matches("[^ÑZX]{5,}"));
        //4. que la cadena no empiece con un número.
        System.out.println("Jota1".matches("^[^0-9].*"));
        //5. que la cadena tenga varios caracteres excepto la b.
        System.out.println("Jota-_-".matches("[^b]+"));
        //6. que la cadena sea un número de teléfono.
        System.out.println("600648041".matches("[0-9]{9}"));
        //7. que la cadena sea un DNI.
        System.out.println("75922501F".matches("\\d{8}[A-Z]"));
        //8. que la cadena sea un nombre, es decir, que no tenga espacios, que no sea una cadena vacía y que empiece por mayúsculas.
        System.out.println("Daniel".matches("[A-Z][a-zA-Z]+"));
        //9. que la cadena empiece con vocal y luego tenga varias consonantes o ninguna. 
        System.out.println("Ol".matches("[AEIOU-aeiou][^AEIOU-aeiou]*"));
        //10. que la cadena sea un número positivo más pequeño que 300.
        System.out.println("230".matches("[0-2][0-9][0-9]"));
    }
}
