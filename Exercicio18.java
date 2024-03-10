import java.util.Scanner;

public class Exercicio18 {
	static public void main(String[]args) {
		Scanner input = new Scanner(System.in);
		double alturaDegrau;
		double alturaEscada;
		double numeroDegraus;
		System.out.print("Qual altura você deseja alcançar em metros? ");
		alturaEscada = input.nextDouble();
		System.out.print("Qual de cada degraus em centímetros? ");
		alturaDegrau = input.nextDouble();
		alturaDegrau = alturaDegrau/100;
		numeroDegraus = alturaEscada / alturaDegrau;
		System.out.printf("Você deverá subir aproximadamente %.0f" , numeroDegraus , " degraus");
		
		
		
		
		input.close();
		
	}

}
