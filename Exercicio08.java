import java.util.Scanner;

public class Exercicio08 {
	public static void main(String[]args) {
		Scanner input = new Scanner(System.in);
		double metros;
		double centimetros;
		System.out.println("Conversor de Metros Para Centímetros");
		System.out.print("Insira uma medida em metros para ser convertida em centímetros: ");
		metros = input.nextDouble();
		centimetros = (metros*100);
		System.out.println(metros + "m equivalem a " + centimetros + "cm");
		
		input.close();
	}
}
