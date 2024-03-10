import java.util.Scanner;

public class Exercicio10 {
	public static void main(String[]Args) {
		Scanner input = new Scanner(System.in);
		double c;
		double f;
		System.out.print("Insira uma temperatura em Celsius para ser convertida em Farenheit: ");
		c = input.nextDouble();
		f = ((c/5) * 9) + 32;
		System.out.println(c + "ºC equivale a " + f + "F");		
		
		
		input.close();
	}

}
