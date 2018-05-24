import java.util.Scanner;

public class ExercicesExceptions {

	public static void start () {

		int dividende = 3;
		int diviseur = 0;
		try {
			int quotient = dividende/diviseur;
		}	
		catch (ArithmeticException e) {
			System.out.println("Message d'erreur : " + e.getMessage());
		}
	}

	public static void start2() {
		String [] tab = new String [3];
		tab[0]="coucou";
		tab[1]="hello";
		tab[2]="salut";
		//On pourrait aussi faire String[]tab = {"coucou", "hello", "salut"};
		boolean b = true;
		while (b==true) {
			System.out.println("Saisissez un chiffre");
			Scanner sc = new Scanner (System.in);			
			try {
				int saisie = Integer.parseInt(sc.nextLine());
				System.out.println(tab[saisie]);
				b=false;
			}
			catch (NumberFormatException e){
				System.out.println("La saisie n'est pas un nombre, réessayez");
				b=true;
			}
			catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("La nombre saisi n'est pas valide, réessayez");
				b=true;
			}
		}
	}

}


