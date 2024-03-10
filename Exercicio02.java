import java.util.Scanner;

public class Exercicio02 {
	public static void main(String[]args) {
		Scanner entrada = new Scanner(System.in);
		double x,y,z;
		System.out.println("Informe o primeiro número");
		x = entrada.nextDouble();
		System.out.println("Informe o segundo número");
		y = entrada.nextDouble();
		z = (x%y);
		
		System.out.println(z);
		entrada.close();
	}

}