import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		double d;
		double a;
		double V;
		double r;
		
		System.out.println("įveskite apelsino skersmenį");
		
		d = sc.nextDouble();
		
		System.out.println("įveskite apelsino žievelės storį");
		
		a = sc.nextDouble();
		
		sc.close();
		
		r = (d/2)-a;
		
		V = (double)(4.00/3.00)*Math.PI*(r*r*r);

		System.out.println("Apelsino minkštimo tūris: "+String.format("%.2f", V));
		
	}

}
