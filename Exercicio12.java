import java.util.Scanner;

public class Exercicio12 {
	public static void main(String[]args) {
		Scanner input = new Scanner(System.in);
		int numero;
		int antecessor;
		int sucessor;
		System.out.print("Informe um número e diremos qual vem antes e qual vem depois: ");
		numero = input.nextInt();
		antecessor = numero-1;
		sucessor = numero+1;
		System.out.print("Número: " + numero + "\nAntecessor: "+ antecessor + "\nSucessor: " + sucessor);
		
		input.close();
	}

}
