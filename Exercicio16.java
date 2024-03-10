import java.util.Scanner;

public class Exercicio16 {
	public static void main(String[]args) {
		Scanner input = new Scanner(System.in);
		double distanciaKm;
		double consumoL;
		double consumoMedio;
		System.out.print("Insira a distância total percorrida em quilômetros: ");
		distanciaKm = input.nextDouble();
		System.out.print("\nInsira a quantidade de combustível utilizada em litros: ");
		consumoL = input.nextDouble();
		consumoMedio = distanciaKm/consumoL;
		System.out.println("\nO consumo médio da viagem foi de " + consumoMedio + " quilômetros por litro.");
		
		input.close();
	}

}
