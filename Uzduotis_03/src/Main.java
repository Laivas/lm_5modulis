import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		double tC;
		double tF;
		double tR;
		double tK;

		System.out.println("Temperatūrų skalės.");
		System.out.println("Įveskite temperatūrą Kelvino skalėje ");

		tK = sc.nextDouble();

		sc.close();

		tC = tK - 273.15;
		tF = tK * 9 / 5 - 459.67;
		tR = tC * 4 / 5;

		System.out.println("1. " + String.format("%.2f", tC) + " Celsijaus laipsnių");
		System.out.println("2. " + String.format("%.2f", tF) + " Farenheito laipsnių");
		System.out.println("3. " + String.format("%.2f", tR) + " Reomiūro laipsnių");
		System.out.println("Programa darbą baigė. Ačiū, kad skaičiavote.");

	}

}
