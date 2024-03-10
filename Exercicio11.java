import java.util.Scanner;

public class Exercicio11 {
	public static void main(String[]Args) {
		Scanner input = new Scanner(System.in);
		double nota1 = 0;
		double nota2 = 0;
		double nota3 = 0;
		double media = 0;
		System.out.print("CALCULADORA DE NOTA MÉDIA");
		System.out.println();
		System.out.println();
		System.out.print("Insira a primeira nota: ");
		nota1 = input.nextDouble();
		System.out.print("Insira a segunda nota: ");
		nota2 = input.nextDouble();
		System.out.print("Insira a terceira nota: ");
		nota3 = input.nextDouble();
		media = (nota1+nota2+nota3)/3;
		System.out.printf("A média do aluno foi %.1f" , media);
		
		input.close(); //Fim do Programa
	}

}
