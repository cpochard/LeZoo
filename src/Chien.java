
public class Chien extends Canide {

	public Chien(String tmpNom, String tmpEspece, int tmpAge, String tmpMeute) {
		super(tmpNom, tmpEspece, tmpAge, tmpMeute);
	}

	@Override
	public String rassemblerMeute() {
		String ch = super.rassemblerMeute();
		ch+="\nJ'aboie pour pr�venir mon ma�tre !";
		return ch;
	}

}
