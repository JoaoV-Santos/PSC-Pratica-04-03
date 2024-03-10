import java.util.Scanner;

public class Exercicio09 {
	public static void main(String[]args) {
		Scanner input = new Scanner(System.in);
		double raio;
		double diametro;
		System.out.print("Insira o raio do círculo: ");
		raio = input.nextDouble();
		diametro = 3.14159265359*(raio*raio);
		System.out.println();
		System.out.printf("A área do Círculo é %.2f" , diametro);
		
		input.close();
		
	}

}
