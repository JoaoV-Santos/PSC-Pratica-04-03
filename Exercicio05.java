import java.util.Scanner;

public class Exercicio05 {
	public static void main(String[]args) {
		Scanner input = new Scanner(System.in);
		double real,dolar;
		System.out.print("Insira um valor em dólar para ser convertido em real: ");
		dolar = input.nextDouble();
		real = (dolar * 4.95);
		System.out.print("\nU$ " + dolar + " equivale a R$ " +  real);
		
		input.close();
	}

}
