import java.util.Scanner;

public class Exercicio03 {
	public static void main(String[]args) {
		Scanner input = new Scanner(System.in);
		String nome;
		System.out.println("Informe seu nome.");
		nome = input.nextLine();
		System.out.println("Olá, " + nome + "!");
		
		input.close();
	}	
}