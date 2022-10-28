import java.util.ArrayList;
import java.util.Scanner;

public class ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> lista = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            System.out.println("Ingrese una palabra: ");
            String palabra = sc.next();
            lista.add(palabra);
        }
        for (int i = lista.size() - 1; i >= 0; i--) {
            String s = lista.get(i);
            System.out.println(s);
        }

    }
}
