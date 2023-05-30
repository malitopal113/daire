package Alan_Cevre;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// alan = pi * r *r
		// cevre = 2 * pi * r;
		int r;
		double pi = 3.14;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Daire alan ve çevre Hesaplama");
		System.out.print("Dairenin Yarıçapını Girin: ");
		r = input.nextInt();
		System.out.println("Dairenin Alanı: " + (pi * r * r));
		System.out.println("Dairenin Çevresi: " + (2 * pi * r));
		

	}

}
