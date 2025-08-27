import java.util.Scanner;

public class ex4 {
    static void Multiplicao (int n) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i + "*" + n + "=" + (n*i));
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Número:");
        int n = sc.nextInt();
        Multiplicao(n);
        sc.close();
    }
}
