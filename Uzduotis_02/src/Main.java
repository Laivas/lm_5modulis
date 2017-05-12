import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double a;
		double b;
		double ballV;
		double r;
		double cubeV;
		double waterV;
		
		System.out.println("įveskite kubo kraštinės ilgį");
		
		a = sc.nextDouble();
		
		System.out.println("Įveskite rutulio skersmenį");
		
		b = sc.nextDouble();
		
		sc.close();
		
		r = (b/2.00);
		
		ballV = (double)(4.00/3.00)*Math.PI*(r*r*r);
		
		cubeV = a*a*a;
		
		waterV = cubeV - ballV;
		
		System.out.println("\nKubo tūris "+String.format("%.2f", cubeV));
		
		System.out.println("Rutulio tūris "+String.format("%.2f", ballV));
		
		System.out.println("Vandens tūris "+String.format("%.2f", waterV));
		
	}

}
