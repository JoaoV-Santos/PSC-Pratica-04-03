import java.util.Scanner;
public class Exercicio20 {
	public static void main(String[]args) {
		Scanner input = new Scanner(System.in);
		double ipi;
		String cod1;
		double valorPeca1;
		int qtdPeca1;
		String cod2;
		double valorPeca2;
		int qtdPeca2;
		double totalGeral;
				
		System.out.print("\t\t\t\t\tPeça 1\n\n");
		System.out.print("Código: ");
		cod1 = input.next();
		System.out.print("Valor unitário: ");
		valorPeca1 = input.nextDouble();
		System.out.print("Quantidade: ");
		qtdPeca1 = input.nextInt();
		
		System.out.print("\t\t\t\t\tPeça 2\n\n");
		System.out.print("Código: ");
		cod2 = input.next();
		System.out.print("Valor unitário: ");
		valorPeca2 = input.nextDouble();
		System.out.print("Quantidade: ");
		qtdPeca2 = input.nextInt();
		
		System.out.print("\nInforme a porcentagem de IPI: ");
		ipi = 1 + (input.nextDouble())/100;
		System.out.println();
		
		totalGeral = ipi*((qtdPeca1 * valorPeca1) + (qtdPeca2 * valorPeca2));
		
		System.out.println("Código\t\tQuantidade\t\tValor Unitário\t\tTotal");
		System.out.println(cod1 + "\t\t" + qtdPeca1 + "\t\t\t" + valorPeca1 + "\t\t\t" + (qtdPeca1 * valorPeca1));
		System.out.println(cod2 + "\t\t" + qtdPeca2 + "\t\t\t" + valorPeca2 + "\t\t\t" + (qtdPeca2 * valorPeca2));
		System.out.println("\n\n\n\n\n");
		System.out.printf("Total Geral: R$ %.2f" , totalGeral);
		
		
		
		input.close();
	}

}
