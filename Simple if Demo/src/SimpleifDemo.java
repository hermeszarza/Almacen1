import java.util.Scanner;


public class SimpleifDemo {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Inserta un entero: ");
		int numero = input.nextInt();
		
		// Si es m�ltiplo de 5 muestra HiFive
		if (numero % 5 == 0) {
			System.out.println("HiFive");
		}
		
		// Si es m�ltiplo de 2 muestra HiEven
		if (numero % 2 == 0) {
			System.out.println("HiEven");
		}

	}

}
