import java.util.Scanner;

public class Exercicio07 {
	public static void main(String[]args) {
		double salario;
		double novoSalario;
		Scanner input = new Scanner(System.in);
		System.out.print("Insira o salário do funcionário: ");
		salario = input.nextDouble();
		novoSalario = (salario*1.07);
		System.out.println("O salário do funciomário após o reajuste será de R$ " + novoSalario);
		
		input.close();
	}

}