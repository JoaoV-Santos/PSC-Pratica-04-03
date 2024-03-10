import java.util.Scanner;

public class Exercicio17 {
	static public void main(String[]args) {
		Scanner input = new Scanner(System.in);
		int nCanetas;
		int zReais;
		double yTroco;
		double valorCaneta;
		System.out.print("Calculadora de canetas");
		System.out.print("\n\nInsira a quantidade de canetas compradas: ");
		nCanetas = input.nextInt();
		System.out.print("\nInsira o valor da nota dada pelo cliente: ");
		zReais = input.nextInt();
		System.out.print("Insira o valor do troco dado ao cliente ");
		yTroco = input.nextDouble();
		valorCaneta = (zReais-yTroco)/nCanetas;
		System.out.printf("O valor de cada caneta é R$ %.2f" , valorCaneta);
		
		input.close();
		
	}

}
