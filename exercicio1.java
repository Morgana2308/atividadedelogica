import java.util.Scanner;

public class exercicio1 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.print("Digite a sua idade: ");
		int idade = entrada.nextInt();
		
		if(idade <= 12 || idade >= 65) {
			System.out.println("Entrada gratuita");
		}

	} 
}