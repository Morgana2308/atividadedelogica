import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a nota: ");
        double nota = sc.nextDouble();

        System.out.print("Digite a frequencia: ");
        double frequencia = sc.nextDouble();

        if (nota >= 7 && frequencia >= 75) {
            System.out.println("Aluno aprovado");
        } else {
            System.out.println("Aluno reprovado");
        }

    }
}