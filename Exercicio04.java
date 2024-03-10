import java.util.Scanner;

public class Exercicio04 {
	public static void main(String[]args) {
		Scanner input = new Scanner(System.in);
		String nome,end,tel;
		System.out.println("Informe seu nome");
		nome = input.nextLine();
		System.out.println("Informe seu endereço");
		end = input.nextLine();
		System.out.println("Informe seu telefone");
		tel = input.nextLine();
		
		System.out.println("Nome: " + nome);
		System.out.println("Endereço: " + end);
		System.out.println("Telefone: " + tel);
		
		input.close();
		
	}

}
