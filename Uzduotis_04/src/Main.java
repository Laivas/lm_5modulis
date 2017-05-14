
public class Main {

	public static void main(String[] args) {

		int five = 0;
		int four = 0;
		int three = 0;
		int two = 0;
		int i = 1;

		while (i < 50) {

			if (i % 7 == 0 && i % 3 == 0 && i % 2 == 0) {
				five = i / 7;
				four = i / 3;
				three = i / 2;
				two = i - (five + four + three);
				break;
			}
			i++;
		}
		System.out.println("Kontrolinio rezultatai: ");
		System.out.println("Klasėje mokosi " + i + " mokiniai");
		System.out.println("Klasėje " + five + " mokiniai gavo penketus");
		System.out.println("Klasėje " + four + " mokiniai gavo ketvertus");
		System.out.println("Klasėje " + three + " mokiniai gavo trejetus");
		System.out.println("Klasėje " + two + " mokinių gavo nepatenkinamą pažymį");

	}

}
