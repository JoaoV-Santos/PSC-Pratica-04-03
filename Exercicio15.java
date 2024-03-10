import java.util.Scanner;

public class Exercicio15 {
	public static void main(String[]args) {
		Scanner entrada = new Scanner(System.in);
		double a,b,c,delta,x_1,x_2;
		
		System.out.print("\t\t\t\tCALCULADORA DE EQUAÇÃO DE SEGUNDO GRAU\n\n");
		System.out.print("Insira o valor de a: ");
		a = entrada.nextDouble();
		System.out.print("\nInsira o valor de b: ");
		b = entrada.nextDouble();
		System.out.print("\nInsira o valor de c: ");
		c = entrada.nextDouble();
		
		delta = (b * b) - 4.0 * a * c;
		
		//System.out.print(Math.sqrt(delta));
		x_1 = (- b + Math.sqrt(delta)) / 2 * a;
		x_2 = (- b - Math.sqrt(delta)) / 2 * a;
		
		System.out.println("\n\nDelta = " + delta);
		System.out.println("X1 = " + x_1);
		System.out.println("X2 = " + x_2);
		
		
		entrada.close();
	}

}
