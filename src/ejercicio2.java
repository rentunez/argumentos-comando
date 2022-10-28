import java.util.ArrayList;
import java.util.Scanner;

public class ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ingrese la cantidad de numeros a contar: ");
        int n = sc.nextInt();
        ArrayList<Integer> numeros = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            System.out.println("ingrese un numero: ");
            int num = sc.nextInt();
            numeros.add(num);
        }
        float sumatoria = 0, promedio;
        for (int i = 0; i < numeros.size(); i++) {
            sumatoria+= numeros.get(i);
        }
        promedio = sumatoria/numeros.size();
        System.out.println("La sumatoria es: " + sumatoria + " y el promedio es: " + promedio);
    }
}
