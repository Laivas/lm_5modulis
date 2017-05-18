import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int bm = sc.nextInt();
		int vd = sc.nextInt();
		int pa = sc.nextInt();

		int svbm = sc.nextInt();
		int svvd = sc.nextInt();
		int pasv = sc.nextInt();
		
		int maxKg;

		int trk = sc.nextInt();
		int trkain = sc.nextInt();
		
		sc.close();
		
		bm = bm * trk * trkain;
		vd = vd * trk * trkain;
		pa = pa * trk * trkain;

		if (bm == vd && vd == pa) {

			System.out.println("Pelnas bus vienodas nepriklausomai nuo triusiu rusies");

		}

		if (bm < vd && vd == pa) {

			System.out.println("Auginant Prancuzijos avinus arba Vokietijos demetuosius pelnas bus didziausias");

		}
		if (vd < bm && bm == pa) {

			System.out.println("Auginant Belgijos milzinus arba Prancuzijos avinus pelnas bus didziausias");

		}
		if (pa < bm && bm == vd) {

			System.out.println("Auginant Vokietijos demetuosius arba Belgijos milzinus pelnas bus didziausias");

		}

		if (bm > vd && bm > pa) {
			System.out.println("Auginant Belgijos milzinus pelnas bus didziausias");
		}
		if (vd > bm && vd > pa) {
			System.out.println("Auginant Vokietijos demetuosius pelnas bus didziausias");
		}
		if (pa > bm && pa > vd) {
			System.out.println("Auginant Prancuzijos avinus pelnas bus didziausias");
		}
		
		maxKg = Math.max(svbm, Math.max(pasv, svvd));
		
		if(svvd == pasv && pasv > svbm) {
			System.out.println("Didziausi uzauga Vokietijos demetieji ir Prancuzijos avinai");
		}
		else if(svvd == svbm && svbm > pasv) {
			System.out.println("Didziausi uzauga Vokietijos demetieji ir Belgijos milzinai");
		}
		else if(svbm == pasv && pasv > svvd) {
			System.out.println("Didziausi uzauga Belgijos milzinai ir Prancuzijos avinai");
		}
		
		else if(maxKg == svbm) {
			System.out.println("Didziausi uzauga Belgijos milzinai");
		}
		else if(maxKg == pasv) {
			System.out.println("Didziausi uzauga Prancuzijos avinai");
		}
		else if(maxKg == svvd) {
			System.out.println("Didziausi uzauga Vokietijos demetieji");
		}
		

	}

}
