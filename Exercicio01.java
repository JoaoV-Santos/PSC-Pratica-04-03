import java.util.Scanner;

public class Exercicio01 {
	public static void main(String[]args) {
		System.out.println("Digite o primeiro número.");
		double num1;
		double num2;
		double resultado;
		Scanner input = new Scanner(System.in);
		num1 = input.nextDouble();
		
		System.out.println("\nInforme o segundo número.");
		num2 = input.nextDouble();
		resultado = (num1+num2);
		System.out.println(resultado);
			
		input.close();
	}
	

}