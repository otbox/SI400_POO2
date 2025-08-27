import java.util.ArrayList;
import java.util.Scanner;

public class ex8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Double> d = new ArrayList<>();
        System.out.println("insira numeros para calcular media");
        System.out.println("Digite caracter diferente de numeros para sair");
        while (sc.hasNextDouble()) {
            d.add(sc.nextDouble());
        }
        double sum = 0;
        for (double d1 : d) {
            sum += d1;
        }
        System.out.println(sum/d.size());
        sc.close();
    }
}
