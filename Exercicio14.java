import java.util.Scanner;

public class Exercicio14 {
	public static void main(String[]args) {
		Scanner input = new Scanner(System.in);
		float numeroA;
		float numeroB;
		float numeroC;
		System.out.print("Informe o valor de A: ");
		numeroA = input.nextFloat();
		System.out.println();
		System.out.print("Informe o valor de B: ");
		numeroB = input.nextFloat();
		System.out.println();
		System.out.println("A = " + numeroA + "\nB = " + numeroB);
		System.out.println("Valores Invertidos\n");
		numeroC = numeroB;
		numeroB = numeroA;
		numeroA = numeroC;
		System.out.println("A = " + numeroA + "\nB = " + numeroB);
		
		
		input.close();
	}

}
