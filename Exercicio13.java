import java.util.Scanner;

public class Exercicio13 {
	public static void main(String[]args) {
		Scanner input = new Scanner(System.in);
		System.out.println("CALCULADORA DE SALÁRIO LÍQUIDO\n");
		double valorHora;
		int horasTrabalhadas;
		float inss;
		double salarioBruto;
		double salarioLiquido;
		System.out.print("Informe o valor da hora de trabalho: ");
		valorHora = input.nextDouble();
		System.out.println();
		System.out.print("Informe a quantidade de horas trabalhadas no mês: ");
		horasTrabalhadas = input.nextInt();
		System.out.println();
		salarioBruto = valorHora*horasTrabalhadas;
		System.out.println();
		System.out.print("Informe a porcentagem de INSS descontada: ");
		inss = input.nextFloat();
		inss = inss/100;
		salarioLiquido = salarioBruto - (inss*salarioBruto);
		System.out.printf("O salário líquido é de R$ %.2f" , salarioLiquido);
		
		
		
		input.close();
	}

}
