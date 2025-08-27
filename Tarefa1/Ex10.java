import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        Menu menu = new Menu();
        menu.exibirMenu();
        menu.escolherPrato();
    }
}

class Menu {
    private Scanner sc = new Scanner(System.in);
    private String[] foods = {
            "Salada",
            "Arroz e Feijao",
            "Espaguete ao sugo",
            "Misto Quente",
            "Misto Frio",
            "Arroz e ovo Frito"
    };

    // Exibe o menu de opções
    public void exibirMenu() {
        System.out.println("Escolha um prato:");
        for (int i = 0; i < foods.length; i++) {
            System.out.println((i + 1) + " - " + foods[i]);
        }
    }

    // Lê a escolha do usuário e chama o método correspondente
    public void escolherPrato() {
        int opcao = sc.nextInt();
        switch (opcao) {
            case 1:
                prato1();
                break;
            case 2:
                prato2();
                break;
            case 3:
                prato3();
                break;
            case 4:
                prato4();
                break;
            case 5:
                prato5();
                break;
            case 6:
                prato6();
                break;
            default:
                System.out.println("Prato Indisponivel");
        }
    }

    private void prato1() {
        System.out.println("Prato Escolhido: " + foods[0]);
    }

    private void prato2() {
        System.out.println("Prato Escolhido: " + foods[1]);
    }

    private void prato3() {
        System.out.println("Prato Escolhido: " + foods[2]);
    }

    private void prato4() {
        System.out.println("Prato Escolhido: " + foods[3]);
    }

    private void prato5() {
        System.out.println("Prato Escolhido: " + foods[4]);
    }

    private void prato6() {
        System.out.println("Prato Escolhido: " + foods[5]);
    }
}
