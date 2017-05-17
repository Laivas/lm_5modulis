import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Kada autobusas isvyko is Vilniaus?");
		
		int vi = sc.nextInt();
		int mi = sc.nextInt();
		
		System.out.println("Kiek laiko autobusas vaziavo is Vilniaus i Panevezi?");
		
		int vp = sc.nextInt();
		int mp = sc.nextInt();
		
		System.out.println("Kelias minutes autobusas stovejo Panevezyje?");
		
		int ms = sc.nextInt();
		
		System.out.println("Kiek laiko autobusas vaziavo is Panevezio i Ryga?");
		
		int vr = sc.nextInt();
		int mr = sc.nextInt();
		
		sc.close();
		
		int v = vi + vp + vr;
		int m = mi + mp + ms + mr;
		
		if(m >= 60) {
			
			v += m / 60;
			m = m % 60;
			
		}
		
		if(v >= 24) {
			
			v = v - 24;
			
		}
		
		System.out.println("Autobusas i Ryga atvyks "+v+" val. "+m+" min.");
		
		
	}

}
