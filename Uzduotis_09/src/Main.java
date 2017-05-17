import java.util.Scanner;


public class Main {
	
	public static void main(String[] args) {
		
		System.out.println("Ar galima vaziuoti keliu a?");
		
		boolean a = input();
		
		System.out.println("Ar galima vaziuoti keliu b?");
		boolean b = input();
		
		System.out.println("Ar galima vaziuoti keliu c?");
		boolean c = input();
		
		System.out.println("Ar galima vaziuoti keliu d?");
		boolean d = input();
		
		System.out.println("Ar galima vaziuoti keliu e?");
		boolean e = input();
		
		System.out.println("Ar galima vaziuoti keliu f?");
		boolean f = input();
		
		if(a){
			System.out.println("Is tasko A i taska B patekti galima");
		}else if(e || f) {
			
			if(c || d && b) {
				
				System.out.println("Is tasko A i taska B patekti galima");
				
			}
			
			else if(b || c && d) {
				
				System.out.println("Is tasko A i taska B patekti galima");
				
			}else
			
			System.out.println("Is tasko A i taska B patekti negalima");
				
			}else 
				
				System.out.println("Is tasko A i taska B patekti negalima");
		
	}
	
	public static boolean input() {
		
		Scanner sc = new Scanner(System.in);
		boolean output = false;
		int number;
		do {
		    System.out.println("Iveskite skaiciu: taip = 1, ne = 0");
		    while (!sc.hasNextInt()) {
		        System.out.println("Iveskite skaiciu: taip = 1, ne = 0");
		        sc.next();
		    }
		    number = sc.nextInt();
		    
		} while (number < -1 || number > 1);		
		
		if(number == 1) {
			output = true;
		}
		if(number == 0) {
			output = false;
		}	
		
		return output;
		
	}

}
