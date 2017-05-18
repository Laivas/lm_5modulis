import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		sc.close();
		
		int s = a + (b * 2);
		
		if(s >= 60) {
			System.out.println("Dainius nusipirks bilieta P arba A sektoriuje. \nBilietas kainuos 60 euru. ");
		}
		else if(s >= 50) {
			System.out.println("Dainius nusipirks bilieta K arba C sektoriuje. \nBilietas kainuos 50 euru.");
		}
		else if(s >= 40) {
			System.out.println("Dainius nusipirks bilieta D arba J sektoriuje. \nBilietas kainuos 40 euru.");
		}
		else if(s >= 35) {
			System.out.println("Dainius nusipirks bilieta E arba H sektoriuje. \nBilietas kainuos 35 euru.");
		}
		else if(s >= 30) {
			System.out.println("Dainius nusipirks bilieta F arba G sektoriuje. \nBilietas kainuos 30 euru.");
		}else 
			System.out.println("Negales");
		
	}
	
}
