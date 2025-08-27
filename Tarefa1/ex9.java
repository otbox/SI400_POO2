import java.util.Scanner;

public class ex9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] foods = {"Salada", "Arroz e Feijao", "Espaguete ao sugo", "Misto Quente","Misto Frio", "Arroz e ovo Frito"};

        int a = 0;
        for (String string : foods) {
            System.out.println(++a +" " + string);
        }

        switch (sc.nextInt()) {
            case 1:
                System.out.println("Prato Escolhido: " + foods[0]);
                break;
            case 2:
                System.out.println("Prato Escolhido: " + foods[1]);
                break;
            case 3:
                System.out.println("Prato Escolhido: " + foods[2]);
                break;
            case 4:
                System.out.println("Prato Escolhido: " + foods[3]);
                break;
            case 5:
                System.out.println("Prato Escolhido: " + foods[4]);
                break;
            case 6:
                System.out.println("Prato Escolhido: " + foods[5]);
                break;
        
            default:
                System.out.println("Prato Indisponivel");
                break;
        }

        sc.close();
    }
}
