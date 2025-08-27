import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Número:");
        int n = sc.nextInt();
        sc.nextLine();
        System.out.println("Seu Nome:");
        String str = sc.nextLine();
        System.out.println("Olá " + n + " seu numero é " + str);
        sc.close();
    }
}
