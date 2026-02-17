package Tema_8_TiposNumerados;

public class Main {
    
    public void show() {
        String text = "     aprendiendo enums       ";

        for(StringOperation op : BasicStringOperation.values()) {
            System.out.println(op.getDescription() + ": \"" + op.apply(text) + "\"");
        }

        for(StringOperation op : ExtendedStringOperation.values()) {
            System.out.println(op.getDescription() + ": \"" + op.apply(text) + "\"");
        }
    }

    public static void main(String[] args) {
        Main ejercicio = new Main();
        ejercicio.show();
    }
}
