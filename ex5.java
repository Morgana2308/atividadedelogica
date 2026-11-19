import java.util.Scanner;

public class ex5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o codigo do produto: ");
        int codigo = sc.nextInt();

        System.out.print("Digite a quantidade: ");
        int quantidade = sc.nextInt();

        double total;

        switch (codigo) {
            case 1:
                total = 50 * quantidade;
                System.out.println("Produto: Bone");
                System.out.println("Total: R$ " + total);
                break;

            case 2:
                total = 80 * quantidade;
                System.out.println("Produto: Calca");
                System.out.println("Total: R$ " + total);
                break;

            case 3:
                total = 150 * quantidade;
                System.out.println("Produto: Tenis");
                System.out.println("Total: R$ " + total);
                break;

            default:
                System.out.println("Produto nao encontrado");
        }

        sc.close();
    }
}