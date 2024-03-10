import java.util.Scanner;

public class Exercicio06 {
	public static void main(String[]args){
		
		Scanner input = new Scanner(System.in);
		int anos = 0;
		int dias = 0;
		
		System.out.print("Quantos anos você tem? ");
		anos = input.nextInt();
		dias = anos * 365;
		
		System.out.println("\nVocê já viveu " + dias + " dias");
		
		input.close();
	}

}
