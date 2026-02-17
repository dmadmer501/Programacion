public class Main {

    public void show() {
        System.out.println("lunes".matches("lunes"));
        System.out.println("sol".matches("[a-zA-Z]{3}"));
        System.out.println("casas".matches("[^ñzx]{5,}"));
        System.out.println("Hoal1".matches("^[^0-9].*"));
        System.out.println("holapapi".matches("[^b]+"));
        System.out.println("651223547".matches("\\d{9}"));
        System.out.println("75922504J".matches("\\d{8}[A-Z]"));
        System.out.println("Daniel".matches("[A-Z][a-zA-Z]+"));
        System.out.println("Ol".matches("[AEIOUaeiou][^AEIOUaeiou]*"));
        System.out.println("234". matches("[0-9]|[1-9][0-9]|1[0-9]{2}|2[0-9]{2}"));
    }

    public static void main(String[] args) {
        Main ejercicio = new Main();
        ejercicio.show();
    }

}
