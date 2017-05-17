import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		sc.close();
		
		int d = Math.max(a, Math.max(b, c));
		

		if (a == b && a == c) {

			System.out.println("Trikampis yra lygiakrastis");

		}

		else if (Math.pow(d, 2) == Math.pow(a, 2) + Math.pow(b, 2) || Math.pow(d, 2) == Math.pow(a, 2) + Math.pow(c, 2)
				|| Math.pow(d, 2) == Math.pow(c, 2) + Math.pow(b, 2)) {
			System.out.println("Trikampis yra statusis");
		}
		
		else if (a == b || a == c || b == c) {
			
			System.out.println("Trikampis yra lygiasonis");
			
		}
		else if (a + b < c || a + c < b || c + b < a) {
			 
			System.out.println("Trikampio sudaryti negalima");

		}
		
		else if (a != b || b != c || c != a) {
			
			System.out.println("Trikampis yra ivairiakrastis");
			
		}
		
		
		
	}

}
